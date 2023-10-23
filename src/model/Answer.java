package model;

import java.io.Serializable;

public class Answer implements Serializable {

    private String variantA;
    private String variantB;
    private String variantC;
    private String variantD;

    public String getVariantA() {
        return variantA;
    }

    public void setVariantA(String variantA) {
        this.variantA = variantA;
    }

    public String getVariantB() {
        return variantB;
    }

    public void setVariantB(String variantB) {
        this.variantB = variantB;
    }

    public String getVariantC() {
        return variantC;
    }

    public void setVariantC(String variantC) {
        this.variantC = variantC;
    }

    public String getVariantD() {
        return variantD;
    }

    public void setVariantD(String variantD) {
        this.variantD = variantD;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "variantA='" + variantA + '\'' +
                ", variantB='" + variantB + '\'' +
                ", variantC='" + variantC + '\'' +
                ", variantD='" + variantD + '\'' +
                '}';
    }
}
