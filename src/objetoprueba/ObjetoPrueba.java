/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoprueba;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ObjetoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Este es un nuevo mensaje");
        String nom;
        nom=JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Su nombre es "+nom);
    }
    
}
