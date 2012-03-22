// $Id: UmlHelperMDRImpl.java 12995 2007-07-08 15:38:55Z bobtarling $
// Copyright (c) 1996-2006 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.model.mdr;

import java.util.Collection;
import java.util.Iterator;

import org.argouml.model.UmlHelper;
import org.omg.uml.behavioralelements.collaborations.Message;
import org.omg.uml.behavioralelements.statemachines.Transition;
import org.omg.uml.foundation.core.AssociationEnd;
import org.omg.uml.foundation.core.Relationship;

/**
 * Helper class for UML metamodel.
 * 
 * @since ARGO0.11.2
 * @author Thierry Lach
 */
class UmlHelperMDRImpl implements UmlHelper {

    /**
     * The model implementation.
     */
    private MDRModelImplementation modelImpl;

    /**
     * Don't allow instantiation.
     * 
     * @param implementation
     *            To get other helpers and factories.
     */
    UmlHelperMDRImpl(MDRModelImplementation implementation) {
        modelImpl = implementation;
    }

    public void addListenersToModel(Object model) {
        // Nothing to do - we get all events automatically
    }

    /*
     * @see org.argouml.model.UmlHelper#deleteCollection(java.util.Collection)
     */
    public void deleteCollection(Collection col) {
        Iterator it = col.iterator();
        while (it.hasNext()) {
            modelImpl.getUmlFactory().delete(it.next());
        }
    }

    /*
     * @see org.argouml.model.UmlHelper#getSource(java.lang.Object)
     */
    public Object getSource(Object relationship) {
        if (relationship instanceof Message) {
            Message message = (Message) relationship;
            return message.getSender();
        }
        if (relationship instanceof Relationship) {
            // handles all children of relationship including extend and
            // include which are not members of core
            return modelImpl.getCoreHelper().getSource(relationship);
        }
        if (relationship instanceof Transition) {
            return modelImpl.getStateMachinesHelper().getSource(relationship);
        }
        if (relationship instanceof AssociationEnd) {
            return modelImpl.getCoreHelper().getSource(relationship);
        }
        throw new IllegalArgumentException();
    }

    /*
     * @see org.argouml.model.UmlHelper#getDestination(java.lang.Object)
     */
    public Object getDestination(Object relationship) {
        if (relationship instanceof Message) {
            Message message = (Message) relationship;
            return message.getSender();
        }
        if (relationship instanceof Relationship) {
            // handles all children of relationship including extend and
            // include which are not members of core
            return modelImpl.getCoreHelper().getDestination(relationship);
        }
        if (relationship instanceof Transition) {
            return modelImpl.getStateMachinesHelper().
                    getDestination(relationship);
        }
        if (relationship instanceof AssociationEnd) {
            return modelImpl.getCoreHelper().getDestination(relationship);
        }
        throw new IllegalArgumentException();
    }

}
