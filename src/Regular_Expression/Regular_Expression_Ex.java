package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression_Ex {

	public static void main(String[] args) {
	
    //String source="abc.kumar@gmail.com,  abc.yyz12@gmail.com,  abc.yyz@gmail.com";
		
	//String pattern="[a-z]*\\.[a-z]*\\@gmail\\.com";
	
	String source="GHJI5_600E";
	
    String pattern ="[A-Z]{5}[0-9]{4}[A-Z]{1}";
	
	validateRegEx(source, pattern );

	}
	
	
	
	public static void validateRegEx(String source, String pattern )
	{
		boolean flag = false;
		
		if(source.length() != 10 )
		{
			System.out.println("Invalid length");			
		}
		else
		{
		Pattern ptrn = Pattern.compile(pattern);
		
		Matcher matches = ptrn.matcher(source);
		
		if(matches.find())
			System.out.println("format is accepted");
		else
			System.out.println("incorrect format");
		}
		
		/*
		while(matches.find())
		{
			//System.out.println("Pattern is avilable");
			System.out.println(matches.group());
			flag=true;
		}
		
		if(! flag)
		{
			System.out.println("No Pattern Exist");
		}
		//return flag;
		 * */
		
	
	}
}

