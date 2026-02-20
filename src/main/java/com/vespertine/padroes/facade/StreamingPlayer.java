/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vespertine.padroes.facade;

/**
 *
 * @author mard_
 */
public class StreamingPlayer {
    void on(){
        System.out.println("Player pronto");
    }
    
    void play(String filme){
        System.out.println("Passando: " + filme);
    }
    
    void off(){
        System.out.println("Player Desligado");
    }
    
}
