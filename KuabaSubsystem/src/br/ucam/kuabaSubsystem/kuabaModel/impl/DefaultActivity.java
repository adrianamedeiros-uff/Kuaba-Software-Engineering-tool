package br.ucam.kuabaSubsystem.kuabaModel.impl;

import br.ucam.kuabaSubsystem.repositories.KuabaRepository;
import java.text.ParseException;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;

import br.ucam.kuabaSubsystem.kuabaModel.*;
import java.util.Collections;


//import edu.stanford.smi.protege.model.FrameID;
//import edu.stanford.smi.protegex.owl.model.OWLModel;
//import edu.stanford.smi.protegex.owl.model.RDFProperty;
//import edu.stanford.smi.protegex.owl.model.RDFSLiteral;
//import edu.stanford.smi.protegex.owl.model.impl.DefaultRDFIndividual;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#Activity
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public class DefaultActivity extends DefaultKuabaElement implements Activity {

    public DefaultActivity(String id, KuabaRepository repo) {
        super(id, repo);
    }   


    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasDescription

    
    public String getHasDescription() {
        Collection<String> c = getDataPropertyValues("hasDescription");
        if (!c.isEmpty())
            return c.iterator().next();
        return null;
    }

    public boolean hasHasDescription() {
        return hasProperty("hasDescription");
    }

    public void setHasDescription(String newHasDescription) {
        Collection c = Collections.singleton(newHasDescription);
        setDataPropertyValues("hasDescription", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasExpectedDuration

    public ExpectedDuration getHasExpectedDuration() {
        Collection c = getObjectPropertyValues("hasExpectedDuration");
        if (!c.isEmpty())
            return (ExpectedDuration) c.iterator().next();
        return null;
    }

    public boolean hasHasExpectedDuration() {
        return hasProperty("hasExpectedDuration");
    }

    public void setHasExpectedDuration(ExpectedDuration newHasExpectedDuration) {
        Collection c = Collections.singleton(newHasExpectedDuration);
        setObjectPropertyValues("hasExpectedDuration", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasFinishDate

    public GregorianCalendar getHasFinishDate() {
        Collection<String> c = getDataPropertyValues("hasFinishDate");
        if (c.isEmpty()) return null;
        
        String finishDate = c.iterator().next();
        
        DateParser parser = new DateParser();
        GregorianCalendar gregorianFinishDate = null;
    	try {
    		gregorianFinishDate = parser.toGregorianCalendar(finishDate);	
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		catch (NullPointerException npe) {
			return null;
		}
		
        return gregorianFinishDate;
    }

    public boolean hasHasFinishDate() {
        return hasProperty("hasFinishDate");
    }


    public void setHasFinishDate(GregorianCalendar newHasFinishDate) {
    	
    	DateParser parser = new DateParser();
    	String xmlFormatedDate = parser.toStringFormat(newHasFinishDate);
    	
        Collection c = Collections.singleton(xmlFormatedDate);
        setDataPropertyValues("hasFinishDate", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasName

    public String getHasName() {
        Collection<String> c = getDataPropertyValues("hasName");
        if (c.isEmpty()) return null;
        return c.iterator().next();
    }

    public boolean hasHasName() {
        return hasProperty("hasName");
    }

    public void setHasName(String newHasName) {
        Collection c = Collections.singleton(newHasName);
        setDataPropertyValues("hasName", c);
    }
    

    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasStartDate

    public GregorianCalendar getHasStartDate() {
        Collection<String> c = getDataPropertyValues("hasStartDate");
        if (c.isEmpty()) return null;
        String startDate = c.iterator().next();
        
        DateParser parser = new DateParser();
        GregorianCalendar gregorianStartDate = null;
    	try {    		
    		gregorianStartDate = parser.toGregorianCalendar(startDate);	
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		catch (NullPointerException npe) {
			return null;
		}
		
        return gregorianStartDate;
    }

    public boolean hasHasStartDate() {
        return hasProperty("hasStartDate");
    }


    public void setHasStartDate(GregorianCalendar newHasStartDate) {
    	DateParser parser = new DateParser();
    	String xmlFormatedDate = parser.toStringFormat(newHasStartDate);
    	
        Collection c = Collections.singleton(xmlFormatedDate);
        setDataPropertyValues("hasStartDate", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#involves

    public Collection<ReasoningElement> getInvolves() {
        return getObjectPropertyValues("involves");
    }

    public boolean hasInvolves() {
        return hasProperty("involves");
    }

    public Iterator<ReasoningElement> listInvolves() {
        return getObjectPropertyValues("involves").iterator();
    }

    public void addInvolves(ReasoningElement newInvolves) {
        addObjectPropertyValue("involves", newInvolves);
    }

    public void removeInvolves(ReasoningElement oldInvolves) {
        removeObjectPropertyValue("involves", oldInvolves);
    }

    public void setInvolves(Collection<ReasoningElement> newInvolves) {
            setObjectPropertyValues("involves", newInvolves);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isExecutedBy

    public Collection<Person> getIsExecutedBy() {
        return getObjectPropertyValues("isExecutedBy");
    }

    public boolean hasIsExecutedBy() {
        return hasProperty("isExecutedBy");
    }

    public Iterator<Person> listIsExecutedBy() {
        return getObjectPropertyValues("isExecutedBy").iterator();
    }

    public void addIsExecutedBy(Person newIsExecutedBy) {
        addObjectPropertyValue("isExecutedBy", newIsExecutedBy);
    }

    public void removeIsExecutedBy(Person oldIsExecutedBy) {
        removeObjectPropertyValue("isExecutedBy", oldIsExecutedBy);
    }

    public void setIsExecutedBy(Collection<Person> newIsExecutedBy) {
            setObjectPropertyValues("isExecutedBy", newIsExecutedBy);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#requires

    public Collection<Role> getRequires() {
        return getObjectPropertyValues("requires");
    }

    public boolean hasRequires() {
        return hasProperty("requires");
    }

    public Iterator<Role> listRequires() {
        return getObjectPropertyValues("requires").iterator();
    }

    public void addRequires(Role newRequires) {
        addObjectPropertyValue("requires", newRequires);
    }

    public void removeRequires(Role oldRequires) {
        removeObjectPropertyValue("requires", oldRequires);
    }

    public void setRequires(Collection<Role> newRequires) {     
            setObjectPropertyValues("requires", newRequires);
    }
}