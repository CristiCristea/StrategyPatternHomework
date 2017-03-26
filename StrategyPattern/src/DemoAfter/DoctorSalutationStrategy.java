package DemoAfter;

public class DoctorSalutationStrategy implements ISalutationStrategy {

	@Override
	public String salutation() {
		return "Hi " + Title.Doctor;
	}

}
