/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.portfolio.cmgm.Dto;

import javax.validation.constraints.NotBlank;

public class dtoAcercade {
    @NotBlank
    private String descripcionA;
    
    // Constructor
    public dtoAcercade() {
    }

    public dtoAcercade(String descripcionA) {
        this.descripcionA = descripcionA;
    }
    
    // Getter and Setter
    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }
    
}
