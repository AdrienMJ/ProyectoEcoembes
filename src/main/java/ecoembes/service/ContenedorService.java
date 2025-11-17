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

        //Inicializar el historial vacío para el contenedor
        historico.put(id, new ArrayList<>());

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


    public void actualizarContenedorConHistorico(Contenedor contenedor,int estimadoEnvases,String nivel,Date fechaActualizacion) {

        
        contenedor.setEstimadoEnvases(estimadoEnvases);
        contenedor.setNivel(nivel);
        contenedor.setFechaActualizacion(fechaActualizacion);

       
        List<ContenedorEstadoDTO> lista = historico.get(contenedor.getId());
        if (lista == null) {
            lista = new ArrayList<>();
            historico.put(contenedor.getId(), lista);
        }

        
        lista.add(new ContenedorEstadoDTO(fechaActualizacion, estimadoEnvases, nivel));
    }
    
    public List<ContenedorEstadoDTO> obtenerHistorial(String id, Date inicio, Date fin) throws Exception {

        // Validación mínima
        if (id == null || id.isEmpty()) {
            throw new Exception("El ID del contenedor no puede ser nulo o vacío.");
        }

        if (inicio == null || fin == null) {
            throw new Exception("Las fechas no pueden ser nulas.");
        }

        if (inicio.after(fin)) {
            throw new Exception("La fecha 'desde' no puede ser posterior a 'hasta'.");
        }

        // Obtener el historial del contenedor
        List<ContenedorEstadoDTO> lista = historico.get(id);

        if (lista == null) {
            throw new Exception("No existe historial para el contenedor con ID: " + id);
        }

        // Filtrado por rango de fechas
        return lista.stream()
            .filter(e -> !e.getFecha().before(inicio) && !e.getFecha().after(fin))
            .toList();
    }
}

