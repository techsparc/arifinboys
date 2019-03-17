package com.bankrate.test;

import org.junit.Test;

import com.bankrate.work.TestScenario;

public class ExecutionTest extends BrowserNav{
	
	@Test
	public void shaonTest() throws InterruptedException {
		
		TestScenario t = new TestScenario(dr);
		t.ts1();
		
	}

}
