import java.lang.invoke.StringConcatException;

public class Main {
    public static void main(String[] args) throws SumaException, StringConcatException, EdadException, AntiguedadException {
        //EJERCICIOS DE EXCEPCIONES
        //USANDO EL MÉTODO sumaNumeros
        int suma = sumaNumeros(5,700);
        System.out.println("LA SUMA ES: " + suma);

        //USANDO EL MÉTODO contieneCaracter
        contieneCaracter("Juan Carlos Alvarado");

        //USANDO EL MÉTODO calculaPension
        calculaPension(60,35);


    }
    //Crea un metodo que sume 2 números y que lance una excepción personalizada cuando el total de la suma sea mayor a 1,000.
    public static int sumaNumeros(int n1, int n2) throws SumaException {
        int resultadoSuma = n1 + n2;
        if (resultadoSuma > 1000) {
            throw new SumaException("Suma mayor de 1,000");
        }
        return resultadoSuma;
    }
    
    //Crea un metodo que acepte un String como argumento y lance una excepción cuando el String contenga un símbolo “&”
    public static void contieneCaracter(String cadena) throws StringConcatException {
        if (cadena.contains("&")) {
            throw new StringConcatException("cadena con Caracter &");
        } else {
            System.out.println("LA CADENA NO TIENE EL CARACTER &");
        }
    }

    //Crea un metodo que lance 2 excepciones personalizadas (puedes elegir cuales crear) y que tenga un try con 2 bloques catch,
    //cada catch debe atrapar una excepcion diferente y en cada catch mostrar en consola la excepcion.
    //USO DEL MÉTODO, OBTENER EDAD Y ANTIGUEDAD, SI LA EDAD ES IGUAL O MAYOR A 60 O TIENE DE ANTUGEDAD 35, SE PUEDE PENSIONAR LA PERSONA, SE FINALIZA CUANDO UNA DE LAS DOS SE CUMPLA
        public static void calculaPension(int edad, int antiguedad) throws EdadException, AntiguedadException {
        try {
            if (edad >= 60) {
                throw new EdadException("Por la edad puedes pensionarte");
            }
            if (antiguedad >= 35) {
                throw new AntiguedadException("Por antiguedad puedes pensionarte");
            }
        } catch (EdadException edadException) {
            System.out.println("Excepción de Edad activada: " + edadException.getMessage());
            }
            catch (AntiguedadException antiguedadException) {
            System.out.println("Excepción de Antiguedad activada: " + antiguedadException.getMessage());
            }
        }
}