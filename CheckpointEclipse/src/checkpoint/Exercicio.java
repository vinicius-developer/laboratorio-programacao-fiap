package checkpoint;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcd = new Scanner(System.in);
		
		String comando;
	    int distancia;

	    System.out.println("Insira o a sua primeira ação: ");

	    System.out.print("Qual a direção? (FRENTE, TRÁS, DIREITA, ESQUERDA) ");
	    comando = tcd.next();
	    
	    System.out.println();
	        
	    System.out.print("Quantos blocos você quer andar? (1,9)");
	    distancia = tcd.nextInt();
	        
	    if(comando.equalsIgnoreCase("frente") && distancia == 4) {
	            
	    	System.out.print("Qual a direção? (FRENTE, TRÁS, DIREITA, ESQUERDA) ");
	        comando = tcd.next();
	        
	        System.out.println();
	            
	        System.out.print("Quantos blocos você quer andar? (1,9)");
	        distancia = tcd.nextInt();

	        if(comando.equalsIgnoreCase("direita") && distancia == 5) {
	                
	        	System.out.print("Qual a direção? (FRENTE, TRÁS, DIREITA, ESQUERDA) ");
	            comando = tcd.next();
	            
	            System.out.println();
	                
	            System.out.print("Quantos blocos você quer andar? (1,9)");
	            distancia = tcd.nextInt();

	            if(comando.equalsIgnoreCase("frente") && distancia == 3) {

	            	System.out.print("Qual a direção? (FRENTE, TRÁS, DIREITA, ESQUERDA) ");
	                comando = tcd.next();
	                
	                System.out.println();
	                    
	                System.out.print("Quantos blocos você quer andar? (1,9)");
	                distancia = tcd.nextInt();

	                if(comando.equalsIgnoreCase("direita") && distancia == 3) {

	                	System.out.print("Qual a direção? (FRENTE, TRÁS, DIREITA, ESQUERDA) ");
	                    comando = tcd.next();
	                    
	                    System.out.println();
	                        
	                    System.out.print("Quantos blocos você quer andar? (1,9)");
	                    distancia = tcd.nextInt();

	                    if(comando.equalsIgnoreCase("frente")  && distancia == 3 ) {

	                    	System.out.print("Qual a direção? (FRENTE, TRÁS, DIREITA, ESQUERDA) ");
	                        comando = tcd.next();
	                        
	                        System.out.println();
	                            
	                        System.out.print("Quantos blocos você quer andar? (1,9)");
	                        distancia = tcd.nextInt();

	                        if(comando.equalsIgnoreCase("esquerda") && distancia == 8 ) {

	                        	System.out.print("Qual a direção? (FRENTE, TRÁS, DIREITA, ESQUERDA) ");
	                            comando = tcd.next();
	                            
	                            System.out.println();
	                                
	                            System.out.print("Quantos blocos você quer andar? (1,9)");
	                            distancia = tcd.nextInt();

	                            if(comando.equalsIgnoreCase("frente") && distancia == 6 ) {
	                            	System.out.println("Você ganhou! \uD83C\uDFC6");
	                            } else {
	                            	System.out.println("Você perdeu, game over!");
	                            }
	                        } else {
	                        	System.out.println("Você perdeu, game over!");
	                        }
	                    } else {
	                        System.out.println("Você perdeu, game over!");
	                    }
	                } else {
	                	System.out.println("Você perdeu, game over!");
	                }
	            } else {
	            	System.out.println("Você perdeu, game over!");
	            }
	        } else {
	        	System.out.println("Você perdeu, game over!");
	        }
	    } else {
	    	System.out.println("Você perdeu, game over!");
	    }

	    tcd.close();                    
	}

	
	
}
