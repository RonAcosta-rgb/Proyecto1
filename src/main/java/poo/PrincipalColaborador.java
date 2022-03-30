/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author roncr
 */
public class PrincipalColaborador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Colaborador datos =new Colaborador();
       datos.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
       datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
       datos.setGenero(JOptionPane.showInputDialog("Digite el genero").charAt(0));
    datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite el salario")));
    datos.setPuesto(JOptionPane.showInputDialog("Digite el Puesto"));
    datos.setDepartamento(JOptionPane.showInputDialog("Digite el Departamento"));
    datos.MostrarDatos();
    }
}
 