package principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um n�mero inteiro positivo N: ");
		        int n = scanner.nextInt();

		        System.out.println("N�meros primos de 0 at� " + n + ":");
		        for (int i = 2; i <= n; i++) {
		            boolean isPrimo = true;
		            for (int j = 2; j <= Math.sqrt(i); j++) {
		                if (i % j == 0) {
		                    isPrimo = false;
		                    break;
		                }
		            }
		            if (isPrimo) {
		                System.out.println(i + " � primo");
		            }
		        }
		    }
		}


	


