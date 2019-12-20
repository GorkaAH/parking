/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;
import NUMERO.Numero;
import java.io.IOException;

/**
 *
 * @author dam
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Parking artesano;
        int opcion;
        Numero n = new Numero();
        artesano=new Parking(5);//Crea Array. [100]/[X]
        artesano.inicializarPlazas();
        menu();
        opcion = n.pedirNumero("", 1, 4);
        while (opcion != 4){
            switch (opcion){
                case 1:
                    artesano.entrada();
                    break;
                case 2:
                    artesano.salida();
                    break;
                case 3:
                    artesano.estadoParking();
                    break;
            }//Switch
            menu();
            opcion = n.pedirNumero("", 1, 4); 
            }//While
        artesano.estadoParking();
    }//main
    
    public static void menu(){
        System.out.println("1.ENTRADA");
        System.out.println("2.SALIDA");
        System.out.println("3.ESTADO PARKING");
        System.out.println("4.FIN");
        System.out.println("OPCION: ");
    }//Menu
}
