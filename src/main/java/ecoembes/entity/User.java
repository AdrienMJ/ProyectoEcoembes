package ecoembes.entity;

public class User {
	private String id;
	private String nombre;
	private String email;
	private String password;
	//private String role; posibles roles de usuario
	private String token;
	
	public String generarToken() {
		// Lógica para generar un token único (puede ser un UUID, JWT, etc.)
		this.token = java.util.UUID.randomUUID().toString();
		return this.token;
	}
	
	public Boolean validarPassword(String password) {
		// Lógica para validar la contraseña (puede incluir hashing, salting, etc.)
		return this.password.equals(password);
	}
	
	public void revocarToken() {
		this.token = null;
	}
}
