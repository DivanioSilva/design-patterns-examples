package com.ds.designpattern.chainOfResponsability.cardif.v2;

import com.ds.designpattern.chainOfResponsability.cardif.Context;
import com.ds.designpattern.chainOfResponsability.cardif.BoxFieldType;
import com.ds.exceptions.ParamException;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AppIdValidation extends BaseValidation{

    @Override
    public void validate(Context box) throws ParamException {
        final String appDomainId = (String) box.get(BoxFieldType.APP_DOMAIN_ID);
        System.out.println("appDomainId: "+appDomainId);

        if(Objects.isNull(this.nextChain)){
            System.out.println("Último elo da carrente: " + this.getClass().getCanonicalName());
        }else{
            this.nextChain.validate(box);
        }
    }
}
