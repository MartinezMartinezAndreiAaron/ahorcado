/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ito.dsos.ahorcado.repository;

import ito.dsos.ahorcado.model.AhorcadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aaron
 */
public interface AhorcadoRepository extends JpaRepository<AhorcadoModel, Integer>{
    public AhorcadoModel findByNombre(String nombre);
}
