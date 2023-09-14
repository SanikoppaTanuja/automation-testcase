package newpackage;

public class UpperandLowersex {

	public static void main(String[] args) {
		
		String s="MyNameisTanuja";
		int lower=0;
		int upper=0;
		char[] character=s.toCharArray();
		for(int i=0; i<s.length(); i++)

		{	char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
				
			}
			else
			{
				lower++;
			}
			
		}
	System.out.println("uppercharacters"+ upper);
	System.out.println("lowercharacters"+ lower);
	}

}
