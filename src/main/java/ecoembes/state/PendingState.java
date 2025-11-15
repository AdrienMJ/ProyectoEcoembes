// PendingState.java
package ecoembes.state;

public class PendingState extends RequestState {
    @Override
    public void handle(RequestContext context, String request) {
        System.out.println("Petición pendiente: " + request);
        context.setState(new ProcessingState());
    }
}
