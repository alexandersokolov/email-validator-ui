package com.email_validator_ui.email_validator_ui;

public class validateEmail 
{
	public boolean validateEmail(String email)
	{
		boolean result = true;
		
		//Check if there is a single @ character
		int counter = 0;
		for( int i=0; i<email.length(); i++ ) {
		    if( email.charAt(i) == '@' ) {
		        counter++;
		    } 
		}
		
		if(counter!=1)
		{
			result = false;
		}
		
		//Check if there is an . character
		if(!email.contains("."))
		{
			result = false;
		}
		
		//Check if the email is at least 8 characters long
		if(email.length()<8)
		{
			result = false;
		}
		
		//Check if the email is 25 characters of less
		if(email.length()>25)
		{
			result = false;
		}
		
		return result;

	}
}