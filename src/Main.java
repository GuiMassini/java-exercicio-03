import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		char [] palavra = new char[20];
		String entrada = "Hello World";

		System.out.println("Hello World");
		
		for(int i=0;i<entrada.length();i++){
			palavra[i] = entrada.charAt(i);
		}
		
		for(int i=entrada.length();i>0;i--){
			System.out.print(palavra[i-1]);
		}
	   

	}

}
