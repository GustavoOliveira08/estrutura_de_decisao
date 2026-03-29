import java.util.Scanner;

public class tipo_triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado 1 do triãngulo: ");
        float lado1 = entrada.nextFloat();
        System.out.println("Digite o tamanho do lado 2 do triãngulo: ");
        float lado2 = entrada.nextFloat();
        System.out.println("Digite o tamanho do lado 3 do triãngulo: ");
        float lado3 = entrada.nextFloat();
        boolean triangulo = lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;

        String tipo = "";
        if (triangulo) {
            if (lado1 == lado2 && lado2 == lado3) {
                tipo = "Equilátero";
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }
            System.out.println("Seu triângulo é um " + tipo);
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
