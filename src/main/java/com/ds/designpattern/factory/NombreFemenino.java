
package com.ds.designpattern.factory;

import java.util.List;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class NombreFemenino {

    @SerializedName("antonyms")
    private List<Object> mAntonyms;
    @SerializedName("definition")
    private String mDefinition;
    @SerializedName("example")
    private String mExample;
    @SerializedName("synonyms")
    private List<Object> mSynonyms;

    public List<Object> getAntonyms() {
        return mAntonyms;
    }

    public void setAntonyms(List<Object> antonyms) {
        mAntonyms = antonyms;
    }

    public String getDefinition() {
        return mDefinition;
    }

    public void setDefinition(String definition) {
        mDefinition = definition;
    }

    public String getExample() {
        return mExample;
    }

    public void setExample(String example) {
        mExample = example;
    }

    public List<Object> getSynonyms() {
        return mSynonyms;
    }

    public void setSynonyms(List<Object> synonyms) {
        mSynonyms = synonyms;
    }

}
