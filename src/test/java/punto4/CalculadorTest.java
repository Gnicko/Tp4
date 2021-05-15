package punto4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class CalculadorTest {
    @Test
    void calcularJubiladoConDescuetno() {

        int mes = LocalDate.now().getMonth().getValue();

        Calculador calculador = new CalculadorJubilado(new LogTransaction(), mes);

        assertEquals(100, calculador.calcularPrecio(100));
    }

    @Test
    void calcularJubiladoSinDescuetno() {

        int mes = LocalDate.now().minusMonths(1).getMonthValue();

        Calculador calculador = new CalculadorJubilado(new LogTransaction(), mes);

        assertEquals(110, calculador.calcularPrecio(100));
    }

    @Test
    void calcularNOJubiladoSinDescuetno() {

        int mes = LocalDate.now().minusMonths(1).getMonthValue();

        Calculador calculador = new CalculadorNoJubilado(new LogTransaction(), mes);

        assertEquals(121, calculador.calcularPrecio(100));
    }

    @Test
    void calcularNoJubiladoConDescuetno() {

        int mes = LocalDate.now().getMonth().getValue();

        Calculador calculador = new CalculadorNoJubilado(new LogTransaction(), mes);

        assertEquals(115, calculador.calcularPrecio(100));
    }
}
