import io.flowerpot.booleanalgebra.NegationGate;
import io.flowerpot.booleanalgebra.State;
import junit.framework.TestCase;

/**
 * Created by fredericbranczyk on 25/08/15.
 */
public class NegationGateTest extends TestCase {
    public void testFalseResultsTrue() {
        State result = NegationGate.create(State.FALSE).getState();
        assertTrue(result == State.TRUE);
    }

    public void testTrueResultsFalse() {
        State result = NegationGate.create(State.TRUE).getState();
        assertTrue(result == State.FALSE);
    }
}
