package com.ada.carro_devas;

public @interface Enunciado {
    /**
     * Um carro tem os seguintes atributos:
     * - cor
     * - marca
     * - ano
     * - ligado
     * - velocidadeAtual
     * Enquanto o carro estiver desligado deve ser capaz de:
     * - Ligar
     * - Motrar estado atual
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     * Regras:
     * - O carro não pode passar de sua velocidade máxima
     * - Só podemos realizar as ações com o carro ligado
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Não existe velocidade negativa

     -------------------------------------------------------------------------------
     Cenario 1:
     -------------------------------------------------
     Dado: Um carro desligado
     Quando: Ligar carro
     Entao: Carro deve estar ligado
     -------------------------------------------------
     Cenario 2:
     -------------------------------------------------
     Dado: Um carro ligado
     Quando: Frear carro
     Entao: A velocidade fica 0
     -------------------------------------------------
     Cenario 3:
     -------------------------------------------------
     Dado: Um carro ligado e velAtual diferente de 0
     Quando: Desligar carro
     Entao: Carro nao desliga
     -------------------------------------------------
     Cenario 4:
     -------------------------------------------------
     Dado: Carro ligado
     Quando: acelerar carro
     Entao: entao velocidadeAtual < velocidadeMaxima
     -------------------------------------------------
     Cenario 5:
     -------------------------------------------------
     Dado: Um carro ligado
     Quando: Desligar carro
     Entao: Carro deve estar desligado e velocidade é 0
     -------------------------------------------------
     Cenario 6:
     -------------------------------------------------
     Dado: Carro desligado
     Quando: Acelerar e frear carro
     Entao: Nada ocorre, pois o carro está desligado

     */
}
