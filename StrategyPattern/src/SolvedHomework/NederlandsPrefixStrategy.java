package SolvedHomework;

public class NederlandsPrefixStrategy implements IPhoneServiceStrategy {
    @Override
    public String getPrefixByCountryName() {
        return "+33";
    }
}
