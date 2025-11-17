package ecoembes.dto;

import java.util.Date;
import java.util.Map;

public class PlantaDTO {
	public String id;
	public String nombre;
	public String direccion;
	public Map<Date, Float> capacidades;
	
	//Constructor
		public PlantaDTO(String id, String nombre, String direccion, Map<Date, Float> capacidades) {
			this.id = id;
			this.nombre = nombre;
			this.direccion = direccion;
			this.capacidades = capacidades;
		}
		
		// Getters y setters
		public String getId() {
			return id;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public String getDireccion() {
			return direccion;
		}
		
		public Map<Date, Float> getCapacidades() {
			return capacidades;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		public void setCapacidades(Map<Date, Float> capacidades) {
			this.capacidades = capacidades;
		}
}
