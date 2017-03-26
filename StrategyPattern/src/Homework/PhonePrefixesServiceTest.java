package Homework;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PhonePrefixesServiceTest {

    @Test
    public void  when_getPrefixByCountryName_is_called_with_Belgium_return_32() {
        PhonePrefixesService service = new PhonePrefixesService();

        String result = service.getPrefixByCountryName(Country.BELGIUM);

        assertEquals("+32", result);
    }
    @Test
    public void  when_getPrefixByCountryName_is_called_with_England_return_41() {
        PhonePrefixesService service = new PhonePrefixesService();

        String result = service.getPrefixByCountryName(Country.ENGLAND);

        assertEquals("+41", result);
    }
    @Test
    public void  when_getPrefixByCountryName_is_called_with_France_return_31() {
        PhonePrefixesService service = new PhonePrefixesService();

        String result = service.getPrefixByCountryName(Country.FRANCE);

        assertEquals("+31", result);
    }
    @Test
    public void  when_getPrefixByCountryName_is_called_with_Nederlands_return_33() {
        PhonePrefixesService service = new PhonePrefixesService();

        String result = service.getPrefixByCountryName(Country.NEDERLANDS);

        assertEquals("+33", result);
    }

}

