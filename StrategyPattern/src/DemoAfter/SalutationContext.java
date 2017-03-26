package DemoAfter;

import java.util.HashMap;

public class SalutationContext {
	HashMap<Title, ISalutationStrategy> salutationMap = new HashMap<Title, ISalutationStrategy>();
	
	public SalutationContext(){
		salutationMap.put(Title.Mr, new MrSalutionStrategy());
		salutationMap.put(Title.Mrs, new MrsSalutationStrategy());
		salutationMap.put(Title.Doctor, new DoctorSalutationStrategy());
	}
	
	public String doExecute(Title title){
		return salutationMap.get(title).salutation(); 
	}
}
