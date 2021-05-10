package com.ds.designpattern.factories.staticFactory;

import com.ds.entities.familyObject.Family;

public class StaticFactory {

    public static Family familyWithMotherAndChild(String maeName, String childName) {
        return new Family.FamilyBuilder(maeName, childName).build();
    }

    public static Family familyWithFatherAndMotherAndChild(String maeName, String childName, String fatherName) {
        return new Family.FamilyBuilder(maeName, childName).paiName(fatherName).build();
    }
}
