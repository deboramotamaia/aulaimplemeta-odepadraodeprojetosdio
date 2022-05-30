package subsistema2;


public class CepAPI {
	
		private static CepAPI instancia = new CepAPI();
		
		private CepAPI() {
			super();
		}
		
		public static CepAPI getInstancia() {
			return instancia;
		}
		
		public String recuperarCidade(String Cep) {
			return "São Carlos";			
		}
		public String recuperarEstado(String Cep) {
			return "SC";
		}

}
