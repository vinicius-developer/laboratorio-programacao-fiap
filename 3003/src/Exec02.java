import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double h, r, area, valor,  qtde;
		
		System.out.println("Insira a altura do cilindro");
		h = sc.nextDouble();
		
		System.out.println("Insira o raio do cilindo");
		r = sc.nextDouble();
		
		area = 2 * Math.PI * r * (h + r);
		
		qtde = area / 15; 
				
		valor = qtde * 190;
		
		System.out.println("Você precisa mais ou menos " + qtde + " latas de tinta, vai custar: " + valor);
		
		/* È usado para devolver a várivel para o sistema operacional
		 * para que ela não fique ocupando espaço desnecessário na 
		 * memória */
		sc.close();
	}

}
