package steps_definition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.After;
import org.junit.Assert;
import page_objects.QuadroVerdePage;

public class PressGestureSteps {
    QuadroVerdePage pageQuadroVerde = new QuadroVerdePage();

    @Dado("^que o usuario esteja na pagina hammer\\.js$")
    public void que_o_usuario_esteja_na_pagina_hammer_js() {
        pageQuadroVerde.abrirPagina();
    }

    @Quando("^o usuario efetuar um longclick no quadro verde$")
    public void o_usuario_efetuar_um_longclick_no_quadro_verde() throws InterruptedException {
        pageQuadroVerde.getSizeQuadroVerde();
        pageQuadroVerde.longclick();
    }

    @Entao("^o quadro verde expande seu tamanho para (\\d+) x (\\d+)$")
    public void a_quadro_verde_expande_o_tamanho_para_x(int x, int y)  {
        int[] tamanhoReal = pageQuadroVerde.getSizeQuadroVerde();
        int[] tamanhoEsperado = new int[]{x, y};
        Assert.assertArrayEquals(tamanhoEsperado, tamanhoReal);
    }

    @After
    public void AfterAllTest() {
        pageQuadroVerde.fecharPagina();
    }
}
