package za.ac.cput.adpcollectionsassignment;

/**
 *  CollectionTestInterface.java
 *  Tests on the Collection Interface
 *  @author Dylan Koevort 218088159
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionInterfaceTest {

    CollectionInterface ce = new CollectionInterface();

    @BeforeEach
    void collectionSetUp() {
        ce.collectionInit();
    }

    @Test
    void collectionAddTest() {
        assertEquals(6, ce.collectionAdd().size());
    }

    @Test
    void collectionRemoveTest() {
        assertEquals(3, ce.collectionRemove().size());
    }
}