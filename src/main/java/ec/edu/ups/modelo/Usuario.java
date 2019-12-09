package ec.edu.ups.modelo;

public class Usuario {
	
	private int userId;
	private String nombre;
	private String apellido;
	private String direccion; 
	private int edad;
	private boolean rol;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isRol() {
		return rol;
	}
	public void setRol(boolean rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Usuario [userId=" + userId + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", edad=" + edad + ", rol=" + rol + "]";
	} 
	
	
}
