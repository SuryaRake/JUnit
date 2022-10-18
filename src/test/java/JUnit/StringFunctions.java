package JUnit;

/*public class StringFunctions {
	
	public static boolean isPalindrom(String name) {
		
		String rev = "";
		for(int i = (name.length()-1); i>=0;i--) {
			
			rev = rev + name.charAt(i);
			
			
		}
		
		if (rev != name) {
			return false;
		}
		
		
		
		return true;
	}
	
	
	*/
	
	public class StringFunctions {

		public static boolean isPalindrom(String name) {

			int i = 0;
			int j = name.length() - 1;

			
			while(i<j) {
				
				if(name.charAt(i) != name.charAt(j)) {
					return false;
				}
				
				i++;
				j--;
			}
			
			return true;

		}

	}


	
