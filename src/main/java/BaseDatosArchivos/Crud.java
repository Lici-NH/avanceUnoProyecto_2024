/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatosArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ALIS
 */
public class Crud {
    
    public boolean escrituraDB (String nombreDB, String contenido)
    {
        
           boolean estadoEscritura = false;
           String Proyecto = "baseD";
           String nombreArchivo = nombreDB + ".txt";
           File carpeta = new File (Proyecto);
           File f = new File (carpeta, nombreArchivo);
            
            try {
                        FileWriter fw = new FileWriter(f, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write (contenido+"\n");
                        bw.close();
                    } catch (IOException ex) {
  
    System.out.println ("Error:" + ex);
}
            
            return estadoEscritura;
    }    
    
}
