package ecoembes.dto;

import java.util.List;

public class AsignacionDTO {
	public String idPlanta;
	public List<ContenedorDTO> contenedores;
	public UserDTO usuarioResponsable;
	
	public AsignacionDTO(String idPlanta, List<ContenedorDTO> contenedores, UserDTO usuarioResponsable) {
		this.idPlanta = idPlanta;
		this.contenedores = contenedores;
		this.usuarioResponsable = usuarioResponsable;
	}
	
	public String getIdPlanta() {
		return idPlanta;
	}
	public void setIdPlanta(String idPlanta) {
		this.idPlanta = idPlanta;
	}
	public List<ContenedorDTO> getContenedores() {
		return contenedores;
	}
	public void setContenedores(List<ContenedorDTO> contenedores) {
		this.contenedores = contenedores;
	}
	public UserDTO getUsuarioResponsable() {
		return usuarioResponsable;
	}
	public void setUsuarioResponsable(UserDTO usuarioResponsable) {
		this.usuarioResponsable = usuarioResponsable;
	}
}
