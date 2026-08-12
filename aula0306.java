//Crie um programa em Python que implementa uma função que retorna uma lista preenchida com valores inteiros aleatórios. A função deve receber como parâmetro o tamanho da lista. O tamanho deve ser informado pelo usuário via input.

//Para cada número da lista, imprima:

//Se o número é múltiplo de 3
//Se o número é par
//Se o número é ímpar


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class aula01 {
    public static int[] criarLista(int tamanho){
        Random random = new Random();
        int[] numeros = new int[tamanho];
        //declarar contador, condição, incremento do contador
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =  random.nextInt(1000) + 1 ;
        }
        return numeros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho:");
        int tamanho = sc.nextInt();

        int [] numeros = criarLista(tamanho);

        //for numero in lista
        for(int numero : numeros) {
            System.out.println("Número: " + numero);
            if(numero % 3 == 0 ) {
                System.out.println("O número é multiplo por 3");
            } else if (numero % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é ímpar");
            }
        }
    }
}

