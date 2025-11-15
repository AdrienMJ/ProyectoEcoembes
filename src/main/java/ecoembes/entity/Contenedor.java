// Contenedor.java
package ecoembes.entity;

import java.util.*;

public class Contenedor {
    private String id;
    private String direccion;
    private String codigoPostal;
    private int capacidadEnvases;
    private int estimadoEnvases;
    private String nivel;
    private List<ContenedorEstado> historial = new ArrayList<>();

    public Contenedor(String id, String direccion, String codigoPostal, int capacidadEnvases) {
        this.id = id;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.capacidadEnvases = capacidadEnvases;
        this.nivel = "VERDE";
    }

    public void actualizarNivel(String nivel, int estimado) {
        this.nivel = nivel;
        this.estimadoEnvases = estimado;
        historial.add(new ContenedorEstado(new Date(), estimado, nivel));
    }

    public List<ContenedorEstado> obtenerHistorial(Date inicio, Date fin) {
        return historial.stream()
                .filter(e -> !e.getFecha().before(inicio) && !e.getFecha().after(fin))
                .toList();
    }

    // Getters y setters...
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
	
	
}

