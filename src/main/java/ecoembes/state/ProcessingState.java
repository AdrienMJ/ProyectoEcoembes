// ProcessingState.java
package ecoembes.state;

public class ProcessingState extends RequestState {
    @Override
    public void handle(RequestContext context, String request) {
        System.out.println("Procesando petición...");
        context.setState(new CompletedState());
    }
}

