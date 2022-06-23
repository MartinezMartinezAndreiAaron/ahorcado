/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ito.dsos.ahorcado.implement.service;

import ito.dsos.ahorcado.model.AhorcadoModel;
import ito.dsos.ahorcado.repository.AhorcadoRepository;
import ito.dsos.ahorcado.service.AhorcadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aaron
 */
@Service
public class AhorcadoServiceImplement implements AhorcadoService{
    
    @Autowired
    private AhorcadoRepository ahorcadoRepository;

    @Override
    public void createAhorcado(AhorcadoModel cuenta) {
        ahorcadoRepository.save(cuenta);
    }

    @Override
    public AhorcadoModel getAhorcado(String nombre) {
        return ahorcadoRepository.findByNombre(nombre);
    }

    @Override
    public void updateAhorcado(AhorcadoModel ahorcadoModel, Integer idAhorcado) {
        ahorcadoModel.setIdAhorcado(idAhorcado);
        ahorcadoRepository.save(ahorcadoModel);
    }

    @Override
    public void deleteAhorcado(Integer idAhorcado) {
       ahorcadoRepository.deleteById(idAhorcado);
    }

    @Override
    public List getAhorcados() {
        return ahorcadoRepository.findAll();
    }
}
