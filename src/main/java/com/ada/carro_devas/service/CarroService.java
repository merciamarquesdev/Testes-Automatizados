package com.ada.carro_devas.service;
import com.ada.carro_devas.model.Carro;

public class CarroService {
        public void acelerar(Carro carro, int velocidade){
                if (carro.isLigado() && (carro.getVelocidadeAtual()+velocidade) <= 100 && carro.getVelocidadeAtual() >= 0){
                        carro.setVelocidadeAtual(carro.getVelocidadeAtual()+velocidade);
                }
                else if (carro.isLigado() == false){
                        System.out.println("Erro: Não é possível acelerar, pois o veículo está desligado.");
                }
                else {
                        System.out.println("Erro: Não é possível acelerar, pois o veículo está na velocidade máxima.");
                }

        }
        public void frear(Carro carro){
                if (carro.isLigado() && carro.getVelocidadeAtual() >= 10){
                        carro.setVelocidadeAtual(carro.getVelocidadeAtual()-10);
                }
                else if (carro.isLigado() == false){
                        System.out.println("Erro: Não é possível frear, pois o veículo está desligado.");
                }
                else {
                        carro.setVelocidadeAtual(0); //quando velocidade atual for menor que 10
                }

        }
        public void ligar(Carro carro){
                carro.setLigado(true);
        }
        public void desligar(Carro carro){
                if(carro.getVelocidadeAtual() == 0){
                        carro.setLigado(false);
                }
        }
        public String estadoAtual(Carro carro){
                return carro.toString();
        }
}
