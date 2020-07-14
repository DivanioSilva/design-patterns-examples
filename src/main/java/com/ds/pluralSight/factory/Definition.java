
package com.ds.pluralSight.factory;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Definition implements Serializable {

    @SerializedName("meaning")
    private Meaning mMeaning;
    @SerializedName("phonetics")
    private List<Phonetic> mPhonetics;
    @SerializedName("word")
    private String mWord;

    public Definition() {
    }

    public Definition(Meaning mMeaning, List<Phonetic> mPhonetics, String mWord) {
        this.mMeaning = mMeaning;
        this.mPhonetics = mPhonetics;
        this.mWord = mWord;
    }

    public Meaning getMeaning() {
        return mMeaning;
    }

    public void setMeaning(Meaning meaning) {
        mMeaning = meaning;
    }

    public List<Phonetic> getPhonetics() {
        return mPhonetics;
    }

    public void setPhonetics(List<Phonetic> phonetics) {
        mPhonetics = phonetics;
    }

    public String getWord() {
        return mWord;
    }

    public void setWord(String word) {
        mWord = word;
    }

}
