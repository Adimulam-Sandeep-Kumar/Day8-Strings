package ai.jobiak.string;

public class TestString {

	public static void main(String[] args) {
		
		String name = new String("My name is sandeep");
		
		String copyName = new String(name);
		
		System.out.println("name = " +name);
		System.out.println("copyName = " +copyName);
		
		boolean result = name == copyName;
		System.out.println(result);
		
		result = name.equals(copyName);
		System.out.println(result);
		
	}

}
