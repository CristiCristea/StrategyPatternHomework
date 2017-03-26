package DemoAfter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MessageServiceTest {

	private MessageService service;
	
	@Before
	public void setUp(){
		service = new MessageService();
	}
	
	@After
	public void tearDown(){
		service = null;
	}
	
	@Test
	public void when_salutation_is_called_with_mr_should_return_hi_mr() {
		String result = service.salutation(Title.Mr);
		
		assertEquals("Hi Mr", result);
	}
	
	@Test
	public void when_salutation_is_called_with_mrs_should_return_hi_mrs() {
		String result = service.salutation(Title.Mrs);
		
		assertEquals("Hi Mrs", result);
	}
	
	@Test
	public void when_salutation_is_called_with_doctor_should_return_hi_doctor(){
		String result = service.salutation(Title.Doctor);
		assertEquals("Hi Doctor", result);
	}
	
}
