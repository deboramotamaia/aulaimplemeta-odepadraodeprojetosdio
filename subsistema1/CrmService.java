package subsistema1;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String Cep,String cidade, String estado){
		System.out.println("Cliente salvo no sistema de CRM.");
		System.out.println(nome);
		System.out.println(Cep);
		System.out.println(cidade);
		System.out.println(estado);

		
			
	}

}
