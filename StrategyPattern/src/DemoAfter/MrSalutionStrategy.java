package DemoAfter;

public class MrSalutionStrategy implements ISalutationStrategy {
	@Override
	public String salutation() {
		return "Hi " + Title.Mr;
	}
}
