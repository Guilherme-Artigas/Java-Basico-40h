package testefuncao03;

public class Operacoes {
    public static String contador(int p1, int p2) {
        String s = "";
        for (int c = p1; c <= p2; c++) {
            s += c + " ";
        }
        return s;
    }
}