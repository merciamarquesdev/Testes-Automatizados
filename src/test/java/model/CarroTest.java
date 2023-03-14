package model;

import com.ada.carro_devas.model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroTest {

    @Test
    public void todoCarroDeveIniciarDesligado(){
        // Given
        Carro carro = new Carro();

        // Then
        Assert.assertFalse(carro.isLigado());
    }
}
