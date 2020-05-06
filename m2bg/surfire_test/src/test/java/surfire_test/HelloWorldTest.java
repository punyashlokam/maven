package surfire_test;

import com.maven.test.HelloWorld;
import com.util.Util;

public class HelloWorldTest {

	public void testGetMessage() {
		HelloWorld hello = new HelloWorld();
		assert(Util.capitalize("Hello World").equals(hello.getMessage()));
	}
}
