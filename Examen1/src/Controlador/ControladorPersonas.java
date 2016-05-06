/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DB_Plantilla;
import Modelo.Persona;
import Vista.FramePersonas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class ControladorPersonas implements ActionListener {

    Persona persona;
    FramePersonas framePersonas;
    DB_Plantilla <Persona> plantilla;

    public ControladorPersonas() {       
        plantilla = new DB_Plantilla<>();
        
    }

    public void setFramePersonas(FramePersonas framePersonas) {
        this.framePersonas = framePersonas;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Guardar")){
            //persona = new Persona()
        }
    }
    
}
