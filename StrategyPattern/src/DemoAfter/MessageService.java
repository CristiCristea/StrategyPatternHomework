package DemoAfter;

public class MessageService {

	/**
	 * Salutation method.
	 * @param title
	 * @return
	 */
	public String salutation(Title title) {
		SalutationContext context = new SalutationContext();
		return context.doExecute(title);
	}
}
