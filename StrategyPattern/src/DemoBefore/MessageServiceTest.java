package DemoBefore;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageServiceTest {

	@Test
	public void when_saluation_is_called_with_mr_should_return_hi_mr() {
		MessageService service = new MessageService();
		
		String result = service.salutation(Title.Mr);
		
		assertEquals("Hi Mr", result);
	}
	
	@Test
	public void when_saluation_is_called_with_mrs_should_return_hi_mrs() {
		MessageService service = new MessageService();
		
		String result = service.salutation(Title.Mrs);
		
		assertEquals("Hi Mrs", result);
	}
	
	@Test
	public void when_saluation_is_called_with_doctor_should_return_hi_doctor() {
		MessageService service = new MessageService();
		
		String result = service.salutation(Title.Doctor);
		
		assertEquals("Hi Doctor", result);
	}

}
