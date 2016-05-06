/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DB_Plantilla;
import Modelo.Pais;
import Vista.FramePais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class ControladorPais implements ActionListener{

    FramePais framePais;
    private ArrayList<String> arreglo;
    Pais pais;
    DB_Plantilla <Pais> plantilla;

    public ControladorPais() {
        this.arreglo = new ArrayList<String>();
        plantilla = new DB_Plantilla<>();
    }

    public void setFramePais(FramePais framePais) {
        this.framePais = framePais;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getActionCommand().equalsIgnoreCase("Guardar")){
            pais = new Pais(framePais.getPais(),framePais.getDias());
            plantilla.guardarAlgo(pais);
            arreglo.add("Zona Indigena");
            arreglo.add(framePais.getPais());
        }  
     if (e.getActionCommand().equalsIgnoreCase("Atras")){
            framePais.setVisible(false);
        }
    }//fin del actionPerformed
    
   
    public ArrayList<String> getArreglo() {
        return arreglo;
    }
}
