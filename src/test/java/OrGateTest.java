import io.flowerpot.booleanalgebra.OrGate;
import io.flowerpot.booleanalgebra.State;
import junit.framework.TestCase;

/**
 * Created by fredericbranczyk on 25/08/15.
 */
public class OrGateTest extends TestCase {
    public void testFalseAndFalseResultFalse() {
        State result = OrGate.create(State.FALSE, State.FALSE).getState();
        assertTrue(result == State.FALSE);
    }

    public void testFalseAndTrueResultFalse() {
        State result = OrGate.create(State.FALSE, State.TRUE).getState();
        assertTrue(result == State.TRUE);
    }

    public void testTrueAndFalseResultFalse() {
        State result = OrGate.create(State.TRUE, State.FALSE).getState();
        assertTrue(result == State.TRUE);
    }

    public void testTrueAndTrueResultFalse() {
        State result = OrGate.create(State.TRUE, State.TRUE).getState();
        assertTrue(result == State.TRUE);
    }
}