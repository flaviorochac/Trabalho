package br.univel;

// Trabalho para moldar formas geometricas

import java.util.LinkedList;
import java.util.List;

public class Principal {
	
	public static void main(String [] args){
		List<Desenho> lista = new LinkedList<>();
		
		lista.add(new ExA ());
		lista.add(new ExB ());
		lista.add(new ExC ());
		lista.add(new ExD ());
		lista.add(new ExE ());
		lista.add(new ExF ());
		
		
		for (Desenho d : lista){
			d.desenhar();
		}
	}	
}
