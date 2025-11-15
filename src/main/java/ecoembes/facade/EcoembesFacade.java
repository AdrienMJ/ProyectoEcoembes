// EcoembesFacade.java
package ecoembes.facade;

import ecoembes.service.*;

import java.util.Date;
import java.util.List;

import ecoembes.dto.*;
import ecoembes.state.*;

public class EcoembesFacade {
    private AuthService authService;
    private ContenedorService contenedorService;
    private PlantaService plantaService;
    private RequestContext requestContext;
    
    public EcoembesFacade(RequestContext requestContext) {
		this.requestContext = requestContext;
		this.authService = new AuthService(requestContext);
		this.contenedorService = new ContenedorService(requestContext);
		this.plantaService = new PlantaService(requestContext);
	}
    
    public UserDTO login(String username, String password) throws Exception {
			return authService.login(username, password);
	}
    
    public void logout(String token) throws Exception { 
    				authService.logout(token);
    }
    
    public ResponseDTO actualizarContenedor(ContenedorDTO contenedor) throws Exception {
		contenedorService.actualizarContenedor(contenedor);
	}
    
    public ResponseDTO crearContenedor(ContenedorDTO contenedor) throws Exception { 
    			contenedorService.crearContenedor(contenedor);
    }
    
    public List<ContenedorDTO> obtenedorEstadoContenedor(String id, Date fechaInicio, Date fechaFin) {
    			return contenedorService.obtenedorEstadoContenedor(id, fechaInicio, fechaFin);
    }
    
    public List<ContenedorDTO> consultarContenedoresZona(String codigo) {
    			return contenedorService.consultarContenedoresZona(codigo);
    }
    
    public List<PlantaDTO> consultarPlantas() {
				return plantaService.consultarPlantas();
	}
    
    public ResponseDTO asignarContenedoresAPlanta(AsignacionDTO asignacion) {
    					return plantaService.asignarContenedoresAPlanta(asignacion);
    }
}

