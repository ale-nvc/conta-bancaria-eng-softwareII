package com.example.projectContaBancaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContaBancariaTest {

    @Test
    void deveRealizarDepositoValido() {
        // Arrange
        ContaBancaria conta = new ContaBancaria();

        // Act
        conta.depositar(100.0);

        // Assert
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void naoDevePermitirDepositoInvalido() {
        // Arrange
        ContaBancaria conta = new ContaBancaria();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> conta.depositar(-100.0));
    }


    @Test
    void saqueValido(){
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        conta.sacar(45);
        assertEquals(55, conta.getSaldo());
    }

    @Test
    void saqueInvalido(){
        ContaBancaria conta = new ContaBancaria();
        assertThrows(IllegalArgumentException.class,() -> conta.sacar(90));
    }
}