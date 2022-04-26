import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEjercicioContarLetras {

    @Test
    public void Test01(){

        String palabra="Holaaa!";

        String outputEsperado="{h=1, o=1, l=1, a=3, !=1}";

        String output= EjercicioContarLetras.Repeticiones(palabra);

        Assertions.assertEquals(outputEsperado,output);

        System.out.println("Test 01 realizado");
    }
    @Test
    public void Test02(){

        String palabra="Avion";

        String outputEsperado="{a=1, v=1, i=1, o=1, n=1}";

        String output= EjercicioContarLetras.Repeticiones(palabra);

        Assertions.assertEquals(outputEsperado,output);

        System.out.println("Test 02 realizado");

    }

}
