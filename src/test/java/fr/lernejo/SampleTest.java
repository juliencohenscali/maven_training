package fr.lernejo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    Sample m = new Sample();

    //

    @Test
    void test() {
        assertEquals(6, m.fact(3));
        assertEquals(720, m.fact(6));
        assertEquals(1, m.fact(0));
        assertThrows(new IllegalArgumentException(("N should be positive")), m.fact(-1));
        //assertEquals(m.err, m.fact(-1));

        assertEquals(5,m.op(Sample.Operation.ADD,3,2));
        assertEquals(10000,m.op(Sample.Operation.ADD,4500,5500));
        assertEquals(-1000,m.op(Sample.Operation.ADD,4500,-5500));

        assertEquals(100,m.op(Sample.Operation.MULT,10,10));
        assertEquals(-20,m.op(Sample.Operation.MULT,-5,4));
        assertEquals(20,m.op(Sample.Operation.MULT,-5,-4));
    }
}
