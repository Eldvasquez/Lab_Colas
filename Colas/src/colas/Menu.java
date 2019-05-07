/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Menu {
    
    public static void main (String arg []){
      int opcion = 0, nodo = 0;
       Cola cola = new Cola();
          
        //Menu del programa
        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. Ver si la cola esta vacia\n"
                        + "4. Ver valores de la cola\n"
                        + "5. Borrar cola\n"        
                        + "6. Salir.\n\n"));
                        
                
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Porfavor ingresa el valor a guardar en el nodo"));
                        cola.InsertarNodo(nodo);
                        break;
                        
                    case 2:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                             + cola.EliminarNodo());
                        }else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                        
                    case 3:
                        if(cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO vacia");
                        }
                        break;
                        
                    case 4:
                      
                   cola.MostrarValores();
                       
                        break;                                     
                    
                    
                        
                        case 5:
                       cola.VaciarCola();
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


