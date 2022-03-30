
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author roncr
 */
public class Figuras {

    public void cuadrado (){
    int lado, area;
    lado= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
    area = lado * lado;
    JOptionPane.showMessageDialog(null, "El area del cuadrado es :" + area);
    }
    
    public void triangulo (){
    Double base, altura, area;
    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del triangulo"));
    area =(base*altura) / 2;
 
    JOptionPane.showMessageDialog(null, "El area del trinagulo es :" + area);
    }
    
    public void circulo (){
    Double radio, pi=3.14, area;
    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
    area = pi*Math.pow(radio, 2);
    JOptionPane.showMessageDialog(null, "El area del ciruclo es :" + area);
    }
    
}