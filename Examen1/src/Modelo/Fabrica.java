/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.FramePersonas;

/**
 *
 * @author Carolina
 */
public class Fabrica {
    
    private Persona persona;
    
    public Persona getPersona(String estatus, String identidad, String procedencia, String paisOrigen, String paisActual){
        
        switch(estatus){
                case "Cuidadano":
                    persona = new Cuidadano(estatus,identidad,procedencia,paisOrigen,paisActual);
                 break;
                case "Indigena":
                    persona = new Indigena(estatus,identidad,procedencia,paisOrigen,paisActual);
                    break;
                case "Migrante":
                    persona = new Migrante(estatus,identidad,procedencia,paisOrigen,paisActual);
                    break;
                case "Refugiado":
                    persona = new Refugiado(estatus, identidad, procedencia, paisOrigen, paisActual);
                    break;
            }
            return persona;
        }
    
}
