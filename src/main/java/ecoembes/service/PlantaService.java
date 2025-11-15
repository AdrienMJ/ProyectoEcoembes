package ecoembes.service;

import java.util.List;

import ecoembes.dto.AsignacionDTO;
import ecoembes.dto.ResponseDTO;
import ecoembes.entity.Planta;

public class PlantaService {
	private List<Planta> plantas;
	
	public List<Planta> consultar() {
		return plantas;
	}
	
	public ResponseDTO asignarContenedores(AsignacionDTO asignacion) {
		// Lógica para asignar contenedores a la planta
		return null;
	}
}
