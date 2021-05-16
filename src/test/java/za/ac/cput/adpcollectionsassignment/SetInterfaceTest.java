package za.ac.cput.adpcollectionsassignment;

/**
 *  SetInterfaceTest.java
 *  Tests on the Set Interface using JUnit 5
 *  @author Dylan Koevort 218088159
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetInterfaceTest {

    SetInterface se = new SetInterface();

    @BeforeEach
    void setInit() {
        se.setInit();
    }

    @Test
    void setAddTest() {
        assertEquals(6, se.setAdd().size());
    }

    @Test
    void setRemoveTest() {
        assertEquals(3, se.setRemove().size());
    }

    @Test
    void setFindTest() {
        assertTrue(se.setFind());
    }
}