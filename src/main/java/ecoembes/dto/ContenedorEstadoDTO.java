package ecoembes.dto;

import java.util.Date;

public class ContenedorEstadoDTO {
	public Date fecha;
	public int estimadoEnvases;
	public String nivel;
	
	public ContenedorEstadoDTO(Date fecha, int estimadoEnvases, String nivel) {
		this.fecha = fecha;
		this.estimadoEnvases = estimadoEnvases;
		this.nivel = nivel;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public int getEstimadoEnvases() {
		return estimadoEnvases;
	}
	
	public String getNivel() {
		return nivel;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void setEstimadoEnvases(int estimadoEnvases) {
		this.estimadoEnvases = estimadoEnvases;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}
