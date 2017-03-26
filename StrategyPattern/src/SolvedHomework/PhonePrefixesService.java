package SolvedHomework;


public class PhonePrefixesService {
    public String prefix(Country country) {
        PrefixContext context = new PrefixContext();
        return context.doExecute(country);
    }
}

