import java.util.Scanner;

public class Exec4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		double y, x,resultRaiz;
		
		System.out.println("Insira o valor de x ");
		x = sc.nextInt();
		
		//resultRaiz = Math.pow(x, 2) - 25;
		
		/* 
		if (resultRaiz < 1) {
			System.out.println("Numero negativos não possuem raizes reais");
		} else {
			y = 8 / Math.sqrt(resultRaiz);			
			System.out.println("O valor de Y é " + y);
		}
		*/
		
		if(x > 5 && x < -5) {
			y = 8 / Math.sqrt(Math.pow(x, 2) - 25);			
			System.out.println("O valor de Y é " + y);
		} else {
			System.out.println("Numero negativos não possuem raizes reais");
		}
		
		
		

	}

}
