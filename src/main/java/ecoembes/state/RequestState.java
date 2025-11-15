// RequestState.java
package ecoembes.state;


public abstract class RequestState {
    public abstract void handle(RequestContext context, String request);
}

