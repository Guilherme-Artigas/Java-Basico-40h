/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Guilherme Estudos
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        a = 3;
        b = 8;
        c = 9;
        boolean r;
        r = a<c || b==a ?true:false;
        System.out.println(r);
    }
    
}
