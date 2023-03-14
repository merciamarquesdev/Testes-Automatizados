package service;

import com.ada.carro_devas.model.Carro;
import com.ada.carro_devas.service.CarroService;
import org.junit.Assert;
import org.junit.Test;


public class CarroServiceTest {

    // Cada teste sera em um metodo diferente
    @Test
    public void deveAcelerarCorretamenteUmCarroLigado(){
        // Given:
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When:
        carroService.acelerar(carro,30);

        // Sempre que um metodo de teste nao possuir um assert ele vai passar
        // Then - Asserts:
        int velocidadeEsperada = 30;
        Assert.assertEquals(velocidadeEsperada,carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamente(){
        // Given:
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When:
        carroService.ligar(carro);

        //Then:
        Assert.assertTrue(carro.isLigado());
    }


}
