package ec.edu.ups.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Categoria {
	@Id
	private int CategoriaID;
	@NotNull
	private String nombre;
	private String descripcion;
	
	
	public int getCategoriaID() {
		return CategoriaID;
	}
	public void setCategoriaID(int categoriaID) {
		CategoriaID = categoriaID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
		
}
