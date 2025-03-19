import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @DisplayName("Comprobar DNI")
    @CsvSource({
            "00000000, T, true",
            "76736880, W, true",
            "12345678, A, false",
            "12345678, B, false",
    })
    void ComprobarDNI(String dni, char letra, boolean resultado) {
        assertEquals(resultado, Main.comprobarDNI(dni, letra));
    }

/*
'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'Q', 'S', 'V', 'H', 'L', 'C', 'K', 'E'
 */
    @ParameterizedTest
    @DisplayName("Calcular Letra Dni")
    @CsvSource({
            "00000000, T",
            "00000001, R",
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P",
            "00000009, D",
            "00000010, X",
            "00000011, B",
            "00000012, N",
            "00000013, J",
            "00000014, Z",
            "00000015, Q",
            "00000016, S",
            "00000017, V",
            "00000018, H",
            "00000019, L",
            "00000020, C",
            "00000021, K",
            "00000022, E",

    })
    void CalcularLetraDni(String dni, char letra) {
        assertEquals(letra, Main.calcularLetraDNI(dni));
    }

    @Test
    @DisplayName("Verifica si el tamaño es correcto")
    public void testDNITamañoCorrecto() {
        String dni = "12345678";
        assertEquals(8, dni.length());
    }

    @Test
    @DisplayName("Verifica si el tamaño no es correcto")
    public void testDNITamañoIncorrecto() {
        String dni = "1234567"; // Ejemplo de DNI con tamaño incorrecto
        assertNotEquals(8, dni.length());
    }

}


