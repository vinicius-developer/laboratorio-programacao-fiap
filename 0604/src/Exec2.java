import java.util.Scanner;

/* para fazer o méida ponderada multiplicamos o numero pelo quantidade de porcentamgem  */

public class Exec2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float trabalho1, trabalho2, trabalho3;
		float prova1, prova2;
		double media;
		
		System.out.println("Insiera a nota do primeiro trabalho: ");
		trabalho1 = sc.nextFloat();
				
		System.out.println("Insiera a nota do segundo trabalho: ");
		trabalho2 = sc.nextFloat();
				
		System.out.println("Insiera a nota do terceiro trabalho: ");
		trabalho3 = sc.nextFloat();
		
		System.out.println("insira a nota da primeira prova: ");
		prova1 = sc.nextFloat();
		
		System.out.println("insira a nota da segunda prova: ");
		prova2 = sc.nextFloat();
		
		media = (trabalho1 + trabalho2 + trabalho3) / 3 * 0.2 + (prova1 + prova2) / 2 * 0.7;
		
		
		System.out.println("A media desse aluno é " + String.format("%.2f" ,media));

		if (media >= 6.0) {
			System.out.println("Ele foi a provado");
		} else {
			System.out.println("Ele não foi aprovado");
		}
		
	}
}
