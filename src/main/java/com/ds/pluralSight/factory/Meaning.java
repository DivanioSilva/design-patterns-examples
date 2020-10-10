
package com.ds.pluralSight.factory;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
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
