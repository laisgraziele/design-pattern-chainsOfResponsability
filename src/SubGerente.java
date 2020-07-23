
public class SubGerente extends Gestor{


	
	public SubGerente() {
		super();
		
	}

	public SubGerente(Gestor sucessor) {
		super(sucessor);
		
	}

	protected SubGerente(Gestor sucessor, float limite, String cargo) {
		super(sucessor, limite, cargo);
		sucessor = null;
		limite = 200;
		cargo = "SubGerente";
	}
	
	
	
	

}
