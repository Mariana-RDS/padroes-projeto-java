/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vespertine.padroes.facade;

/**
 *
 * @author mard_
 */
public class HomeTheaterFacade {
    private Projetor projetor;
    private Amplificador amplificador;
    private Luzes luzes;
    private StreamingPlayer player;

    public HomeTheaterFacade(Projetor projetor, Amplificador amplificador, Luzes luzes, StreamingPlayer player) {
        this.projetor = projetor;
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.player = player;
    }
    
    public void assistirFilme(String filme){
        System.out.println("Preparando tudo para o cinema");
        luzes.esmaecer(10);
        projetor.Ligar();
        projetor.modoFilme();
        amplificador.Ligar();
        amplificador.setVolume(20);
        player.on();
        player.play(filme);
    }
    
    public void encerrarFilme(){
        System.out.println("Desligando tudo...");
        luzes.esmaecer(100);
        player.off();
    }
    
}
