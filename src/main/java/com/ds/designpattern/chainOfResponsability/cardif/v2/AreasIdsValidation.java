package com.ds.designpattern.chainOfResponsability.cardif.v2;

import com.ds.designpattern.chainOfResponsability.cardif.Context;
import com.ds.designpattern.chainOfResponsability.cardif.BoxFieldType;
import com.ds.exceptions.ParamException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class AreasIdsValidation extends BaseValidation{

    @Override
    public void validate(Context box) throws ParamException {
        final List<String> areas = (List<String>) box.get(BoxFieldType.AREA_IDS);
        System.out.println("areas: "+areas);

        if(Objects.isNull(this.nextChain)){
            System.out.println("Último elo da carrente: " + this.getClass().getCanonicalName());
        }else{
            this.nextChain.validate(box);
        }
    }
}
