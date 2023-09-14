package newpackage;

public class TofnfVowel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0, ccount=0;
		String s1="aaaaa";
		s1=s1.toLowerCase();
		for(int i=0; i<s1.length(); i++)
		{
		if(s1.charAt(i)=='a' ||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
		{
			vcount++;
			
		}
		else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		{
			ccount++;

		}
	}
		System.out.println(vcount);
		System.out.println(ccount);
}
}


