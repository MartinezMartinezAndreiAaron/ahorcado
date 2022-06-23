/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ito.dsos.ahorcado.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aaron
 */
@Entity
@Table (name = "ahorcado")
public class AhorcadoModel implements Serializable{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAhorcado;
    private String nombre;
    private String palabra;
    private Integer intentos;

    public Integer getIdAhorcado() {
        return idAhorcado;
    }

    public void setIdAhorcado(Integer idAhorcado) {
        this.idAhorcado = idAhorcado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra() {
        String[] palabrasAleatorias= {"nodo","programacion"};
        this.palabra = palabra;
    }

    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }
}

