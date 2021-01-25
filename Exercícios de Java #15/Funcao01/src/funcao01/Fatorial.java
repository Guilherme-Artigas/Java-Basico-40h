package funcao01;

public class Fatorial {
    private int num = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor (int n) {
        num = n;
        int f = 1;
        String s = "";
        
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " X ";
        }
        s += "1 = ";
        fatorial = f;
        formula = s;
    }
    
    public int getFatorial() {
        return fatorial;
    }
    
    public String getFormula() {
        return formula;
    }
}
