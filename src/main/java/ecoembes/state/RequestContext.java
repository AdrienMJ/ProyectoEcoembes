// RequestContext.java
package ecoembes.state;

public class RequestContext {
    private RequestState state;

    public RequestContext(RequestState state) {
        this.state = state;
    }

    public void setState(RequestState state) {
        this.state = state;
    }

    public void handleRequest(String request) {
        state.handle(this, request);
    }
}

