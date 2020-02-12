/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Estudiantes
 */
public class Escritor {
    public static void escribeContenido(String archivo, String texto) throws FileNotFoundException, IOException {
        String cadena;
        FileWriter  f = new FileWriter (archivo);
        BufferedWriter  bw = new BufferedWriter(f);
        bw.write(texto);
        bw.close();
    }
}
