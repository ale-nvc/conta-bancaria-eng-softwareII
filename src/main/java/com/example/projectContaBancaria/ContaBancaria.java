package com.example.projectContaBancaria;

public class ContaBancaria {

    private double saldo = 0.0;

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(valor > saldo){
            throw new IllegalArgumentException("O valor do saque não pode ser maior que o saldo total da conta");
        }
        if (valor <= 0){
            throw new IllegalArgumentException("O valor do saque deve ser maior que 0");
        }
        saldo -= valor;
    }

}