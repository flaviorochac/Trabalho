package br.univel;

//Trabalho Primeira Forma.

public class ExE implements Desenho {
	
	public static int ALT = 8;

	@Override
	public void desenhar() {
		
		System.out.print("e)\n\n");
		
		for (int l = 0; l < ALT; l++) {
			for (int c = 0; c < ALT; c++){
				if(c == 0 || c == ALT-1 || l == 0 || l == ALT-1){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}				
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
	
}