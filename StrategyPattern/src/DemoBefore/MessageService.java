package DemoBefore;

public class MessageService {
	private static final String EMPTYSTRING = "";
	private static final String SALUTATION = "Hi ";

	public String salutation(Title title) {
		switch (title) {
		case Mr:
			return SALUTATION + Title.Mr;
		case Mrs:
			return SALUTATION + Title.Mrs;
		case Doctor:
			return SALUTATION + Title.Doctor;

		}
		return EMPTYSTRING;

	}
}
