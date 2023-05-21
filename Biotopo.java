public class Biotopo {

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
	 * @param elMedioFisico
	 */
	public void atLocation(Biosenosis elMedioFisico) {
		// TODO - implement Biotopo.atLocation
		throw new UnsupportedOperationException();
	}

	@Override()
	public String toString() {
		// TODO - implement Biotopo.toString
		//hrow new UnsupportedOperationException();
		String s = "Biotopo: " + this.nombre;
		return s;
	}

	/**
	 * 
	 * @param nombre
	 */
	public Biotopo(String nombre) {
		// TODO - implement Biotopo.Biotopo
	}

}