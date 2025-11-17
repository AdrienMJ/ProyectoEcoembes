package ecoembes.service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import ecoembes.dto.UserDTO;

public class AuthService {
	private List<UserDTO> usuarios;
	private Map<String, UserDTO> tokensActivos;
	
	// Constructor
    public AuthService(List<UserDTO> usuarios, Map<String, UserDTO> tokensActivos) {
        this.usuarios = usuarios;
        this.tokensActivos = tokensActivos;
    }
	
public UserDTO login(String email, String password) throws Exception {

        
        if (email == null || password == null) {
            throw new Exception("Email o contraseña no pueden ser nulos.");
        }

        
        for (UserDTO u : usuarios) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                return generarToken(u);
            }
        }

        
        throw new Exception("Credenciales inválidas.");
    }

	private UserDTO generarToken(UserDTO user) {
	
	    String token = UUID.randomUUID().toString();
	
	    
	    while (tokensActivos.containsKey(token)) {
	        token = UUID.randomUUID().toString();
	    }
	
	    user.setToken(token);
	    tokensActivos.put(token, user);
	
	    return user;
	}
	
	public void logout(String token) throws Exception {

        if (!tokensActivos.containsKey(token)) {
            throw new Exception("Token inválido o sesión ya cerrada.");
        }

        //Eliminar usuario de sesiones
        tokensActivos.remove(token);

        System.out.println("Sesión cerrada correctamente.");
    }
}
