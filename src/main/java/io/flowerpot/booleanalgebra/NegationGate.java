package io.flowerpot.booleanalgebra;

/**
 * Created by fredericbranczyk on 25/08/15.
 */
public final class NegationGate implements InternalState {
    private final InternalState inputState;

    private NegationGate(InternalState inputState) {
        this.inputState = inputState;
    }

    public State getState() {
        if(this.inputState.getState() == State.TRUE) {
            return State.FALSE;
        }
        return State.TRUE;
    }

    public static NegationGate create(InternalState inputState) {
        return new NegationGate(inputState);
    }
}
