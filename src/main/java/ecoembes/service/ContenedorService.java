// ContenedorAppService.java
package ecoembes.service;

import ecoembes.entity.Contenedor;
import java.util.*;

public class ContenedorService {
    private List<Contenedor> contenedores = new ArrayList<>();
    private Map<String, list<ContenedorEstadoDTO>> historico;

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

    public List<Contenedor> consultarPorZona(String codigoPostal) {
        return contenedores.stream()
            .filter(c -> c.getCodigoPostal().equals(codigoPostal))
            .toList();
    }

    public List<Contenedor> getAll() {
        return contenedores;
    }
}

