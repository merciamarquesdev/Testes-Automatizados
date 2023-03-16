package service;

import com.ada.carro_devas.model.Carro;
import com.ada.carro_devas.service.CarroService;
import org.junit.Assert;
import org.junit.Test;

public class AssertivasTest {

    //Assert.assertEquals():
    @Test
    public void assertEqualsExemplo() {
        Carro carro1 = new Carro("Fiat");
        Carro carro2 = new Carro("Fiat");

        Assert.assertEquals(carro1, carro2);
        // so é possivel comparar dois objetos se tiver sido
        //implementado um metodo equals(), que ja vem no Object,
    }

    @Test
    public void assertNotEqualsExemplo() {
        Carro carro1 = new Carro("Fiat");
        Carro carro2 = new Carro("Gol");

        Assert.assertNotEquals(carro1, carro2);
    }

    @Test
    public void assertTrueExemplo() {
        Carro carro = new Carro();
        CarroService carroService = new CarroService();
        carroService.ligar(carro);

        Assert.assertTrue(carro.isLigado());
    }

    @Test
    public void assertFalseExemplo() {
        Carro carro = new Carro();

        Assert.assertFalse(carro.isLigado());
    }
    @Test
    public void assertNullExemplo() {
        Carro carro =  null;
        Assert.assertNull(carro);
    }

    @Test
    public void assertNotNullExemplo() {
        Carro carro = new Carro();

        Assert.assertNotNull(carro);
    }

    @Test
    public void assertSameExemplo() {
        Carro carro1 = new Carro(); //obj1
        Carro carro2 = new Carro(); //obj2
        // nao sao o mesmo obj, compara o endereço de memoria
        Assert.assertSame(carro1,carro2); // da false, pois nao sao o msm
    }

    @Test
    public void assertNotSameExemplo() {
        Carro carro1 = new Carro(); //obj1
        Carro carro2 = new Carro(); //obj2
        // nao sao o mesmo obj, compara o endereço de memoria
        Assert.assertNotSame(carro1,carro2); // da true, pois nao sao o msm
    }


}
