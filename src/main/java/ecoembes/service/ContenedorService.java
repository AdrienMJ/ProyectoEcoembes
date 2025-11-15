// ContenedorAppService.java
package ecoembes.service;

import ecoembes.dto.ContenedorEstadoDTO;
import ecoembes.entity.Contenedor;
import java.util.*;

public class ContenedorService {
    private List<Contenedor> contenedores;
    private Map<String, List<ContenedorEstadoDTO>> historico;

    public Contenedor crearContenedor(String id, String direccion, String codigoPostal, int capacidad) {
        Contenedor c = new Contenedor(id, direccion, codigoPostal, capacidad);
        contenedores.add(c);
        return c;
    }

    public void actualizarContenedor(String id, int estimado, String nivel) {
        contenedores.stream()
            .filter(c -> c.getId().equals(id))
            .findFirst()
            .ifPresent(c -> c.actualizarNivel(nivel, estimado));
    }
    
    public void crearContenedor(Contenedor contenedor) {
		contenedores.add(contenedor);
	}

    public List<Contenedor> consultarPorZona(String codigoPostal) {
        return contenedores.stream()
            .filter(c -> c.getCodigoPostal().equals(codigoPostal))
            .toList();
    }
    
    public List<ContenedorEstadoDTO> obtenerHistorial(String id, Date fechaInicio, Date fechaFin) {
						List<ContenedorEstadoDTO> historialContenedor = historico.getOrDefault(id, Collections.emptyList());
		List<ContenedorEstadoDTO> resultado = new ArrayList<>();
		for (ContenedorEstadoDTO estado : historialContenedor) {
			if (!estado.getFecha().before(fechaInicio) && !estado.getFecha().after(fechaFin)) {
				resultado.add(estado);
			}
		}
		return resultado;
	}
    
    public List<Contenedor> getAll() {
        return contenedores;
    }
}

