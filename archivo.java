
package ArchivosAleatorios;

import java.io.*;
import javax.swing.JOptionPane;


public class archivo {


   public void escribir() throws IOException{
       String texto;
        texto=JOptionPane.showInputDialog("Ingrese algo: ");

        try{
       RandomAccessFile escribe= new RandomAccessFile("Aleatorio.txt","rw");
       escribe.seek(escribe.length());
       escribe.writeUTF(texto);
       escribe.close();

       }catch(IOException ex){}
        JOptionPane.showMessageDialog(null, "Dato escrito crrectamente...");
   }

   public void leer()throws IOException{
       String texto;
       RandomAccessFile leer= new RandomAccessFile("Aleatorio.txt","r");
       leer.seek(0);
        try{
       while((texto=leer.readUTF())!=null){
           System.out.println(texto+'\t');
       }
      leer.close();

       }catch(IOException ex){}
        JOptionPane.showMessageDialog(null, "Datos mostrados en consola...");
   }

}
