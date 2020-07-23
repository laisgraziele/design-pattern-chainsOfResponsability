
public class Gerente extends Gestor{
	
	

	

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(Gestor sucessor) {
		super(sucessor);
		// TODO Auto-generated constructor stub
	}

	protected Gerente (Gestor sucessor, float limite, String marca) {
		super(sucessor, limite, marca);
		sucessor = null;
		limite = 300;
		marca = "Gerente";
	}
	
	

}
