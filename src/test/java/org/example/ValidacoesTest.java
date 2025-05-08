package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class ValidacoesTest {
    @Test
    void testInstanciarValidacoes() {
        Validacoes validacoes = new Validacoes();
        assertNotNull(validacoes);
    }

    @Test
    void testEmailValidoComArroba() {
        assertTrue(Validacoes.emailValido("teste@email.com"));
    }

    @Test
    void testEmailInvalidoSemArroba() {
        assertFalse(Validacoes.emailValido("teste.email.com"));
    }

    @Test
    void testEmailNulo() {
        assertFalse(Validacoes.emailValido(null));
    }

    @Test
    void testSenhaForteValida() {
        assertTrue(Validacoes.senhaForte("Teste123"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"senhaminuscula", "SENHAMAIUSCULA", "1234567", "SenhaSemNumero"})
    void testSenhaFraca(String senha) {
        assertFalse(Validacoes.senhaForte(senha));
    }

    @Test
    void testSenhaNula() {
        assertFalse(Validacoes.senhaForte(null));
    }

    @Test
    void testNomeValido() {
        assertTrue(Validacoes.nomeValido("Beatriz Monteiro"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t", "\n"})
    void testNomeInvalido(String nome) {
        assertFalse(Validacoes.nomeValido(nome));
    }
}