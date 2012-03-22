// $Id: ModelUtils.java 13850 2007-12-02 01:03:27Z tfmorris $
// Copyright (c) 2007 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies. This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason. IN NO EVENT SHALL THE
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

package org.argouml.profile.internal;

import java.util.Collection;

import org.argouml.model.Model;

/**
 * Helper utility methods for searching the model.
 *
 * @author maurelio1234
 */
public class ModelUtils {
    /**
     * Finds a type in a model by name
     * 
     * @param s the type name
     * @param model the model
     * @return the type or <code>null</code> if the type has not been found.
     */
    public static Object findTypeInModel(String s, Object model) {

        if (!Model.getFacade().isANamespace(model)) {
            throw new IllegalArgumentException(
                    "Looking for the classifier " + s
                    + " in a non-namespace object of " + model
                    + ". A namespace was expected.");
        }

        Collection allClassifiers =
            Model.getModelManagementHelper()
                .getAllModelElementsOfKind(model,
                        Model.getMetaTypes().getClassifier());

        for (Object classifier : allClassifiers) {
            if (Model.getFacade().getName(classifier) != null
                        && Model.getFacade().getName(classifier).equals(s)) {
                return classifier;
            }
        }

        return null;
    }

}
