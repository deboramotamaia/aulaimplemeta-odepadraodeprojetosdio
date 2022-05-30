package one.digitalinnovation.gof2;

/**
 * Singleton "preguicoso"
 * 
 * @author maia_
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
			
		}
		return instancia;
	}

}
