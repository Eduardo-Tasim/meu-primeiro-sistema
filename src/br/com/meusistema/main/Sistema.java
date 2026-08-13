package br.com.meusistema.main;

import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema...");

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Azul";

        Carro meuCarro2 = new Carro();
        meuCarro2.modelo = "Mobi";
        meuCarro2.cor = "Vermelho";

        meuCarro.buzinar();
        meuCarro2.buzinar();
    }
}