package test.java.yaksha;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import main.java.yaksha.SnacksDetails;
import main.java.yaksha.TestUtils;

public class SnacksDetailsTest {

	SnacksDetails s=new SnacksDetails(); 
	 	
	@Test
	public void testGenerateBill() throws IOException {
		assertTrue(s.generateBill(10,10,10) );
		// TestUtils.yakshaAssert(TestUtils.currentTest(),s.generateBill(10,10,10)==true==true?"true":"false",TestUtils.businessTestFile);

	}

}
