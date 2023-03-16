package service;

import com.ada.carro_devas.model.Carro;
import com.ada.carro_devas.service.CarroService;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarroServiceTest {

    CarroService carroService;
    @BeforeClass
    public static void beforeClass(){
        // serve pra configurar o q precisa antes dos testes
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        // serve pra configurar o q precisa depois dos testes
        // fechar um banco, fechar conexao, tipo o close scanner
        System.out.println("after class");
    }

    @Before
    public void before(){
        //executa antes de qlqr teste
        carroService = new CarroService();
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    // Cada teste sera em um metodo diferente
    @Test
    public void deveAcelerarCorretamenteUmCarroLigado(){
        // Given:
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
        Carro carro = new Carro();

        // When:
        carroService.ligar(carro);

        //Then:
        Assert.assertTrue(carro.isLigado());
    }

    @Test
    public void carroEmMovimentoNaoPodeSerDesligado() {
//        - Given: Um carro ligado; Um carro andando
        Carro carro = new Carro();
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);
//        - When: Carro desligar
        carroService.desligar(carro);
//        - Then: Carro deve permanecer ligado
        Assert.assertTrue(carro.isLigado());
    }

    @Test
    public void carroNaoPodeUltrapassarVelocidadeMaxima() {
//        - Given: Um carro ligado, Um carro andando na velocidade máxima
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);
        carro.setVelocidadeAtual(carro.getVelocidadeMaxima());
//        - When: Acelerar o carro
        carroService.acelerar(carro, 10);
//        - Then: Carro deve permanecer na velocidade máxima
        Assert.assertEquals(carro.getVelocidadeMaxima(), carro.getVelocidadeAtual());
    }

    @Test
    public void carroDesligadoNaoPodeAcelerar() {
        // Given: um carro desligado
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When: acelerar e frear carro
        carroService.acelerar(carro,20);

        // Then: Nao acelerar e nem frear, ou seja, velAtual = 0
//        Assert.assertFalse(carro.getLigado());
        int velocidadeParada = 0;
        Assert.assertEquals(velocidadeParada, carro.getVelocidadeAtual());
    }

    @Test
    public void carroDesligadoNaoPodeFrear() {
        // Given: um carro desligado
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When: acelerar e frear carro
        carroService.frear(carro, 10);

        // Then: Nao acelerar e nem frear, ou seja, velAtual = 0
        int velocidadeParada = 0;
        Assert.assertEquals(velocidadeParada, carro.getVelocidadeAtual());
    }


}
