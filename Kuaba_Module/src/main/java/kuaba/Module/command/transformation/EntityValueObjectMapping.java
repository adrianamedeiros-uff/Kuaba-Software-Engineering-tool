package kuaba.Module.command.transformation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.modelio.api.modelio.model.IModelManipulationService;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.metamodel.uml.statik.Package;

public class EntityValueObjectMapping extends GeneralMapping{
	

	
    public void mapEntityValueObject(IModelingSession session, IModule module, Package target, Class element) {
    	
    	// Resgata o estereotipo "JavaClass" do metamodelo do "JavaDesigner"
    	Stereotype javaClassStereotype = session.getMetamodelExtensions().getStereotype("JavaDesigner", "JavaClass", module.getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(Class.class));

            try (ITransaction entity = session.createTransaction("Process Entity")) {
            	
            	System.out.println("Entered transaction for Entity");
            	// Dentro desta transação, é gerado uma classe dentro do pacote PSM, marcada como "JavaClass", em seguida são processados seus atributos, operações e associações na nova classe
                Class myClass = session.getModel().createClass(element.getName(), target, javaClassStereotype);
                processAttributes(session, module, myClass, element);
                processOperations(session, module, myClass, element);
                processAssociations(myClass, (Classifier) element, module);
                associationNameSetter(module, session, target, element);
                
                // efetiva a transação
                entity.commit();
            } catch (Exception e) {
            	// Reporta erro ao processar a transação
                module.getModuleContext().getLogService().error(e);
            }
        }
    
    
    public void processAttributes(IModelingSession session, IModule module, Class targetClass, MObject sourceElement) {
        try (ITransaction t = session.createTransaction("Process Attributes")) {
        	// Itera entre os atributos da classe analisada e cria os mesmos atributos dentro da classe alvo (no caso, a que irá para o PSM)
            for (Attribute sourceAttribute : ((Classifier) sourceElement).getOwnedAttribute()) {
                session.getModel().createAttribute(sourceAttribute.getName(), sourceAttribute.getType(), targetClass);
            }
            t.commit();
        } 	catch (Exception e) {
            module.getModuleContext().getLogService().error(e);
        }
    }
    
    
    public void processAssociations(Class myClass, Classifier element, IModule module) {
    	
    	// Resgata uma lista contendo todas as associationEnds do elemento em parâmetro
        EList<AssociationEnd> associationEnds = element.getOwnedEnd();

        List<MObject> associationList = new ArrayList<MObject>();
        
        for (AssociationEnd associationEnd : associationEnds) {
        	associationList.add((MObject) associationEnd);
        }
        
        IModelManipulationService manipulationService = module.getModuleContext().getModelioServices().getModelManipulationService();
        
        // copia a lista de associationEnds do elemento contido no PIM para o novo elemento do PSM
        manipulationService.copyTo(associationList, (MObject) myClass);
    }
    
	
	   public void associationNameSetter(IModule module, IModelingSession session, Package target, Class element) {
		   
		   try (ITransaction t = session.createTransaction("Association Name Setter Transaction")) {
			   
		   EList<AssociationEnd> associationEnds = getElementinTarget(session, module, target, element).getOwnedEnd();
			
			// Itero entre as associationEnds e defino o nome delas como o nome da classe em oposição a classe atual no momento, escrita em minusculo
			
			for (AssociationEnd associationEnd : associationEnds) {
					associationEnd.setName(associationEnd.getOpposite().getOwner().getName().toLowerCase());
				}
				t.commit();
			}
	   }
	   
	   
}
	   



