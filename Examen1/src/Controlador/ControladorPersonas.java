/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DB_Plantilla;
import Modelo.Fabrica;
import Modelo.Persona;
import Vista.FramePersonas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina
 */
public class ControladorPersonas implements ActionListener {

    ControladorPais controladorPais;
    Fabrica fabrica;
    FramePersonas framePersonas;
    DB_Plantilla <Persona> plantilla;
    int cantidadDias = -1 ;
            
    public ControladorPersonas() {       
        plantilla = new DB_Plantilla<>();
        fabrica = new Fabrica();
        controladorPais = new ControladorPais();
        
    }

    public void setFramePersonas(FramePersonas framePersonas) {
        this.framePersonas = framePersonas;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Guardar")){
           plantilla.guardarAlgo(fabrica.getPersona(framePersonas.getEstatus(),framePersonas.getIdentidad(),
                   framePersonas.getProcedencia(),framePersonas.getPaisOrigen(),framePersonas.getPaisActual(), cantidadDias));
           framePersonas.limpiar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Simular")){
            if(framePersonas.getSimulacion().equals("")){
             JOptionPane.showMessageDialog(null, "Debe digitar un numero");
            }else{
                int contador=1;
                int ramdon1;
                int ramdon2;
                int numero = Integer.parseInt(framePersonas.getSimulacion());
                Random  random = new Random();    
                for(int i=0; i<numero; i++){
                    ramdon1=(int)(random.nextDouble() *controladorPais.getPlantilla().getSize()+0);
                    ramdon2=(int)(random.nextDouble() *plantilla.getSize()+0);
                    //System.out.println(""+(controladorPais.getPlantilla().retornarAlgo(ramdon1).getCupo()-1));
                    
                    if((controladorPais.getPlantilla().retornarAlgo(ramdon1).getCupo()-1)>=0||plantilla.retornarAlgo(ramdon2).getEstatu().equals("Indigena")){
                        JOptionPane.showMessageDialog(null,"si");
                        if(!controladorPais.getPlantilla().retornarAlgo(ramdon1).getCodigo().equals(plantilla.retornarAlgo(ramdon2).getPaisOrige())){
                            if(!controladorPais.getPlantilla().retornarAlgo(ramdon1).getCodigo().equals(plantilla.retornarAlgo(ramdon2).getPaisOrige())){
                            
                                plantilla.retornarAlgo(ramdon2).setPaisActual(controladorPais.getPlantilla().retornarAlgo(ramdon1).getCodigo());
                                controladorPais.getPlantilla().retornarAlgo(ramdon1).restarCupos(contador);
                            }     
                        }else{
                             JOptionPane.showMessageDialog(null,"Imposible realizar tal acción");
                        }
                    }else
                        JOptionPane.showMessageDialog(null,"Alcanzó el cupo máximo");
                    
                    
                
            
            
                }
                
                
                
                
                
                
            
            }
        }
    }
  
}
