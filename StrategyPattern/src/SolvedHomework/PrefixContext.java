package SolvedHomework;


import java.util.HashMap;

public class PrefixContext {
    HashMap<Country, IPhoneServiceStrategy> salutationMap = new HashMap<Country, IPhoneServiceStrategy>();

    public PrefixContext(){
        salutationMap.put(Country.BELGIUM, new BelgiumPrefixStrategy());
        salutationMap.put(Country.ENGLAND, new EnglandPrefixStrategy());
        salutationMap.put(Country.FRANCE, new FrancePrefixStrategy());
        salutationMap.put(Country.NEDERLANDS, new NederlandsPrefixStrategy());

    }

    public String doExecute(Country country){
        return salutationMap.get(country).getPrefixByCountryName();
    }
}
