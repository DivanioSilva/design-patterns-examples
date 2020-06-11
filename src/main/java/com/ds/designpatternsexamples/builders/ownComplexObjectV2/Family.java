package com.ds.designpatternsexamples.builders.ownComplexObjectV2;

public class Family {
    private Pessoa pai;
    private Pessoa mae;
    private Filho filho;

    private Family() {
    }

    private Family(FamilyBuilder familyBuilder) {
        this.filho = familyBuilder.filho;
        this.mae = familyBuilder.mae;
        this.pai = familyBuilder.pai;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Filho getFilho() {
        return filho;
    }

    public void setFilho(Filho filho) {
        this.filho = filho;
    }

    public static class FamilyBuilder{
        private Pessoa pai;
        private Pessoa mae;
        private Filho filho;

        public FamilyBuilder(String paiName, String maeName, String filhoName) {
            this.filho = new Filho(filhoName);
            this.pai = new Pai(paiName);
            this.mae = new Mae(maeName);
        }

        public FamilyBuilder filhoAge(Integer age){
            this.filho.setAge(age);
            return this;
        }

        public FamilyBuilder paiAge(Integer age){
            this.pai.setAge(age);
            return this;
        }

        public FamilyBuilder maeAge(Integer age){
            this.mae.setAge(age);
            return this;
        }

        public Family build(){
            Family family = new Family(this);
            return family;
        }
    }
}
