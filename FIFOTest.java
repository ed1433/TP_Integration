package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {
	
	protected FIFO monFifo;

	@BeforeEach
	void setUp() throws Exception {
		monFifo = new FIFO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Add() {
		int size = 0;
		monFifo.add(1);
		assertEquals(monFifo.size(), ++size );
		
		monFifo.add(5);
		assertEquals(monFifo.size(), ++size );
		
		monFifo.add(1);
		assertEquals(monFifo.first(),Integer.valueOf(1));

	}

	@Test
	void First() {
		monFifo.add(1);
		assertEquals(monFifo.first(),Integer.valueOf(1));
	}

	@Test
	void IsEmpty() {
		monFifo.isEmpty();
		assertEquals(monFifo.isEmpty(),true);
		
		monFifo.add(10);
        assertFalse(monFifo.isEmpty());
	}

	@Test
	void RemoveFirst() {
		
		monFifo.add(2);
		monFifo.add(4);
		monFifo.removeFirst();
		assertEquals(monFifo.first(),Integer.valueOf(4));

	}

	@Test
	void Size() {
		int size = 0;
		monFifo.add(1);
		assertEquals(monFifo.size(), ++size );
		
		monFifo.removeFirst();
		assertEquals(monFifo.size(), --size);
	}

}
