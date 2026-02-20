/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vespertine.padroes.facade;

/**
 *
 * @author mard_
 */
public class Amplificador {
    void Ligar(){
        System.out.println("Amplificador ligado");
    }
    
    void setVolume(int vol){
        System.out.println("Volume ajustado para: " + vol);
    }
    
}
