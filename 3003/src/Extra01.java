import java.util.Scanner;

public class Extra01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* escrever um porgrama em Java que leia do teclado uma
		 * valor com 3 digitos */

		/* Em seguida inverta o valor e imprima no video*/
		
		Scanner sc = new Scanner(System.in);
		
		int value, p, s, t, reverse;  
		
		
		/* Só functiona para numero com três digitos  */
		System.out.println("Insira um valor");
		value = sc.nextInt();		
		
		p = value / 100;  
		
		s = value / 10 % 10;
				
		t = value % 10;
		
		reverse = (t * 100) + (s * 2) + p;

		/* Aqui também está invertento mas esse valor śo está
		 * sendo imprimido no vídeo e não sendo salvo */
		System.out.println("valor invertido é " + t + s + p);
		
		/* Desta forma ele está imprimento realmente o valor
		 * invertido */
		System.out.println("valor invertido é " + reverse);
		
		
	}
}
