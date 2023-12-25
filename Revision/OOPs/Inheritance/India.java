// Parent class
class DhirubhaiAmbani {
	
	String Company; // state
	
	public void thinkingStyle() // behavior
	{
		Company = "Reliance Industries";
		System.out.println("Dhirubhai's thinking style.");
	}

}

// Child class --> 'Cause it is using extends keyword also know as inherating.
class MukeshAmbani extends DhirubhaiAmbani{

}

// Driver class
class India {
	
	public static void main(String[] args){
		
		// DhirubhaiAmbani db1 = new DhirubhaiAmbani();
		MukeshAmbani ref = new MukeshAmbani();
		System.out.println("Company : " + ref.Company);
		ref.thinkingStye();
		System.out.println("Company : " + ref.Company);

	}

}
