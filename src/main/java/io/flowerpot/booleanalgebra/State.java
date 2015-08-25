package io.flowerpot.booleanalgebra;

/**
 * Created by fredericbranczyk on 25/08/15.
 */
public enum State implements InternalState {
    TRUE,
    FALSE;

    public State getState() {
        return this;
    }
}
