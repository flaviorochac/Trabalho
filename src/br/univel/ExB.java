package br.univel;

//Trabalho Segunda Forma.

public class ExB implements Desenho {
	
	public static int ALT = 8;

	@Override
	public void desenhar() {
		
		System.out.print("b)\n\n");
		
		int n = ALT;
		for (int l = 0;l < ALT; l++) {
			for (int c = 0; c < n; c++){
				System.out.print("#");
				
			}
			n--;
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
	
}