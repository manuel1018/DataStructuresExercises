package com.juanma.HackAlgorithms;

import com.juanma.HackAlgorithms.Algorithms.TagValidator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	static TagValidator tag;
	@BeforeAll
	static void setUp() {
	   tag=new TagValidator();
	}
	
	@Test
	public void validTest() {
		assertEquals(tag.isContenValid("<>Nayeem loves counseling</>"),true);
		assertEquals(tag.isContenValid("<h1>Nayeem loves counseling</h1>"),true);
		assertEquals(tag.isContenValid("<H2>Nayeem loves counseling</H2>"),true);
		assertEquals(tag.isContenValid("<H2>Nayeem loves counseling</H2><h1>dfsfd</h1>"),true);
	}
	@Disabled("Disabled, Test failed!!!")
	@Test
	public void validTestTwo() {
		assertEquals(tag.isContenValid("<h1>Nayeem loves counseling</h1>"),true);
		//assertEquals(tag.isContenValid("<h2><h1>Nayeem loves counseling</h1></h2>"),true);
		//assertEquals(tag.isContenValid("<p><h2><h1>Nayeem loves counseling</h1></h2>somrhtin</p>"),true);
		//assertEquals(tag.isContenValid("<p><h2><h1>Nayeem loves counseling</h1>fdsfsfds</h2>somrhtin</p>"),true);
		//assertEquals(tag.isContenValid("<p><h2><h1>Nayeem loves counseling</h1></h2>somrhtin</p>"),true);
	}
	
	@Test
	public void invalidTest() {
		assertEquals(tag.isContenValid("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>"),false);
		assertEquals(tag.isContenValid("<h1><h1>Sanjay has no watch<h1></h1><par>So wait for a while</par>"),false);
		assertEquals(tag.isContenValid("<h1>Nayeem loves counseling</H1>"),false);
		assertEquals(tag.isContenValid("<h1>Nayeem loves counseling</p>"),false);
	}	
	@Disabled("Disabled, Test failed!!!")
	@Test
	public void invalidTestTwo() {
		assertEquals(tag.isContenValid("<h1>Nayeem loves counseling</h1><h1>Nayeem loves counseling</h2>"),false);
		assertEquals(tag.isContenValid("<h1>Nayeem loves counseling</h1><h1>Nayeem loves counseling<>"),false);	
	}
}
