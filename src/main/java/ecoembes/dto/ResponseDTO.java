// ResponseDTO.java
package ecoembes.dto;

public class ResponseDTO {
    public String mensaje;
    public Object datos;
    
    public ResponseDTO(String mensaje, Object datos) {
		this.mensaje = mensaje;
		this.datos = datos;
	}
    
    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Object getDatos() {
		return datos;
	}

	public void setDatos(Object datos) {
		this.datos = datos;
	}
}

