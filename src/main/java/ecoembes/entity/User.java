package ecoembes.entity;

public class User {
	private String id;
	private String nombre;
	private String email;
	private String password;
	//private String role; posibles roles de usuario
	private String token;
		
	
	
	public User(String id, String nombre, String email, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
