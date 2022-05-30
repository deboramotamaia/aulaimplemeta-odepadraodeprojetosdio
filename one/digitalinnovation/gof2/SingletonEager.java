package one.digitalinnovation.gof2;

/**
 * Singleton "apressado"
 * 
 * @author maia_
 *
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}


}
