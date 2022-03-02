package com.ds.designpattern.chainOfResponsability.cardif;

import java.util.List;
import java.util.Optional;

public class RemoveValidationImpl implements RemoveValidationService {

    @Override
    public void validate(Context box) {
        new TokenValidationChain()
                .linkWith(new TokenValidationChain())
                .linkWith(new AreaIdsValidationChain())
                .linkWith(new AppDomainIdValidationChain())
                .verify(box);
    }

    private static class TokenValidationChain extends ValidationStep {

        @Override
        public void verify(Context toValidate) {
            System.out.println("");
            Optional<Object> optionalToken = Optional.of(toValidate.get(BoxFieldType.TOKEN));
            if(optionalToken.isPresent()){
                String token = (String) optionalToken.get();
                System.out.println("Token: "+ token);
            }
            checkNext(toValidate);
        }
    }

    private static class AreaIdsValidationChain extends ValidationStep {

        @Override
        public void verify(Context toValidate) {
            System.out.println("");
            Optional<Object> optionalToken = Optional.of(toValidate.get(BoxFieldType.AREA_IDS));
            if(optionalToken.isPresent()){
                List<String> areaIds = (List<String>) optionalToken.get();
                System.out.println("areaIds" + areaIds);
            }
            checkNext(toValidate);
        }
    }

    private static class AppDomainIdValidationChain extends ValidationStep {

        @Override
        public void verify(Context toValidate) {
            System.out.println("");
            Optional<Object> optionalToken = Optional.of(toValidate.get(BoxFieldType.APP_DOMAIN_ID));
            if(optionalToken.isPresent()){
                String appDomainId = (String) optionalToken.get();
                System.out.println("appDomainId" + appDomainId);
            }
            checkNext(toValidate);
        }
    }
}
