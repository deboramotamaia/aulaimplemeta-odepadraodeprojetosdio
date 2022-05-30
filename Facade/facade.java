package Facade;

import subsistema1.CrmService;
import subsistema2.CepAPI;

public class facade {

	public void migrarCliente(String nome,String Cep) {
		String cidade = CepAPI.getInstancia().recuperarCidade(Cep);
		String estado = CepAPI.getInstancia().recuperarEstado(Cep);
		
		CrmService.gravarCliente(nome, Cep, cidade, estado);
		

}
}