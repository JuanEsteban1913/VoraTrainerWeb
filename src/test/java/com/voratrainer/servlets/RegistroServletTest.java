package com.voratrainer.servlets;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegistroServletTest {

    @Test
    public void debeConvertirCaracteresEspecialesEnHtmlSeguro() {

        String resultado = RegistroServlet.escapeHtml("<script>alert('Hola')</script>");

        String esperado = "&lt;script&gt;alert(&#39;Hola&#39;)&lt;/script&gt;";

        assertEquals(esperado, resultado);
    }

    @Test
    public void debeRetornarTextoVacioCuandoElValorEsNulo() {

        String resultado = RegistroServlet.escapeHtml(null);

        assertEquals("", resultado);
    }

    @Test
    public void debeConvertirElSimboloAmpersand() {

        String resultado = RegistroServlet.escapeHtml("VoraTrainer & Usuarios");

        assertEquals("VoraTrainer &amp; Usuarios", resultado);
    }
}
