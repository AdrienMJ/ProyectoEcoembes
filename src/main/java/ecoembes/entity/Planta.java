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
		
	
	
	
	public Planta(String id, String nombre, String direccion, Map<Date, Float> capacidades,
			List<Contenedor> contenedoresAsignados, User responsable) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidades = capacidades;
		this.contenedoresAsignados = contenedoresAsignados;
		this.responsable = responsable;
	}
	

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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Map<Date, Float> getCapacidades() {
		return capacidades;
	}


	public void setCapacidades(Map<Date, Float> capacidades) {
		this.capacidades = capacidades;
	}


	public List<Contenedor> getContenedoresAsignados() {
		return contenedoresAsignados;
	}


	public void setContenedoresAsignados(List<Contenedor> contenedoresAsignados) {
		this.contenedoresAsignados = contenedoresAsignados;
	}


	public User getResponsable() {
		return responsable;
	}


	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}
	
}
