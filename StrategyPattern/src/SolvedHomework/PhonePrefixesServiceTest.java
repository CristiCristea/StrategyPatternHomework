package SolvedHomework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PhonePrefixesServiceTest {

    private PhonePrefixesService service;

    @Before
    public void setUp(){
        service = new PhonePrefixesService();
    }

    @After
    public void tearDown(){
        service = null;
    }

    @Test
    public void when_prefix_is_called_with_Belgium_return_32() {
        String result = service.prefix(Country.BELGIUM);
        assertEquals("+32", result);
    }
    @Test
    public void when_prefix_is_called_with_England_return_41() {
        String result = service.prefix(Country.ENGLAND);
        assertEquals("+41", result);
    }
    @Test
    public void when_prefix_is_called_with_France_return_31() {
        String result = service.prefix(Country.FRANCE);
        assertEquals("+31", result);
    }
    @Test
    public void when_prefix_is_called_with_Nederlands_return_33() {
        String result = service.prefix(Country.NEDERLANDS);
        assertEquals("+33", result);
    }




}
