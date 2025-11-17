// ContenedorDTO.java
package ecoembes.dto;

public class ContenedorDTO {
    public String id;
    public String direccion;
    public String codigoPostal;
    public int capacidadEnvases;
    public int estimadoEnvases;
    public String nivel;
    
  //Constructor
    public ContenedorDTO(String id, String direccion, String codigoPostal, int capacidadEnvases,
		int estimadoEnvases, String nivel) {
		this.id = id;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.capacidadEnvases = capacidadEnvases;
		this.estimadoEnvases = estimadoEnvases;
		this.nivel = nivel;
	}
    
    // Getters y setters
    public String getId() {
    	return id;
    }
    
    public String getDireccion() {
		return direccion;
	}
    
    public String getCodigoPostal() {
		return codigoPostal;
	}
    
    public int getCapacidadEnvases() {
		return capacidadEnvases;
	}
    
    public int getEstimadoEnvases() {
		return estimadoEnvases;
	}
    
    public String getNivel() {
		return nivel;
	}
    
    public void setId(String id) {
    	this.id = id;
    	
    }
    public void setDireccion(String direccion) {
    	this.direccion = direccion;
    }
    public void setCodigoPostal(String codigoPostal) {
    	this.codigoPostal = codigoPostal;
	}
    
    public void setCapacidadEnvases(int capacidadEnvases) {
		this.capacidadEnvases = capacidadEnvases;
	}
	
	public void setEstimadoEnvases(int estimadoEnvases) {
		this.estimadoEnvases = estimadoEnvases;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}

