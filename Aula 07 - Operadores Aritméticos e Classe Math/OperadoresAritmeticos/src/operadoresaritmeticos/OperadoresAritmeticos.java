/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Guilherme Estudos
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float media = (n1+n2) / 2;
        System.out.println("Resultado:" + media);
        
        int numero = 5;
        //numero++;
        //System.out.println("Número anterior de " + numero + " é " + --numero); // Resultado "4"
        System.out.println("Número posterior de " + numero + " é " + ++numero); // Resultado "6"
        
        int x = 4;
        x += 2; // x = x + 2, serve com qualquer operador aritmetico (+, -, *, /, %)
        System.out.println(x);
        
        float v = 8.3f;
        //int arredondamento = (int) Math.floor(v);
        //int arredondamento = (int) Math.ceil(v);
        int arredondamento = (int) Math.round(v);
        System.out.println(arredondamento);
        
        /*
            Gerador de Numeros Aleatorios
            Math.random(); ele vai gerar um número entre 0.0 e 1.0
        */
        double aleatorio = Math.random();
        int n = (int) (5 + aleatorio * (10-5));
        // int n = (int) (15 + aleatorio * (50-15)); outro exemplo com valores diferentes
        System.out.println(n);
    }
}
