import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {

    @org.junit.jupiter.api.Test
    void suma3Numeros() {
        //given:
        int num1 = 100;
        int num2 = 10;
        int num3 = 90;
        //when:
        int suma = Operaciones.suma3Numeros(num1, num2, num3);
        //then:
        assertEquals(195, suma);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 10, 100",
            "50, 5, 50",
            "80, 8, 80",
            "10, 20, 20"
    })

    void numeroMayor(int numero1, int numero2, int resultadoEsperado) {
        //when:
        int resultado = Operaciones.numeroMayor(numero1, numero2);
        //then:
        assertEquals(resultadoEsperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({
            "50, 10, 30, 15, 105",
            "10, 5, 8, 3, 26",
            "30, 8, 2, 10, 50",
            "10, 20, 20, 10, 60"
    })
    void suma4Numeros(int numero1, int numero2, int numero3, int numero4, int resultadoEsperado) {
        //when:
        int resultado = Operaciones.suma4Numeros(numero1, numero2, numero3, numero4);
        //then:
        assertEquals(resultadoEsperado, resultado);
    }
}