/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String opcion =JOptionPane.showInputDialog("desea leer digite 1 escribir cualquier tecla");
        if(opcion.equals("1")){
            Lector leer = new Lector();
            leer.muestraContenido("C:\\Users\\Estudiantes\\Documents\\NetBeansProjects\\Archivos\\src\\archivos\\archivo.txt");
        }else{
            String cadena = JOptionPane.showInputDialog("digite el texto para el archivo");
            Escritor escribir = new Escritor();
            escribir.escribeContenido("C:\\Users\\Estudiantes\\Documents\\NetBeansProjects\\Archivos\\src\\archivos\\archivo.txt", cadena);
        }
    }
    
}
