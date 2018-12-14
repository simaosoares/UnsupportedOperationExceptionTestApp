package com.example;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit tests to demonstrate how {@link UnsupportedOperationException} can be thrown and examples to avoid it.
 */
public class UnsupportedOperationExceptionTest extends TestCase {

    private final List<String> items = Arrays.asList("item1", "item2");

    public void testAddElementToCollection_shouldThrowUnsupportedOperationException() {
        try {
            items.add("item3");
            fail("exception should have been thrown");
        } catch (UnsupportedOperationException ex){
            assertTrue( true );
        }
    }

    public void testAddElementToCollection_shouldAddElement() {
        final List<String> collection = new ArrayList<String>(items);
        collection.add("item3");
        assertEquals(3, collection.size());
    }
}
