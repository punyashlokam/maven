package surfire_test;

import com.maven.test.HelloWorld;

public class HelloWorldTestCase {

	public void testGetMessage() {
		HelloWorld hello = new HelloWorld();
		assert("Hello World".equals(hello.getMessage()));
	}
}
