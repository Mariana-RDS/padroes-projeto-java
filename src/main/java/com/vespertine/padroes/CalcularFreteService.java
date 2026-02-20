/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vespertine.padroes;

import java.util.Map;

/**
 *
 * @author mard_
 */
public class CalcularFreteService {
    
    private final Map<String, FreteStrategy> estrategias;
    
    public CalcularFreteService(Map<String, FreteStrategy> estrategias){
        this.estrategias = estrategias;
    }
    
    public double executarCalculo(String tipoFrete, double peso){
        FreteStrategy estrategia = estrategias.get(tipoFrete);
        
        if(estrategias == null){
            System.out.println("Tipo de frete inválido!");
        }
        
        return estrategia.calcular(peso);
    }
}
