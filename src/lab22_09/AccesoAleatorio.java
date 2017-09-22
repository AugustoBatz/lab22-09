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
    
    public void lectura(String ruta)
    {
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta,"r");
            System.out.println((char)archivo.readByte());
            System.out.println((char)archivo.readByte());
            
            int PosicionDelIndice=archivo.readByte();
            System.out.println("Posicion del inidice "+PosicionDelIndice);
            archivo.seek(PosicionDelIndice-1);
            int CantCont=archivo.readByte();
            System.out.println("Numero de contenedores "+CantCont);
           
            byte nom[]=new byte[2];
            archivo.read(nom);
            String nomString= new String(nom);
            System.out.println(nomString);
            int DirCont=archivo.readByte();
            archivo.seek(DirCont-1);
            int num=archivo.readInt();
            System.out.println(num);
            
            
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
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
             archivo.writeByte(4);
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
