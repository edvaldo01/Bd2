package fila;
/*
 * Classe Fila que instancia uma Fila Simples
 */
public class Fila {
	final int TAMANHO=3;
	
	Object [] lista = new Object[TAMANHO];
	
	public void enfileirar (Object obj){
		for(int i=0;i<lista.length;i++){
			lista[i]= obj;
		}
	}

}
