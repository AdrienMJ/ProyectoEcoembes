package ecoembes.service;

import java.util.List;
import java.util.Map;

import ecoembes.dto.UserDTO;

public class AuthService {
	private List<UserDTO> usuarios;
	private Map<String, UserDTO> tokensActivos;
	
	public UserDTO login(String email, String password) throws Exception {
		// Lógica de autenticación
		return null; // Retornar el usuario autenticado
	}
	
	public void logout(String token) throws Exception {
		// Lógica de cierre de sesión
	}
}
