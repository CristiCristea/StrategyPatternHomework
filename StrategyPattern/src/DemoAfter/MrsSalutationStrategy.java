package DemoAfter;

public class MrsSalutationStrategy implements ISalutationStrategy {

	@Override
	public String salutation() {
		return "Hi " + Title.Mrs;
	}
}
