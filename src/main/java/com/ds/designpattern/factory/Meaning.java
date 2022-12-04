
package com.ds.designpattern.factory;

import java.util.List;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Meaning {

    @SerializedName("nombre femenino")
    private List<NombreFemenino> mNombreFemenino;

    public List<NombreFemenino> getNombreFemenino() {
        return mNombreFemenino;
    }

    public void setNombreFemenino(List<NombreFemenino> nombreFemenino) {
        mNombreFemenino = nombreFemenino;
    }

}
