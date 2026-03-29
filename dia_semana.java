import java.util.Scanner;
public class dia_semana {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 á 7: ");
        int num = entrada.nextInt();
        String semana="";

        if (num == 1){
            semana = "Domingo";
        } else if (num == 2){
            semana = "Segunda";
        } if (num == 3){
            semana = "Terça";
        } else if (num == 4) {
            semana = "Quarta";
        }  if (num == 1){
            semana = "Quinta";
        } else if (num == 5) {
            semana = "Sexta";
        } else if (num == 6){
            semana = "Sabádo";
        }else{
            semana = "opção invalida";
        }
        System.out.println(semana);
    }
}
