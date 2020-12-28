package com.juanma.HackAlgorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.juanma.HackAlgorithms.Algorithms.StackCheck;



class TestSatckCheck {

	static StackCheck stack;  

	@BeforeAll	
	static void init() {
		stack=new StackCheck();
	}
	
    @Test
    public void testOne(){
        assertTrue( stack.check("[]"));
        assertTrue( stack.check("[[]]"));
        assertTrue( stack.check("(())"));
        assertTrue( stack.check("{()}"));
    }    

    @Test
    public void testTwo(){
        assertEquals(stack.check("[]+[[]]"), true);
        assertEquals(stack.check("{()+[[]]}"), true);
        assertEquals(stack.check("{()+()}+[[]]"), true);
    }

    @Test
    public void testThree(){
        assertFalse(stack.check("[]["));
        assertFalse(stack.check("[][)"));
        assertFalse(stack.check("{{]["));
        assertFalse(stack.check("(()))"));
    }
    @Test
    public void testFour(){
        assertEquals(stack.check("[]+[[]]["), false);
        assertEquals(stack.check("{()+[[]]"), false);
        assertEquals(stack.check("{()+()+[[]]"), false);
    }
}
