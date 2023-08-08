package IPHONE;

import java.util.Scanner;
import apps_Iphone.AparelhoTelefonico.atender;
import apps_Iphone.AparelhoTelefonico.iniciarCorrerioVoz;
import apps_Iphone.AparelhoTelefonico.ligar;
import apps_Iphone.navegador.Atualizarpagina;
import apps_Iphone.navegador.adicionarNovaAba;
import apps_Iphone.navegador.exibirPagina;
import apps_Iphone.reprodutorMusical.pausar;
import apps_Iphone.reprodutorMusical.selecionarMusica;
import apps_Iphone.reprodutorMusical.tocar;
public class iphoneCel implements atender,iniciarCorrerioVoz,ligar,adicionarNovaAba,Atualizarpagina,exibirPagina,pausar,selecionarMusica,tocar {
    public void atender(){
        System.out.println("ATENDIDO");
    }

    
    public void iniciarCorrerioVoz() {
      System.out.println("CORREIO");
    }


    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }


    @Override
    public void selecionarMusica() {
       System.out.println("ESCOLHA A MUSICA");
       
    }


    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }


    @Override
    public void exibirPagina() {
       System.out.println("EXIBIR");
    }


    @Override
    public void Atualizarpagina() {
       System.out.println("ATUALIZAR");
    }


    @Override
    public void adicionarNovaAba() {
      System.out.println("NOVA ABA");
    }


    @Override
    public void ligar() {
       System.out.println("LIGAR");
       
    }
    
    




}