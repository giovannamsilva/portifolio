package multiplos;

import java.util.ArrayList;
import java.util.Collections;

public class Multiplos {
    private int numA;
    private int numB;

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
    
    public String ordemCrescente(int numA, int numB){
        String result = null;
        if (numA > numB){
            result = numB + ", " + numA;
        }else{
            result = numA + ", " + numB;
        }
        return result;
    } 
    
    public String saoMultiplos(int numA, int numB) {
        String result = null;
        if (numA % numB == 0 || numB % numA == 0){
            result = "Os números " + numA+ " e "+ numB +" são múltiplos";
        }else{
            result = "Os números " + numA+ " e "+ numB +" não são múltiplos";
        }
        return result;
    }
}
