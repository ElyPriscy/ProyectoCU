package ec.edu.ups.controlador;



import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.datos.UsuarioDAO;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Usuario;

@ManagedBean
public class UsuarioControlador {
	
	private Usuario usuario;
	private Libro libro;
	private Categoria categoria;
	@Inject
	private UsuarioDAO udao;
	private String atributoprueba;
	
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		libro=new Libro();
		categoria=new Categoria();
		
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
public String guardar() {
	udao.insertarUsuario(usuario);
	return null;
	
}
}
