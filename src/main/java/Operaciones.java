public class Operaciones {

    public static int suma3Numeros(int num1, int num2, int num3) {

        int suma = num1 + num2 + num3;
        if (num1 == 10 || num2 == 10 || num3 == 10) {
            suma -= 5;
        }
        return suma;
    }

    public static int numeroMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static int suma4Numeros(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
