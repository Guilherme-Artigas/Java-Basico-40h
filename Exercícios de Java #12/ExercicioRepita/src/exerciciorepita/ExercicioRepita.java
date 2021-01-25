/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme Estudos
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, soma, q, tp, ti, acima100, media;
        
        soma = 0;
        q = 0;
        tp = 0;
        ti = 0;
        acima100 = 0;
        media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Digite um número:<br> (Valor 0 Interrompe)</html>"));
            soma += n;
            q += 1;
            if (n % 2 == 0) {
                tp += 1;
            } else {
                ti += 1;
            }
            
            if (n > 100) {
                acima100 += 1;
            }
        } while (n != 0);
        q -= 1; // Gambiarra, pois, para sair do laço digitamos 0...
        media = soma / q;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr><br>" + 
                                            "Total de Valores: " + q + "<br>" + 
                                            "Total de Pares : " + tp + "<br>" +
                                            "Total de ímpares: " + ti + "<br>" +
                                            "Acima de 100: " + acima100 + "<br>" +
                                            "Média de todos os valores: " + media + "<br>");
    }
}