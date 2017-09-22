/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author archivos
 */
public class AccesoAleatorio {
    
    
    public void escritura(String ruta)
    {
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta,"rw");
            archivo.writeByte('A');
            archivo.writeByte('G');
            
            //////puntero
            archivo.writeByte(20);
            //////contenedores
            archivo.writeInt(77677777);
            archivo.writeInt(77677775);
            archivo.writeInt(77677776);
            archivo.writeInt(77677771);
            
            //////////indice
            archivo.writeByte('A');
            archivo.writeByte('B');
            archivo.writeByte(16);
            
            archivo.writeByte('x');
            archivo.writeByte('b');
            archivo.writeByte(4);
            
            archivo.writeByte('t');
            archivo.writeByte('y');
            archivo.writeByte(12);
            
            
            archivo.writeByte('f');
            archivo.writeByte('s');
            archivo.writeByte(8);
            
            
            archivo.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
