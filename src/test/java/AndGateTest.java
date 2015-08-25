import io.flowerpot.booleanalgebra.AndGate;
import io.flowerpot.booleanalgebra.State;
import junit.framework.TestCase;

/**
 * Created by fredericbranczyk on 25/08/15.
 */
public class AndGateTest extends TestCase {
   public void testFalseAndFalseEqualFalse() {
      State result = AndGate.create(State.FALSE, State.FALSE).getState();
      assertTrue(result == State.FALSE);
   }

   public void testFalseAndTrueEqualFalse() {
      State result = AndGate.create(State.FALSE, State.TRUE).getState();
      assertTrue(result == State.FALSE);
   }

   public void testTrueAndFalseEqualFalse() {
      State result = AndGate.create(State.TRUE, State.FALSE).getState();
      assertTrue(result == State.FALSE);
   }

   public void testTrueAndTrueEqualFalse() {
      State result = AndGate.create(State.TRUE, State.TRUE).getState();
      assertTrue(result == State.TRUE);
   }
}