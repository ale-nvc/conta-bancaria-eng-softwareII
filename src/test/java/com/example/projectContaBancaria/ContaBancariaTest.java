package com.example.projectContaBancaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContaBancariaTest {

    @Test
    void depositoValido() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void depositoInvalido() {
        ContaBancaria conta = new ContaBancaria();
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

    @Test
    void testeDeOperacoes(){
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(37.89);
        conta.sacar(6.37);
        assertEquals(31.52, conta.getSaldo(), 0.001);
        conta.depositar(100);
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(133));
    }

}