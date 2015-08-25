import io.flowerpot.booleanalgebra.AndGate;
import io.flowerpot.booleanalgebra.NegationGate;
import io.flowerpot.booleanalgebra.OrGate;
import io.flowerpot.booleanalgebra.State;
import junit.framework.TestCase;

/**
 * Created by fredericbranczyk on 25/08/15.
 *
 * Integration Tests as specified in Client specs
 */
public class UseCasesTest extends TestCase {
    public void testA() {
        assertTrue(AndGate.create(State.FALSE, State.TRUE).getState() == State.FALSE);
        assertTrue(AndGate.create(State.TRUE, State.TRUE).getState() == State.TRUE);
    }

    public void testB() {
        assertTrue(OrGate.create(AndGate.create(State.FALSE, State.TRUE),  State.FALSE).getState() == State.FALSE);
        assertTrue(OrGate.create(AndGate.create(State.FALSE, State.FALSE), State.TRUE ).getState() == State.TRUE);
    }

    public void testC() {
        State x1 = State.FALSE;
        assertTrue(OrGate.create(x1, NegationGate.create(x1)).getState() == State.TRUE);
        x1 = State.TRUE;
        assertTrue(OrGate.create(x1, NegationGate.create(x1)).getState() == State.TRUE);
    }
}
