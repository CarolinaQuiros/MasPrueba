/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class DB_Plantilla <T> {
    
    private ArrayList<T> arreglo;
    
    public DB_Plantilla(){
        arreglo = new ArrayList<T>();
    }
    
    public void guardarAlgo(T t){       
        arreglo.add(t); 
    }
    
    public ArrayList<T> getArreglo() {
        return arreglo;
    }
    
    //Esto metodo me retorna cualquier dato que desee obtener
    public T retornarAlgo(int dato){
        return (T) arreglo.get(dato);
    }
    
    public int getSize(){
        return arreglo.size();
    }
    
    
}
