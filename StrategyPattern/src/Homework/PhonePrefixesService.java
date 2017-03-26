package Homework;
public class PhonePrefixesService {
	public String getPrefixByCountryName(Country countries) {
		switch (countries) {
		case BELGIUM:
			return "+32";
		case ENGLAND:
			return "+41";
		case FRANCE:
			return "+31";
		case NEDERLANDS:
			return "+33";
		default:
			return "";
		}
	}
}
