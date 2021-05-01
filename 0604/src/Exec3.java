import java.util.Scanner;

public class Exec3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorAPagar, valorCompras, desconto;
		
		System.out.println("Insira o valor todas das compras");
		valorCompras = sc.nextDouble();
		
		if(valorCompras > 1000.00) 
			desconto = valorCompras * 0.15;
		else 
			desconto = valorCompras * 0.08;
		
		 
		valorAPagar = valorCompras - desconto;
		
		System.out.println("O valor total a pagar é " + String.format("%.2f", valorAPagar));
		System.out.println("O valor do desconto é de " + String.format("%.2f", desconto));
		
		sc.close();
	}
}
