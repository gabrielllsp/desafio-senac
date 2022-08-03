import java.util.Scanner;

public class Main {
    /*
     * Gabriel de Almeida
     * Data: 23/06/2022
     */
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double N1, N2;
            double Resultado;


            System.out.println("Inicio da Missao 4 Desafio Maximo.");
            Calculadora CL = new Calculadora();


            System.out.println("Digite o Primeiro numero: ");
            N1 = entrada.nextDouble();

            System.out.println("Digite o Segundo numero: ");
            N2 = entrada.nextDouble();


            Resultado = CL.Somar(N1, N2);
            System.out.println("O Resultado da Soma e: " + Resultado);

            Resultado = CL.Subtrair(N1, N2);
            System.out.println("O Resultado da Subtracao e: " + Resultado);

            Resultado = CL.Multiplicar(N1, N2);
            System.out.println("O resultado da Multiplicacao e: " + Resultado);

            Resultado = CL.Dividir(N1, N2);
            System.out.println("O Resultado da Divisao e: " + Resultado);
        }

}