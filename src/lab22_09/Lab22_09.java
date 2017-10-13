/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_09;

/**
 *
 * @author archivos
 */
public class Lab22_09 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        String ruta= System.getProperty("user.home");
        ruta=ruta + System.getProperty("file.separator")+"Documents"+System.getProperty("file.separator");
        String nombreArchivo="agenda.ag";
        AccesoAleatorio ac= new AccesoAleatorio();
        ac.escritura(ruta+nombreArchivo);
       
        ac.lectura(ruta+nombreArchivo);
     
       
    }
    
}
