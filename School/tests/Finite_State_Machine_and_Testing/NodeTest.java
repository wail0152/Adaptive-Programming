package Finite_State_Machine_and_Testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public static void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void setNode() {
        Node s0 = new Node("s0");
        Connection con1 = new Connection(s0, 1, "A");
        Connection con2 = new Connection(s0, 1, "B");
        s0.setNode(con1, con2);

        assertEquals(2, s0.getConnectedNotes().size());
        assertSame(con1, s0.getConnectedNotes().get(0));
        assertSame(con2, s0.getConnectedNotes().get(1));
    }

    @Test
    void readSequence() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        s1.setReturnString("This is a custom return string");

        s0.setNode(new Connection(s0, 1, "A"), new Connection(s1, 1, "B"));
        s0.readSequence("AAB");

        assertEquals("This is a custom return string", outContent.toString().trim());
    }

    @Test
    void testToString() {
        Node n = new Node("s1");
        assertEquals("The sequence ended at: s1", n.toString());
    }

    @Test
    void testNullNode()
    {
        Node s0 = new Node("s0");

        s0.setNode(new Connection(s0, 1, "A"), new Connection(null, 1, "B"));
        s0.readSequence("AAB");
        assertEquals("The sequence ended at: s0 with an error for the input B", outContent.toString().trim());
    }
}