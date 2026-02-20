/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vespertine.padroes;

import com.vespertine.padroes.facade.Amplificador;
import com.vespertine.padroes.facade.HomeTheaterFacade;
import com.vespertine.padroes.facade.Luzes;
import com.vespertine.padroes.facade.Projetor;
import com.vespertine.padroes.facade.StreamingPlayer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mard_
 */
public class Padroes {

    public static void main(String[] args) {
        
        // Singleton
        System.out.println("------------------------");

        Singleton holder = Singleton.getInstance();
        System.out.println(holder);
        holder = Singleton.getInstance();
        System.out.println(holder);
        
        // Strategy
        System.out.println("------------------------");
        
        FreteStrategy sedex = new FreteSedex();
        FreteStrategy pac = new FretePac();
        
        Map<String, FreteStrategy> mapaEstrategias = new HashMap<>();
        mapaEstrategias.put("sedex", sedex);
        mapaEstrategias.put("pac", pac);
        
        CalcularFreteService calculadora = new CalcularFreteService(mapaEstrategias);
        
        double valorSedex = calculadora.executarCalculo("sedex", 5.0);
        System.out.println(valorSedex);
        double valorPac = calculadora.executarCalculo("pac", 5.0);
        System.out.println(valorPac);
        
        // Facade
        System.out.println("------------------------");
        
        Projetor projetor = new Projetor();
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        StreamingPlayer player = new StreamingPlayer();
        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projetor, amplificador, luzes, player);
        
        homeTheater.assistirFilme("Divergente");
        
        System.out.println("---");
        homeTheater.encerrarFilme();
    }
}
