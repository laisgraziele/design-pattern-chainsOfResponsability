
public abstract class Gestor {
	
	public Gestor sucessor;
	public float limite;
	public String cargo;
	
	
	

	public Gestor() {
		super();
	}


	public Gestor(Gestor sucessor) {
		super();
		this.sucessor = null;
	}


	protected Gestor (Gestor sucessor, float limite, String cargo) {
		
		this.sucessor = null;
		this.limite = limite;
		this.cargo = cargo;
		
	}


	public Gestor getSucessor() {
		return sucessor;
	}


	public void setSucessor(Gestor sucessor) {
		this.sucessor = sucessor;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public void ProcessarPedido(Requisicao pedido) {
		
		
		if (pedido.valor <= limite) {
			
			System.out.println("Pedido aprovado!");
			
		} else if (sucessor !=null) {
			
			sucessor.ProcessarPedido(pedido);
			
		} else {
			
			System.out.println("O pedido ultrapassou o limite de valor permitido!");
		}
		
	}
	

	

}
