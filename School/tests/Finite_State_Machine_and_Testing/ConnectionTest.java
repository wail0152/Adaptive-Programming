package Finite_State_Machine_and_Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {

    @Test
    void testConnection()
    {
        Node n = new Node("node");
        Connection con = new Connection(n, 0.75, "B");

        assertEquals(n, con.n);
        assertEquals(0.75, con.chance);
        assertEquals("B", con.s);
    }

}