package br.univel;

//Trabalho Primeira Forma.

public class ExA implements Desenho {
	
	public static int ALT = 8;

	@Override
	public void desenhar() {
		
		System.out.print("a)\n\n");
		
		int n = 1;
		for (int l = 0;l < ALT; l++) {
			for (int c = 0; c < n; c++){
				System.out.print("#");
				
			}
			n++;
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
	
}
