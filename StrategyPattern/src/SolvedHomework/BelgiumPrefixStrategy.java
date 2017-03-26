package SolvedHomework;

public class BelgiumPrefixStrategy implements IPhoneServiceStrategy {
    @Override
    public String getPrefixByCountryName() {
        return "+32";
    }
}
