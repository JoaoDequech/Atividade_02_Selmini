package atividade2;

import java.util.Scanner;

import java.util.Formatter.*;

public class comandos {
	
	Produto [] produto = new Produto[10];

	public void novoarray () {
		
		for(int i = 0; i < produto.length; i++) {
			produto[i] = new Produto();
		}
			
	}
	
	public void novoproduto () {
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < produto.length; i++) {
			
			if(produto[i].nome.equals("")) {
				System.out.print("Nome do produto --> ");
				produto[i].nome = teclado.nextLine();

				System.out.print("Preço --> ");
				produto[i].valor = teclado.nextDouble();
				
				System.out.print("Quantidade disponível --> ");
				produto[i].qtd = teclado.nextInt();
				
				System.out.println("Cadastro realizado\n");
				
				return;
			}
		
		}
		
		System.out.println( produto.length + "já cadastrados\n");
		
	}
	
	public void encontrar () {
		
		Scanner teclado = new Scanner(System.in);
		
		String pesquisa;
		
		System.out.print("Nome do produto desejado --> ");
		
		pesquisa = teclado.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < produto.length; i++) {
			
			if(pesquisa.equals(produto[i].nome)) {
				
				System.out.println("Código --> " + i);
				
				System.out.println("Nome --> " + produto[i].nome);
				
				System.out.println("Valor --> " + String.format("%.2f", produto[i].valor));
				
				System.out.println("Estoque --> " + produto[i].qtd + "\n");
				
					return;
			}
			
			
			}
		
			System.out.print("Produto não encontrado, Selmini está de sacanagem comigo...\n");
		}
	
	public void lista() {
	
		int teste = 0;
		
		System.out.println("Executando...");
		
		for (int i = 0; i < produto.length; i++) {
			
			if(!produto[i].nome.equals("")) {
				
				System.out.println("Código --> " + i);
				
				System.out.println("Nome --> " + produto[i].nome);
				
				System.out.println(" Valor --> " + String.format("%.2f", produto[i].valor));
				
				System.out.println("Estoque --> " + produto[i].qtd + "\n");
				
			}else {
				
				teste ++;
				
			}
		}
		
		if(teste == produto.length) {
			
			System.out.println("Produtos não cadastrados...\n");
			
		}
		
	}
	
	public void exclusao() {
	
Scanner teclado = new Scanner(System.in);
		
		String pesquisa;
		
		System.out.println("Nome do produto desejado --> ");
		
		pesquisa = teclado.nextLine();
		
		for (int i = 0; i < produto.length; i++) {
			
			if(pesquisa.equals(produto[i].nome)) {
				
				System.out.println("Exlcluindo...");
				
				System.out.println("Nome --> " + produto[i].nome);
				
				System.out.println("Código --> " + i);
				
				produto[i].nome = "";
				produto[i].valor = 0;
				produto[i].qtd = 0;
	
				
					return;
			}
			
			System.out.print("Produto não encontrado, Selmini está de sacanagem comigo...\n");
			
		}
			
	}
	
	
}
