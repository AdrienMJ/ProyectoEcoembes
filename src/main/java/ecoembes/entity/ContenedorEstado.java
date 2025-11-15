// ContenedorEstado.java
package ecoembes.entity;

import java.util.Date;

public class ContenedorEstado {
    private Date fecha;
    private int estimadoEnvases;
    private String nivel;

    public ContenedorEstado(Date fecha, int estimado, String nivel) {
        this.fecha = fecha;
        this.estimadoEnvases = estimado;
        this.nivel = nivel;
    }

    public boolean esCritico() {
        return "ROJO".equalsIgnoreCase(nivel);
    }

    // Getters y setters...
    public Date getFecha() {
		return fecha;
	}
    
    public int getEstimadoEnvases() {
		return estimadoEnvases;
	}
    
    public String getNivel() {
		return nivel;
	}
    
    
}
