package com.pkonopacki1;

public class EncapsulationClass {
    private StringBuilder wrongSbEncapsulation;
    private StringBuilder goodSbEncapsulation;

    public StringBuilder getWrongSbEncapsulation() {
        return wrongSbEncapsulation;
    }
    public void setWrongSbEncapsulation(StringBuilder wrongSbEncapsulation) {
        this.wrongSbEncapsulation = wrongSbEncapsulation;
    }
    public StringBuilder getGoodSbEncapsulation() {
        return goodSbEncapsulation;
    }
    public void setGoodSbEncapsulation(StringBuilder goodSbEncapsulation) {
        this.goodSbEncapsulation = new StringBuilder(goodSbEncapsulation);
    }    
}
