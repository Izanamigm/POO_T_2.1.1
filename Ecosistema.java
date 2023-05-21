public class Ecosistema {

	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public Ecosistema(String nombre) {
		// TODO - implement Ecosistema.Ecosistema
		//throw new UnsupportedOperationException();
	}

	@Override()
	public String toString() {
		// TODO - implement Ecosistema.toString
		//throw new UnsupportedOperationException();
		String s = "Ecosistema: " + this.nombre;
		return s;
	}

}