
public class Main {

	public static void main(String[] args) {
		String text = null;
		
		/*	Most of people would do that Section 1 Way
		 *	So if 'text' variable is null, you will get 'NullPointerException, But not if you do with Section 2 Way'
		 */
		
		// Section 1. Bad Comparison
		if (text.equals("FooBar")) {
			// Do something
		}

		// Section 2. Good Comparison
		if ("FooBar".equals(text)) {
			//Do something
		}
		
		
		
		

	}

}
