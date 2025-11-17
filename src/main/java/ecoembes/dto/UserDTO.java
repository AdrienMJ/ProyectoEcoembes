package ecoembes.dto;

public class UserDTO {
	public String id;
	public String nombre;
	public String email;
	public String password;
	public String token;
	
	public UserDTO(String id, String email, String password, String nombre, String token) {
	    this.id = id;
	    this.email = email;
	    this.password = password;
	    this.nombre = nombre;
	    this.token = token;
	}

	public String getId() { return id; }
	public void setId(String id) { this.id = id; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }


	public String getName() { return nombre; }
	public void setName(String nombre) { this.nombre = nombre; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	public String getToken() { return token; }
	public void setToken(String token) { this.token = token; }
}
