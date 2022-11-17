package atividade2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	comandos Comandos = new comandos();
	
	Scanner teclado = new Scanner(System.in);
	
	int opcao;

	Comandos.novoarray();
	
	for(int i = 0; i < 1;) {
	
		System.out.println("Operação");
        System.out.println("1 = Cadastro de Produto");
        System.out.println("2 = Conssulta de Produto");
        System.out.println("3 = Listar Produtos");
        System.out.println("4 = Exclusão");
        System.out.println("5 = Finalizar");
        System.out.print("Digite o número da operação: ");
        opcao = teclado.nextInt();
        System.out.println();
        
            if(opcao == 1) {
                Comandos.novoproduto();
            }else if(opcao == 2) {
                Comandos.encontrar();
            }else if(opcao == 3){
                Comandos.lista();
            }else if(opcao == 4) {
                Comandos.exclusao();
            }else if(opcao == 5) {
                System.out.println("Operação Encerrada!");
                i++;
            }else {
                System.out.println("Tente Novamente");
            }
	}
	
	
	}
}
