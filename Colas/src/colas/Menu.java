/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Menu {
    
    public static void main (String arg []){
      int opcion = 0, nodo = 0;
       Cola cola = new Cola();
       Scanner teclado = new Scanner(System.in);
          
        //Menu del programa
        do {
            try {

                System.out.println(
                        "\nMenú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Buscar\n"
                        + "3. Modificar\n"
                        + "4. Eliminar\n"
                        + "5. Ver valores de la cola\n"        
                        + "6. Salir.\n\n");
                  System.out.println("Escoja una opcion: ");
                opcion= teclado.nextInt();
                switch (opcion) {
                    case 1:
                       System.out.println("\n Insertar Nodo en la cola\n");
                       cola.insertarNodo();
                        break;
                        
                    case 2:
                        System.out.println("\nBuscar un Nodo en la cola\n");
                        cola.buscarNodo();
                        break;
                        
                    case 3:
                       System.out.println("\n Modificar un nodo en la cola");
                       cola.modificarNodo();
                        break;
                        
                    case 4:
                      
                   System.out.println("\n Modificar un nodo en la cola");
                       cola.eliminarNodo();
                       
                        break;                                     
                    
                    
                        
                        case 5:
                       
                       System.out.println("Desplegar cola");
                       cola.desplegarCola();
                        break;  
                         case 6:
                       opcion = 6;
                        break;                                     
                    
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                        break;
                }
                

            } catch (NumberFormatException e) {

            }
        } while (opcion != 6);
    }
}


