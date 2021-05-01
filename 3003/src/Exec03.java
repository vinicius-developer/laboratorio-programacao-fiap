import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double capital, juros, montante;
		int meses;
		
		System.out.println("Insira o capital inicial do seu invesimento: ");
		capital = sc.nextDouble();
		
		System.out.println("Insira a quantidade de juros (0% a 100%)");
		juros = sc.nextDouble();
		
		System.out.println("Insira a quantidade de meses");
		meses = sc.nextInt();
		
		montante = capital * Math.pow(1 + juros / 100, meses);
		
		
		/* Uma das formas de fazer a redução das casas decimais
		 * Desta forma o numero não é alterado só exibido de uma 
		 * forma diferente 
		 * 
		 * %.2f dizendo que queremos duas casa decimais ou duas casa após o pronto flutuante
		 * */
		System.out.println("o valor de montante é: R$" + String.format("%.2f", montante));
		
		sc.close();

	}

}
