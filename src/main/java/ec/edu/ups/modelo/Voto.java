package ec.edu.ups.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Voto {
	@Id
	@Column(name="votoID")
	private int votoID;
	@Column(name="userID")
	private Usuario usuario;
	@Column(name="ISBN")
	private Libro libro;
	public int getVotoID() {
		return votoID;
	}
	public void setVotoID(int votoID) {
		this.votoID = votoID;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Voto [votoID=" + votoID + ", usuario=" + usuario + ", libro=" + libro + "]";
	}

}
