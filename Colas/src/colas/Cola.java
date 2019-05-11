/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Cola {
    Nodo primero;
    Nodo ultimo;
    Scanner teclado = new Scanner(System.in);
    
    public Cola(){
       primero = null;
       ultimo = null;
       
    } 
    public void insertarNodo(){
        Nodo nuevo =new Nodo();
       System.out.print("ingrese el Dato que contendra el nodo: ");
        nuevo.dato = teclado.nextInt();
        if(primero == null){
            primero = nuevo;
            primero.siguiente = null;
            ultimo = primero;
        }else{
                    ultimo.siguiente = nuevo;
                    nuevo.siguiente = null;
                    ultimo = nuevo;
                    }
        System.out.println("\n Nodo Ingresado con exito");
        }
    
        public void desplegarCola(){
            Nodo actual = new Nodo();
            actual = primero;
            if (primero != null){
                while(actual != null){
                    System.out.println(""+ actual.dato);
                    actual = actual.siguiente;
                }
            }else{
                System.out.println("\n La cola esta vacia");
            }           
           }
        
        public void buscarNodo(){
            Nodo actual = new Nodo();
            actual = primero;
            boolean encontrado = false;
            System.out.println("\n Ingresa el dato del nodo a buscar: ");
            int nodoBuscado = teclado.nextInt();
            
            if (primero != null){
                while(actual != null && encontrado !=true){
                    if(actual.dato == nodoBuscado){
                        System.out.println("\n Nodo con el dato " +actual.dato+"Econtado \n ");
                        encontrado = true;
                    }
                
                    System.out.println(" "+ actual.dato);
                    actual = actual.siguiente;
                }
                if(!encontrado){
                    System.out.println("\n Nodo encontrado\n");
                    
                }
            }else{
                System.out.println("\n La cola esta vacia");
            } 
        }
        public void modificarNodo(){
            Nodo actual = new Nodo();
            actual = primero;
            boolean encontrado = false;
            System.out.println("\n Ingresa el dato del nodo a Modificar: ");
            int nodoBuscado = teclado.nextInt();
            
            if (primero != null){
                while(actual != null && encontrado !=true){
                    if(actual.dato == nodoBuscado){
                        System.out.println("\n Nodo con el dato " +actual.dato+"Econtado \n ");
                        System.out.print("Ingrese el nuevo dato para esta nodo: ");
                        actual.dato = teclado.nextInt();
                        System.out.println("\n Nodo Modificado\n");
                        encontrado = true;
                    }
                
                    
                    actual = actual.siguiente;
                }
                if(!encontrado){
                    System.out.println("\n Nodo encontrado\n");
                    
                }
            }else{
                System.out.println("\n La cola esta vacia");
            } 
        }
        public void eliminarNodo(){
            
        
        Nodo actual = new Nodo();
            actual = primero;
            Nodo anterior = new Nodo();
            anterior = null;
            boolean encontrado = false;
            System.out.println("\n Ingresa el dato del nodo a Eliminar: ");
            int nodoBuscado = teclado.nextInt();
            
            if (primero != null){
                while(actual != null && encontrado !=true){
                    if(actual.dato == nodoBuscado){
                        if(actual == primero){
                            primero = primero.siguiente;
                            
                        }else if (actual == ultimo){
                            anterior.siguiente = null;
                            ultimo = anterior;
                        }else{
                            anterior.siguiente = actual.siguiente;
                        }
                        System.out.println("\n Nodo Eliminado ");
                        encontrado = true;
                    }
                
                    anterior=actual;
                    actual = actual.siguiente;
                }
                if(!encontrado){
                    System.out.println("\n Nodo encontrado\n");
                    
                }
            }else{
                System.out.println("\n La cola esta vacia");
            } 
            }
        }

