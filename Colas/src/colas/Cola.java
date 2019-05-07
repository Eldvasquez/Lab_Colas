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
public class Cola {
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    String arr[];
    int maxSize;
    int top;
    
    public Cola(){
       
       UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //Método para saber cuando la pila esta vacia
    public boolean ColaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //Método para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nocdo = new Nodo(nodo);
        nuevo_nocdo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nocdo;
        tamano++;
    }    
    //elimna un nodo de la pila
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    //vacia la pila
    public void VaciarCola(){
        while (!ColaVacia()) {
            EliminarNodo();            
        }
    }
    
    //muestra los valores de la pila
    public void MostrarValores(){
       
    } 
}
