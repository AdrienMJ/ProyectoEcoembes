package ecoembes.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Planta {
	private String id;
	private String nombre;
	private String direccion;
	private Map<Date, Float> capacidades; // Mapa de fechas a capacidades registradas
	private List<Contenedor> contenedoresAsignados;
	private User responsable; //para la asignacion de contenedores
	
	public void asignarContenedor(Contenedor contenedor) {
		contenedoresAsignados.add(contenedor);
	}
	
	public float calcularCapacidadTotal() {
		float total = 0;
		for (Float capacidad : capacidades.values()) {
			total += capacidad;
		}
		return total;
	}
	
	public float obtenerCapacidadPorFecha(Date fecha) {
		return capacidades.getOrDefault(fecha, 0f);
	}
}
