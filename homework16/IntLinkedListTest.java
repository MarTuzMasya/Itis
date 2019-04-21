package homework16;

import homework16.linkedList.IntLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntLinkedListTest {
    private IntLinkedList intLinkedList;

    @Before
    public void setUp() {
        this.intLinkedList = new IntLinkedList();
    }

    @Test
    public void testAddOn7AndGetOn0() {
        intLinkedList.add(7);
        assertEquals(7, intLinkedList.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void testGetFromNotExistingPosition() {
        intLinkedList.add(4);
        intLinkedList.get(1);
    }

    @Test(expected = NullPointerException.class)
    public void testGetFromNegativePosition() {
        intLinkedList.add(4);
        intLinkedList.get(-1);
    }

    @Test
    public void testRemoveFirst() {
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.remove(0);
        assertEquals(2, intLinkedList.get(0));
        assertEquals(3, intLinkedList.get(1));
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveLast() {
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(6);
        intLinkedList.remove(2);
        intLinkedList.get(2);
    }

    @Test(expected = NullPointerException.class)
    public void testGetNull() {
        intLinkedList.get(0);
    }

    @Test
    public void testRemoveOn1() {
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.remove(1);
        assertEquals(3, intLinkedList.get(1));
    }

}

