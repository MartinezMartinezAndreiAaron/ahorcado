/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ito.dsos.ahorcado.service;

import ito.dsos.ahorcado.model.AhorcadoModel;
import java.util.List;

/**
 *
 * @author Aaron
 */
public interface AhorcadoService {
    public void createAhorcado (AhorcadoModel cuenta);
    
    public List getAhorcados();
    
    public AhorcadoModel getAhorcado(String nombre);
    
    public void updateAhorcado(AhorcadoModel ahorcadoModel,Integer idAhorcado);
    
    public void deleteAhorcado(Integer idAhorcado);
}
