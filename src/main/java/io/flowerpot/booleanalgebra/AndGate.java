package io.flowerpot.booleanalgebra;

/**
 * Created by fredericbranczyk on 25/08/15.
 */
public final class AndGate implements InternalState {
    private final InternalState a;
    private final InternalState b;

    private AndGate(InternalState a, InternalState b) {
        this.a = a;
        this.b = b;
    }

    public State getState() {
        if(this.a.getState() == State.TRUE && this.b.getState() == State.TRUE) {
            return State.TRUE;
        }
        return State.FALSE;
    }

    public static AndGate create(InternalState a, InternalState b) {
        return new AndGate(a, b);
    }
}
