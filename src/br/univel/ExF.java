package br.univel;

//Trabalho Primeira Forma.

public class ExF implements Desenho {
	
	public static int ALT = 8;

	@Override
	public void desenhar() {
		
		System.out.print("f)\n\n");
		
		int n = 0;
		for (int l = 0; l < ALT; l++) {
			for (int c = 0; c < ALT; c++){
				if(l == 0 || l == ALT-1 || c == n){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}				
			}
			n++;
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
	
}