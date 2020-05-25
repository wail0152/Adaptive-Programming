package Finite_State_Machine_and_Testing;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node s0 = new Node("s0");
    private Node s1 = new Node("s1");

    @Test
    void setNode()
    {
        Connection con1 = new Connection(s0, 1, "A");
        Connection con2 = new Connection(s0, 1, "B");
        s0.setNode(con1, con2);

        assertEquals(2, s0.getConnectedNotes().size());
        assertSame(con1, s0.getConnectedNotes().get(0));
        assertSame(con2, s0.getConnectedNotes().get(1));
    }

    @Test
    void readSequence()
    {
        s0.setNode(new Connection(s0, 1, "A"), new Connection(s1, 1, "B"));
        s1.setReturnString("This is a custom return string");
        assertEquals("This is a custom return string", s0.readSequence("AAB"));
    }

    @Test
    void testToString()
    {
        assertEquals("The sequence ended at: s0", s0.toString());
    }

    @Test
    void testNullNode()
    {
        s0.setNode(new Connection(s0, 1, "A"), new Connection(null, 1, "B"));
        assertEquals("The sequence ended at: s0 with an error for the input B", s0.readSequence("AAB"));
    }

    @Test
    void testNoPath()
    {
        s0.setNode(new Connection(s0, 1, "A"));
        assertEquals("The sequence ended at: s0 with no path for the input B", s0.readSequence("AAB"));
    }

}