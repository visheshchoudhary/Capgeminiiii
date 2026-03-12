package com.playlist;

class InvalidCodeException extends Exception
{
	public InvalidCodeException(String message)
	{
		super(message);
	}
}

class Repository
{
	public static String getCountryName(String countryCode) throws InvalidCodeException
	{
		int a = Integer.valueOf(countryCode);
		if(a > 70 && a <= 99)
			return "India";
		if(a == 908)
			return "US";
		if(a == 11)
			return "Dial somewhere outside of USA";
		else
			throw new InvalidCodeException("No country with the given code found");
	}
}

class RepositoryImplementation
{
	public static String getCountry(String countryCode) throws InvalidCodeException
	{
		if(countryCode.length() > 3 || countryCode.length() < 2)
		{
			throw new InvalidCodeException("Invalid code details found");
		}
		
		return Repository.getCountryName(countryCode);
	}
}

public class Q5 {

	public static void main(String[] args) {
		RepositoryImplementation ri = new RepositoryImplementation();
		
		try
		{
			System.out.println(ri.getCountry("011"));
		}
		catch(InvalidCodeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
