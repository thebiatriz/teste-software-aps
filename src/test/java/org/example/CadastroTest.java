package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroTest {

    @Test
    void testInstanciarCadastro() {
        Cadastro cadastro = new Cadastro();
        assertNotNull(cadastro);
    }

    @Test
    void testCadastrarUsuarioValido() {
        Usuario u = Cadastro.cadastrarUsuario("João", "joao@empresa.com", "Senha123");
        assertNotNull(u);
        assertEquals("joao@empresa.com", u.getEmail());
    }

    @Test
    void testCadastrarUsuarioExistente() {
        Usuario u = Cadastro.cadastrarUsuario("João Silva", "joao@empresa.com", "Senha1234");
        assertNull(u);
    }

    @Test
    void testExcluirUsuario() {
        Usuario u = Cadastro.cadastrarUsuario("Maria", "maria@empresa.com", "Senha123");
        assertTrue(Cadastro.excluirUsuario(u));
        assertFalse(Cadastro.excluirUsuario(u));
    }

    @Test
    void testAtualizarUsuario() {
        Usuario u = Cadastro.cadastrarUsuario("Beatriz", "beatriz@empresa.com", "Beatriz123");
        assertNotNull(u);
        assertTrue(Cadastro.atualizarUsuario(u, "Beatriz Monteiro", "beatrizmonteiro@empresa.com", "Beatriz1234"));
    }

    @Test
    void testAtualizarUsuarioNaoExistente() {
        Usuario u = new Usuario("Bia", "bia@empresa.com", "Bia123");
        assertFalse(Cadastro.atualizarUsuario(u, "Outro nome", "outro@empresa.com", "outro1234"));
    }

    @Test
    void testAlterarParcial() {
        Usuario u = Cadastro.cadastrarUsuario("Ian", "ian@empresa.com", "Ian12345");
        assertNotNull(u);

        assertTrue(Cadastro.alterarParcial(u, "nome", "Ian Magalhães"));
        assertEquals("Ian Magalhães", u.getNome());

        assertTrue(Cadastro.alterarParcial(u, "senha", "IanMagalhaes123"));
        assertEquals("IanMagalhaes123", u.getSenha());
    }

    @Test
    void testAlterarEmailParcial() {
        Usuario u = Cadastro.cadastrarUsuario("Lee", "lee@empresa.com", "Lee12345");
        assertNotNull(u);

        assertTrue(Cadastro.alterarParcial(u, "email", "leenovo@empresa.com"));
        assertEquals("leenovo@empresa.com", u.getEmail());
    }

    @Test
    void testAlterarParcialUsuarioInexistente() {
        Usuario u = new Usuario("Gabriel", "gabriel@empresa.com", "Gabriel123");
        assertFalse(Cadastro.alterarParcial(u, "telefone", "Gabriel Atila"));
    }

    @Test
    void testAlterarParcialInexistente() {
        Usuario u = Cadastro.cadastrarUsuario("Min", "min@empresa.com", "Min12345");
        assertNotNull(u);

        assertFalse(Cadastro.alterarParcial(u, "telefone", "987573839"));
    }

    @Test
    void testCadastroFunc0() {
        assertEquals("CADASTRO_0", Cadastro.cadastroFunc0());
    }

    @Test
    void testCadastroFunc1() {
        assertEquals("CADASTRO_1", Cadastro.cadastroFunc1());
    }
}
