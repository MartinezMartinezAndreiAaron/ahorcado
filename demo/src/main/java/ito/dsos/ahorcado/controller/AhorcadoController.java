/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ito.dsos.ahorcado.controller;

import ito.dsos.ahorcado.model.AhorcadoModel;
import ito.dsos.ahorcado.service.AhorcadoService;
import ito.dsos.ahorcado.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aaron
 */
@RestController
@RequestMapping("/api/v1/cuenta")
public class AhorcadoController {
    @Autowired
    private AhorcadoService ahorcadoService;
    
    @GetMapping("/{nombre}")
    public CustomResponse getAhorcado(@PathVariable String nombre){
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(ahorcadoService.getAhorcados());
        return customResponse;
    }
    
    @PostMapping("/")
    public CustomResponse createCuenta(@RequestBody AhorcadoModel ahorcado){
        CustomResponse customResponse = new CustomResponse();
        ahorcadoService.createAhorcado(ahorcado);
        return customResponse;
    }
    
    @PutMapping("/{idAhorcado}")
    public CustomResponse updateCuenta(@RequestBody AhorcadoModel ahorcado, @PathVariable Integer idAhorcado){
        CustomResponse customResponse = new CustomResponse();
        ahorcadoService.updateAhorcado(ahorcado, idAhorcado);
        return customResponse;
    }
    
    @DeleteMapping("/{idAhorcado")
    public CustomResponse deleteCuenta(@PathVariable Integer idAhorcado){
        CustomResponse customResponse = new CustomResponse();
        ahorcadoService.deleteAhorcado(idAhorcado);
        return customResponse;
    }
}
