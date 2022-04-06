import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String frase = new String();
		
		System.out.println("digite uma frase: ");
		frase = teclado.nextLine();		
		
		int tamf = frase.length();
		
		char[] vetor = frase.toLowerCase().toCharArray();
	
		String refnum = new String("1234567890");
		String reflet = new String("abcdefghijklmnopqrstuvwxyz");
		int num = 0;
		int esp = 0;
		int let = 0;
		char [] vnum = new char[tamf];
		char [] vlet = new char[tamf];
		
		for(int cont = 0; cont < tamf; cont++) {
				if (refnum.indexOf(vetor[cont]) != -1) {
					num++;
					vnum[num] = vetor[cont];
				}else if (vetor[cont] ==' '){
					esp++;
				}else if (reflet.indexOf(vetor[cont]) != -1) {
					let++;
					vlet[let] = vetor[cont];
			}
		}
		
		System.out.println("\nQuantidade de letras é " + let + ", e as letras são as seguintes:");
		for(int cont = 1; cont <= let; cont++) {
			System.out.print(vlet[cont] + " ");
		}
		System.out.println("\n\nQuantidade de números é " + num + ", e os números são os seguintes:");
		for(int cont = 1; cont <= num; cont++) {
			System.out.print(vnum[cont] + " ");
		}
		System.out.println("\n\nQuantidade de espaços é " + esp);
		
		}
			
	}


