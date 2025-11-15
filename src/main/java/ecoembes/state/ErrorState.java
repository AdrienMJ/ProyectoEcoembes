package ecoembes.state;

public class ErrorState {
		public void handle(RequestContext context, String request) {
		System.out.println("Error al procesar la petición: " + request);
	}
}
