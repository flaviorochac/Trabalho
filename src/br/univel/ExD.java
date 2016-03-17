package br.univel;

//Trabalho Primeira Forma.

public class ExD implements Desenho {
	
	public static int ALT = 8;

	@Override
	public void desenhar() {
		
		System.out.print("d)\n\n");
		
		int n = ALT;
		for (int l = 0; l <= ALT; l++) {
			for (int c = 0; c <= ALT; c++){
				if(c > n){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}				
			}
			n--;
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
	
}
