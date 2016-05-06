/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FramePais;
import Vista.FramePersonas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carolina
 */
public class ControladorPrincipal implements ActionListener{

    FramePersonas framePersonas;
    FramePais framePais;
    ControladorPersonas controladorPersonas;
    ControladorPais controladorPais;

    public ControladorPrincipal() {
        controladorPais = new ControladorPais();
        controladorPersonas = new ControladorPersonas();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equalsIgnoreCase("Agregar personas")){
            this.framePersonas = new FramePersonas(controladorPersonas, controladorPais);
            controladorPersonas.setFramePersonas(framePersonas);
            this.framePersonas.agregarAlCombo();
            framePersonas.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Agregar países")){
            this.framePais = new FramePais(controladorPais);
            controladorPais.setFramePais(framePais);
            framePais.show();
        }        
       if (e.getActionCommand().equalsIgnoreCase("Salir")){
           System.exit(0);
       }
    }
    
}
