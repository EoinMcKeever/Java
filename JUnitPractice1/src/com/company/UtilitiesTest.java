package com.company;

import static org.junit.Assert.*;


class UtilitiesTest {

    @org.junit.Test
    void everyNthChar() {
        Utilities object = new Utilities();
        assertArrayEquals(new char[]{'e', 'l'}, object.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'},2));
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, object.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'},8));
    }

    @org.junit.Test
    void removePairs() {
        Utilities object = new Utilities();
        assertEquals("giby", object.removePairs("gibby"));
        assertEquals("ABCABDEF", object.removePairs( "ABCCABDEEF"));
        assertEquals(null, object.removePairs(null));




     }

    private void assertNull(Object o) {
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    void converter() throws Exception {
        Utilities object = new Utilities();
        assertEquals(300, object.converter(10,5));
        assertEquals(0.0, object.converter(10,0));

    }

    @org.junit.Test
    void nullIfOddLength() {
        Utilities object = new Utilities();
        assertNull(object.nullIfOddLength("dudet"));
        assertNotNull(object.nullIfOddLength("dude"));


    }

}