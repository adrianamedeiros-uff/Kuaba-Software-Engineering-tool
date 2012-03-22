package br.ucam.kuabaSubsystem.kuabaModel.impl;

import br.ucam.kuabaSubsystem.repositories.KuabaRepository;
import java.util.*;

import br.ucam.kuabaSubsystem.kuabaModel.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#Role
 *
 * @version generated on Sat Jun 21 10:48:19 BRT 2008
 */
public class DefaultRole extends DefaultKuabaElement implements Role {

    public DefaultRole(String id, KuabaRepository repo) {
        super(id, repo);
    }

    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#hasName

    public String getHasName() {
        Collection<String> c = getDataPropertyValues("hasName");
        if(c.isEmpty()) return null;
        return c.iterator().next();
    }

    public boolean hasHasName() {
        return hasProperty("hasName");
    }


    public void setHasName(String newHasName) {
        Collection c = Collections.singleton(newHasName);
        setDataPropertyValues("hasName", c);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isPerformedBy

    public Collection<Person> getIsPerformedBy() {
        return getObjectPropertyValues("isPerformedBy");
    }

    public boolean hasIsPerformedBy() {
        return hasProperty("isPerformedBy");
    }


    public Iterator<Person> listIsPerformedBy() {
        return getObjectPropertyValues("isPerformedBy").iterator();
    }


    public void addIsPerformedBy(Person newIsPerformedBy) {
        addObjectPropertyValue("isPerformedBy", newIsPerformedBy);
    }


    public void removeIsPerformedBy(Person oldIsPerformedBy) {
        removeObjectPropertyValue("isPerformedBy", oldIsPerformedBy);
    }


    public void setIsPerformedBy(Collection<Person> newIsPerformedBy) {
        setObjectPropertyValues("isPerformedBy", newIsPerformedBy);
    }



    // Property http://www.tecweb.inf.puc-rio.br/DesignRationale/KuabaOntology.owl#isRequiredBy

    public Collection<Activity> getIsRequiredBy() {
        return getObjectPropertyValues("isRequiredBy");
    }

    public boolean hasIsRequiredBy() {
        return hasProperty("isRequiredBy");
    }


    public Iterator<Activity> listIsRequiredBy() {
        return getObjectPropertyValues("isRequiredBy").iterator();
    }


    public void addIsRequiredBy(Activity newIsRequiredBy) {
        addObjectPropertyValue("isRequiredBy", newIsRequiredBy);
    }


    public void removeIsRequiredBy(Activity oldIsRequiredBy) {
        removeObjectPropertyValue("isRequiredBy", oldIsRequiredBy);
    }


    public void setIsRequiredBy(Collection<Activity> newIsRequiredBy) {
        setObjectPropertyValues("isRequiredBy", newIsRequiredBy);
    }
}