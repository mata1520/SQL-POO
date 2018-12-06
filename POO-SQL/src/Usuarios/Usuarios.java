package Usuarios;

public class Usuarios {
	private String nombre;
	private int cuenta;
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", cuenta=" + cuenta + "]";
	}
	public Usuarios(String nombre, int cuenta) {
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
}
