package za.ac.cput.adpcollectionsassignment;

/**
 *  ListInterfaceTest.java
 *  Tests on the List Interface using JUnit 5
 *  @author Dylan Koevort 218088159
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListInterfaceTest {

    ListInterface le = new ListInterface();

    @BeforeEach
    void listSetUp(){
        le.listInit();
    }

    @Test
    void listAddTest() {
        assertEquals(6, le.listAdd().size());
    }


    @Test
    void listRemoveTest() {
        assertEquals(3, le.listRemove().size());
    }
}