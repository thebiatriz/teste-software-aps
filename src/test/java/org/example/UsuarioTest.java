package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    void testEqualsMesmoObjeto() {
        Usuario u = new Usuario("Lia", "lia@empresa.com", "Lia123456");
        assertEquals(u, u);
    }

    @Test
    void testEqualsObjetoDiferente() {
        Usuario u = new Usuario("Talita", "talita@empresa.com", "Talita123");
        String outro = "Não é um usuário";
        assertNotEquals(u, outro);
    }

    @Test
    void testEqualsComNull() {
        Usuario u = new Usuario("Lucas", "lucas@empresa.com", "Lucas123");
        assertNotEquals(u, null);
    }
}
