package com.ds.objects.familyObject;

public class Family {
    private Pessoa pai;
    private Pessoa mae;
    private Filho filho;

    /**
     * Just to use in a StaticFactory
     */
    public Family() {
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

        public FamilyBuilder(String maeName, String filhoName) {
            this.filho = new Filho(filhoName);
            this.mae = new Mae(maeName);
            this.pai = new Pai();
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

        public FamilyBuilder paiName(String name){
            this.pai.setName(name);
            return this;
        }

        public Family build(){
            Family family = new Family(this);
            return family;
        }
    }
}
