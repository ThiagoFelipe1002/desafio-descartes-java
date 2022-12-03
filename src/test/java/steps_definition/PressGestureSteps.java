package steps_definition;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PressGestureSteps {
    @Dado("^que o usuario esteja na pagina hammer\\.js$")
    public void que_o_usuario_esteja_na_pagina_hammer_js() throws Throwable {
    }

    @Quando("^o usuario efetuar um longclick na caixa verde$")
    public void o_usuario_efetuar_um_longclick_na_caixa_verde() throws Throwable {
    }

    @Entao("^a caixa verde expande de tamanho para (\\d+) x (\\d+)$")
    public void a_caixa_verde_expande_de_tamanho_para_x(int arg1, int arg2) throws Throwable {
    }
}
