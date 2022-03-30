/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author roncr
 */
public class Colaborador extends Persona {
    private String puesto;
    private String departamento;
    private int salario;
    
    public Colaborador(){
    
    }
    
    
    public Colaborador(String puesto, String departamento, int Salario, String nombre, int edad, char genero){
    super(nombre, edad, genero);
    this.puesto=puesto;
    this.departamento=departamento;
    this.salario=Salario;   
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void MostrarDatos(){
    
    JOptionPane.showMessageDialog(null,"el nombre es :"+getNombre()
        + " \n la edad es :"+getEdad()
        + " \n el genere es :"+getGenero()
        + " \n el salario es :"+ salario
            + " \n el puesto es :"+puesto
            + " \n el Departamento es :"+departamento
    );
    
    
    }
    
}
