package br.univel;

// Trabalho para moldar formas geometricas

import java.util.LinkedList;
import java.util.List;

public class Principal {
	
	public static void main(String [] args){
		List<Desenho> lista = new LinkedList<>();
		
		lista.add(new ExA ());
		
		for (Desenho d : lista){
			d.desenhar();
		}
	}	
}
