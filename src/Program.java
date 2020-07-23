import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente();
		SubGerente subGerente = new SubGerente(gerente);
		
		
		Scanner ler = new Scanner(System.in);
	
		 float valorPedido = 0;
		   
		
			
		 while (valorPedido <= gerente.limite) {
			  
			System.out.println("Digite o valor do pedido:");
		
			valorPedido = ler.nextFloat();
		
		    Requisicao pedido = new Requisicao(gerente.limite, "Material Papelaria");
		    
			gerente.ProcessarPedido(pedido);
			subGerente.ProcessarPedido(pedido);
			
		
			
		}
		
		
		 
	}

}
