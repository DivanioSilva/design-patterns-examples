package com.ds.designpatternsexamples.builders.ownComplexObjectV2;

import com.ds.designpatternsexamples.builders.myOwnBuilder.Person;
import com.ds.designpatternsexamples.objects.familyObject.Family;
import org.springframework.stereotype.Component;

@Component
public class DefaultFactory {

    public Person.PersonBuilder person(String name){
        return new Person.PersonBuilder(name);
    }

    public Family.FamilyBuilder family(String maeName, String filhoName){
        return new Family.FamilyBuilder(maeName, filhoName);
    }
}
