
package ArchivosAleatorios;

import java.io.IOException;
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) throws IOException {
        archivo archivo= new archivo();
         int r;
        do{
            r=Integer.parseInt(JOptionPane.showInputDialog("Escribir(1)\nLeer(2)\nSalir(3)"));
            switch(r){
                case 1:
                    archivo.escribir();
                    break;
                case 2:
                    archivo.leer();
                    break;
                case 3:
                    break;
            }
        }while(r!=3);

    }
}
