package sample;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/testcontext-root.xml")
public abstract class AbstractTestCase {

	@BeforeClass
	public static void initialize() {
		System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.xbean.spring.jndi.SpringInitialContextFactory");
		
		try {
			new InitialContext();
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void test() {
		
	}
}
