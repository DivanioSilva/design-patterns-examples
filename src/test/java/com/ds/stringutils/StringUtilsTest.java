package com.ds.stringutils;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void isEmptyOrNullTest(){
        String emptyCsv = "";
        String nullCvs = null;

        assertTrue(StringUtils.isEmpty(emptyCsv));
        assertTrue(StringUtils.isEmpty(nullCvs));
    }

    @Test
    public void commaDelemitedListToSetTest(){
        String csv = "Divanio,Arianna,Marianna,Lara";

        Set<String> csvAsSetString = StringUtils.commaDelimitedListToSet(csv);
        assertEquals(4, csvAsSetString.size());
    }

    @Test
    public void defaultIfEmptyTest(){
        String nullString = null;
        String defaultString = "String was empty";
        String result = org.apache.commons.lang3.StringUtils.defaultIfEmpty(nullString, defaultString);
        assertEquals(defaultString, result);
    }

    @Test
    public void commaDelemitedListToArrayTest(){
        String csv = "Divanio,Arianna,Marianna,Lara";

        String[] csvAsArrayString = StringUtils.commaDelimitedListToStringArray(csv);
        assertEquals(4, csvAsArrayString.length);
    }

    @Test
    public void arrayToDelimitedStringTest(){
        String csv = "Divanio,Arianna,Marianna,Lara";

        String expectedResult = "Divanio-Arianna-Marianna-Lara";

        String[] csvAsArrayString = StringUtils.commaDelimitedListToStringArray(csv);
        String result = StringUtils.arrayToDelimitedString(csvAsArrayString, "-");

        assertEquals(expectedResult, result);
    }

    @Test
    public void mergingTwoArraysTest(){
        String csv = "Divanio,Arianna,Marianna,Lara";
        String csvToBeAdd = "Fátima,Mariano";

        String[] csvAsArray = StringUtils.commaDelimitedListToStringArray(csv);
        String[] csvToBeAddArray = StringUtils.commaDelimitedListToStringArray(csvToBeAdd);
        String[] result = ArrayUtils.addAll(csvAsArray, csvToBeAddArray);
        assertEquals(6, result.length);
    }

    @Test
    public void arraysSortTest(){
        String csv = "Divanio,Arianna,Marianna,Lara";
        String csvToBeAdd = "Fátima,Mariano";
        String[] sortedArray = new String[]{"Arianna", "Divanio", "Fátima", "Lara","Marianna", "Mariano"};

        String[] csvAsArray = StringUtils.commaDelimitedListToStringArray(csv);
        String[] csvToBeAddArray = StringUtils.commaDelimitedListToStringArray(csvToBeAdd);
        String[] result = ArrayUtils.addAll(csvAsArray, csvToBeAddArray);
        Arrays.sort(result);
        assertEquals(6, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], sortedArray[i]);
        }
    }
}
