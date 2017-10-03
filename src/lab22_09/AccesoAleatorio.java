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
        System.out.println("entra");
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta,"r");
            int var=0;
            if((char)archivo.readByte()=='A')
            {   var++;
                if((char)archivo.readByte()=='G')
                {
                    var++;
                    System.out.println("Archivo compatible");
                    int PosicionDelIndice=archivo.readByte();
                    var++;
                    System.out.println("Posicion del indice "+PosicionDelIndice);
                    archivo.seek(PosicionDelIndice-1);
                    int CantCont=archivo.readByte();
                    var++;
                    System.out.println("Numero de contenedores "+CantCont);
                    int tn=archivo.readByte();
                    var++;
                    for (int i = 0; i < CantCont; i++) {
                        for (int j = 0; j < tn; j++) {
                            System.out.print((char)archivo.readByte());
                            var++;
                            
                        }
                        byte poscel=archivo.readByte();
                        var++;
                        archivo.seek(poscel-1);
                        int cel=archivo.readInt();
                        var=var+4;
                        System.out.println(" Telefono: "+cel);
                        System.out.println("Posicion del telefono "+poscel);
                        System.out.println("numero "+var);
                        archivo.seek(var);
                        tn=archivo.readByte();
                        System.out.println("sig tam nom"+tn);
                    }
                }
            }
            
           
           
            
                
           ///////imprime primer contenedor
           
            /////////////// 
            
            
            
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
            archivo.writeByte('A');//0
            archivo.writeByte('G');//1
            
            //////puntero
            archivo.writeByte(20);//2
            //////contenedores
          
            archivo.writeInt(77677777);//3 4 5 6
            archivo.writeInt(77677775);//8 9 10 11
            archivo.writeInt(77677776);//12 13 14 15
            archivo.writeInt(77677771);//16 17 18 19
            
            //////////indice
             archivo.writeByte(4);//20
             
             /////////////////
            archivo.write(2);
            archivo.writeByte('A');//21
            archivo.writeByte('B');//22
            archivo.writeByte(16);//23
            
            archivo.write(2);
            archivo.writeByte('x');//24
            archivo.writeByte('b');//25
            archivo.writeByte(3);//26
            
            archivo.write(2);
            archivo.writeByte('t');//27
            archivo.writeByte('y');//28
            archivo.writeByte(12);//29
            
            archivo.write(2);
            archivo.writeByte('f');//30
            archivo.writeByte('s');//31
            archivo.writeByte(8);//32
            
            
            archivo.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
