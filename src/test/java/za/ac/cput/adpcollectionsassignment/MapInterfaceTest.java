package za.ac.cput.adpcollectionsassignment;

/**
 *  MapInterfaceTest.java
 *  Tests on the Map Interface using JUnit 5
 *  @author Dylan Koevort 218088159
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapInterfaceTest {

    MapInterface me = new MapInterface();

    @BeforeEach
    void mapSetUp() {
        me.mapInit();
    }

    @Test
    void mapAddTest() {
        assertEquals(6, me.mapAdd().size());
    }

    @Test
    void mapRemoveTest() {
        assertEquals(3, me.mapRemove().size());
    }
}