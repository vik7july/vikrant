package exception;

public class Compilation {
	//In java program are complied into bytecode, then JVM execute at run time

	// java code  compiled into bytecode when we use javac compiler , bytecode saved with .class extension, when program is to run bytecode is converted using JIT compiler into machine code
	// Java code is compiled twice in order to be excecuted
	// java program need to compiled to bytecode then when bytecode is run to machine code
	// in other language directly compiled to bytecode
	//Java is platform independent 

	
	/*package testtt;

	public class JunitAnnotation {
		@BeforeClass – Run once before any of the test methods in the class, public static void
		@AfterClass – Run once after all the tests in the class have been run, public static void
		@Before – Run before @Test, public void
		@After – Run after @Test, public void
		@Test – This is the test method to run, public void
	}
	Output
	@BeforeClass - runOnceBeforeClass

	@Before - runBeforeTestMethod
	@Test - test_method_1
	@After - runAfterTestMethod

	@Before - runBeforeTestMethod
	@Test - test_method_2
	@After - runAfterTestMethod

	@AfterClass - runOnceAfterClass


	@Test(expected = ArithmeticException.class)
	    public void testDivisionWithException() {
	        int i = 1 / 0;
	    }

	    @Test(expected = IndexOutOfBoundsException.class)
	    public void testEmptyList() {
	        new ArrayList<>().get(0);
	    }
	     @Ignore
	    @Test
	    public void testMath2() {
	        assertThat(1 + 2, is(5));
	    }

	    @Ignore("some one please create a test for Math3!")
	    @Test
	    public void testMath3() {
	    
	      @Test(timeout = 1000)
	    public void infinity() {
	        while (true) ;
	    }

	    //This test can't run more than 5 seconds, else failed
	    @Test(timeout = 5000)
	    public void testSlowMethod() {
	        //...
	    }
	    
	    to run  multiple test cases:
	    @RunWith(Suite.class)
	@Suite.SuiteClasses({
	        Exception1Test.class, //test case 1
	        TimeoutTest.class     //test case 2
	})
	public class SuiteAbcTest {
		//normally, this is an empty class
	}

	*/
}
