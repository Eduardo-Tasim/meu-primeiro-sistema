package br.com.meusistema.main;

import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema...");

        Carro meuCarro = new Carro();
        meuCarro.setModelo("Fusca");
        meuCarro.setCor("Azul");
        meuCarro.setVelocidade(-500);

        Carro meuCarro2 = new Carro();
        meuCarro2.setModelo("Mobi");
        meuCarro2.setCor("Vermelho");
        meuCarro2.setVelocidade(320);

        meuCarro.buzinar();
        meuCarro2.buzinar();
    }
}