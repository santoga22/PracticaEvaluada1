/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
        int i = empleados;
        int contador = 0;
        int salarioTotal = 0;
        double rebajaSEM = 0;
        double rebajaIVM = 0;
        double rebajaTotal = 0;
        while (contador < i) {
            contador = contador + 1;
            int salario = Integer.parseInt(JOptionPane.showInputDialog("Salario #" + contador));
            salarioTotal = salario + salarioTotal;
          } 
        rebajaSEM = salarioTotal * 0.0925;
        rebajaIVM = salarioTotal * 0.0508;
        rebajaTotal = rebajaSEM + rebajaIVM;
        JOptionPane.showMessageDialog(null, "La empresa deberá " + "\n"
                                    +"abonar a la CCSS el monto " + "\n"
                                    +"de " + rebajaTotal + "colones" + "\n"
                                    +"por concepto de SEM e IVM"+ "\n");
        
   
      
    }
    
}
