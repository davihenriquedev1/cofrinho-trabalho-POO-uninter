package financeiro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);
        
        Cofrinho cofre = new Cofrinho();
        Moeda moeda = null;
        int opcao;
        int opcaoMoeda = 0;
        double valor;
        String tipo;
        
        // Chamando o método menu para exibir o menu do cofre
        cofre.menuCofrinho();
        opcao = teclado.nextInt();
        
        // Processando a opção digitada pelo usuário
        while (opcao !=0) {
            
            // Reiniciando a variável opcaoMoeda
            opcaoMoeda = 0;
            
        	switch(opcao) {
            case 1: 
                System.out.println("Opção 1 selecionada: Adicionar Moedas");
                while(opcaoMoeda > 3 || opcaoMoeda == 0) {
                	Moeda.menuMoeda();
                    opcaoMoeda = teclado.nextInt();
                }
                
                if(opcaoMoeda == 1) {
                	
                	System.out.println("Digite o Valor a ser adicionado");
                	valor = teclado.nextInt();
                	tipo = "Dolar";
                	moeda = new Dolar(valor, tipo);
                	
                } else if(opcaoMoeda == 2) {
                	
                	System.out.println("Digite o Valor a ser adicionado");
                	valor = teclado.nextInt();
                	tipo = "Euro";
                	moeda = new Euro(valor, tipo);
                	
                } else if(opcaoMoeda == 3) {
                	System.out.println("Digite o Valor a ser adicionado");
                	valor = teclado.nextInt();
                	tipo = "Real";
                	moeda = new Real(valor, tipo);
                }
                
                cofre.adicionar(moeda);
                
                break;
            case 2:
                System.out.println("Opção 2 selecionada: Remover Moedas");
                
                while(opcaoMoeda > 3 || opcaoMoeda == 0) {
                	Moeda.menuMoeda();
                    opcaoMoeda = teclado.nextInt();
                }
                
                if(opcaoMoeda == 1) {
                	
                	System.out.println("Digite o Valor a ser removido");
                	valor = teclado.nextInt();
                	tipo = "Dolar";
                	moeda = new Dolar(valor, tipo);
                	
                } else if(opcaoMoeda == 2) {
                	
                	System.out.println("Digite o Valor a ser removido");
                	valor = teclado.nextInt();
                	tipo = "Euro";
                	moeda = new Euro(valor, tipo);
                	
                } else if(opcaoMoeda == 3) {
                	System.out.println("Digite o Valor a ser removido");
                	valor = teclado.nextInt();
                	tipo = "Real";
                	moeda = new Real(valor, tipo);
                }
                
                cofre.remover(moeda);
                break;
                
            case 3: 
                System.out.println("Opção 3 selecionada: Listar Moedas");
                cofre.listar();
                break;
                
            case 4: 
                System.out.println("Opção 4 selecionada: Mostrar Total em Real");
                cofre.totalConvertido();
                break; 	
                
            default:
                System.out.println("Opção inválida");
                break;
             
        	}
        	// Chamando o método menu para exibir o menu do cofre
            cofre.menuCofrinho();
            opcao = teclado.nextInt(); // Lendo a opção do usuário
 
        }
        
        System.out.println("Encerrando...");
        System.out.println("Até mais!");
        teclado.close();

    }
}
