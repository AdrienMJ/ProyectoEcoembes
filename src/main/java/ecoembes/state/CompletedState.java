// CompletedState.java
package ecoembes.state;

public class CompletedState extends RequestState {
    @Override
    public void handle(RequestContext context, String request) {
        System.out.println("Petición completada: " + request);
    }
}
