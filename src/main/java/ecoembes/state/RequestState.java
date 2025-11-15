// RequestState.java
package ecoembes.state;

import ecoembes.state.RequestContext;

public abstract class RequestState {
    public abstract void handle(RequestContext context, String request);
}

