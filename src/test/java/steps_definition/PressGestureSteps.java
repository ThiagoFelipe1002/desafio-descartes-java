package steps_definition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import page_objects.CaixaVerdePage;

public class PressGestureSteps {
    CaixaVerdePage pageCaixaVerde = new CaixaVerdePage();

    @Dado("^que o usuario esteja na pagina hammer\\.js$")
    public void que_o_usuario_esteja_na_pagina_hammer_js() {
        pageCaixaVerde.abrirPagina();
    }

    @Quando("^o usuario efetuar um longclick na caixa verde$")
    public void o_usuario_efetuar_um_longclick_na_caixa_verde() throws InterruptedException {
        pageCaixaVerde.longclick();
    }

    @Entao("^a caixa verde expande de tamanho para (\\d+) x (\\d+)$")
    public void a_caixa_verde_expande_de_tamanho_para_x(int x, int y)  {
        pageCaixaVerde.fecharPagina();
    }
}
