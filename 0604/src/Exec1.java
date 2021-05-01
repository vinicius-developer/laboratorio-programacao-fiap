import java.util.Scanner;

// capturar duas notas, imprimir médias e dizer aprovado ou reprovado
public class Exec1 {
	public static void main(String[] args) {
		
		
		/* Lembrando que o System.in é para 
		 * capturar valores de teclado */
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Insira a primeiro nota");
		nota1 = sc.nextFloat();
		
		System.out.println("Insira a segunda nota");
		nota2 = sc.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("A média do aluno é " + String.format("%.1f" ,media));
		
		if(media >= 6.0) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		/* if Crtl+espaço cria a estrutura do if e else*/
	
		
		sc.close();
		
		
	}
}
