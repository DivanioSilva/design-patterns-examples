package com.ds.builders.ownComplexObjectV2;

import com.ds.builders.myOwnBuilder.Person;
import com.ds.entities.familyObject.Family;
import org.springframework.stereotype.Component;

@Component
public class DefaultFactory {

    public Person.PersonBuilder person(String name) {
        return new Person.PersonBuilder(name);
    }

    public Family.FamilyBuilder family(String maeName, String filhoName) {
        return new Family.FamilyBuilder(maeName, filhoName);
    }
}
