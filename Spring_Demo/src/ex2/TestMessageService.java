package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	@Test
	public void testCase() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex2/appctx.xml");
		MessageRouter router = (MessageRouter) ctx.getBean("router");

		router.processMessage("sms", "1510sangita", "Hello sangita");
		router.processMessage("email", "san@gmail.com", "welcome sangita");
		router.processMessage("tweet", "@iamsangita.com", "pranam sangita");
	}
}
