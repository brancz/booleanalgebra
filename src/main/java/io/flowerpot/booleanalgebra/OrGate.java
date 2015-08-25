package io.flowerpot.booleanalgebra;

/**
 * Created by fredericbranczyk on 25/08/15.
 */
public final class OrGate implements InternalState {
    private final InternalState a;
    private final InternalState b;

    private OrGate(InternalState a, InternalState b) {
        this.a = a;
        this.b = b;
    }

    public State getState() {
        if(this.a.getState() == State.TRUE || this.b.getState() == State.TRUE) {
            return State.TRUE;
        }
        return State.FALSE;
    }

    public static OrGate create(InternalState a, InternalState b) {
        return new OrGate(a, b);
    }
}
