package com.ada.carro_devas;

import com.ada.carro_devas.model.Carro;
import com.ada.carro_devas.service.CarroService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarroDevasApplication {

    public static void main(String[] args) {
        System.out.println("Funcionou!");
        //-----------------------------------------------------------------------------
        // Cenario 1 - Exemplo prof
        //-----------------------------------------------------------------------------
        System.out.println("Exemplo 1 - prof");
        // Dado: um carro
        CarroService carroService01 = new CarroService();
        Carro carro01 = new Carro();

        // Quando: ligar o carro e acelerar
        carroService01.ligar(carro01);
        carroService01.acelerar(carro01);

        // Então: velocidadeAtual = 10
        System.out.println(carro01.getVelocidadeAtual() == 10); //deve imprimir true
        System.out.println("------------------------------------------------------------------");

        //-----------------------------------------------------------------------------
        // Cenario 2 - Exemplo prof
        //-----------------------------------------------------------------------------
        System.out.println("Exemplo 2 - prof");
        // Dado: um carro
        CarroService carroService02 = new CarroService();
        Carro carro02 = new Carro();

        // Quando: acelerar carro
        carroService02.acelerar(carro02);

        // Então: velocidadeAtual = 0
        System.out.println(carro02.getVelocidadeAtual() == 0); //deve imprimir true, pois o carro ta desligado
        System.out.println("------------------------------------------------------------------");

        //-----------------------------------------------------------------------------
        // Cenario 1 - meus cenarios
        //-----------------------------------------------------------------------------
        System.out.println("Cenario 1 - meus cenarios");
        // Dado: um carro ligado e velocidadeAtual diferente de 0
        CarroService carroService1 = new CarroService();
        Carro carro1 = new Carro();
        carroService1.ligar(carro1);
        carro1.setVelocidadeAtual(50);

        // Quando: desligar carro
        carroService1.desligar(carro1);

        // Então: carro não desliga (pois está em movimento, deveria estar parado para desligar)
        System.out.println(carro1.isLigado() == true); //deve imprimir true
        System.out.println("------------------------------------------------------------------");

        //-----------------------------------------------------------------------------
        // Cenario 2 - meus cenarios
        //-----------------------------------------------------------------------------
        System.out.println("Cenario 2 - meus cenarios");
        // Dado: um carro ligado com velocidadeAtual = velocidadeMaxima = 100
        CarroService carroService2 = new CarroService();
        Carro carro2 = new Carro();
        carroService2.ligar(carro2);
        carro2.setVelocidadeAtual(100);

        // Quando: acelerar carro
        carroService2.acelerar(carro2);

        // Então: nao acelerar e informar que nao pode acelerar, pois o veiculo ja esta na velocidadeMaxima
        System.out.println(carro2.getVelocidadeAtual() <= 100); //deve imprimir true
        System.out.println("------------------------------------------------------------------");

        //-----------------------------------------------------------------------------
        // Cenario 3 - meus cenarios
        //-----------------------------------------------------------------------------
        System.out.println("Cenario 3 - meus cenarios");
        // Dado: um carro desligado
        CarroService carroService3 = new CarroService();
        Carro carro3 = new Carro();

        // Quando: acelerar e frear carro
        carroService3.acelerar(carro3);
        carroService3.frear(carro3);

        // Então: Nao acelerar e nem frear, ou seja, velAtual = 0, informando que o veiculo está desligado
        System.out.println(carro3.getVelocidadeAtual() == 0); //deve imprimir true
        System.out.println("------------------------------------------------------------------");

        //-----------------------------------------------------------------------------
        // Cenario 4 - meus cenarios
        //-----------------------------------------------------------------------------
        System.out.println("Cenario 4 - meus cenarios");
        // Dado: um carro ligado com velocidade menor que 10
        CarroService carroService4 = new CarroService();
        Carro carro4 = new Carro();
        carroService4.ligar(carro4);
        carro4.setVelocidadeAtual(8);

        // Quando: frear carro
        carroService4.frear(carro4);

        // Então: velocidade atual = 0, pois nao pode haver velocidade negativa
        System.out.println(carro4.getVelocidadeAtual() == 0); //deve imprimir true
        System.out.println("------------------------------------------------------------------");
    }
}
