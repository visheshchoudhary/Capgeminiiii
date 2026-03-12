package com.exception;

class SpeedInvalidException extends Exception 
{
	public SpeedInvalidException(String message) 
	{
		super(message);
	}
}


class CarSpeed 
{
	String speed;
}


class CarSpeedImplementation 
{
	public String setCarSpeed(CarSpeed sp, int spd) 
	{
		try 
		{
			if (spd < 30 || spd > 90)
				throw new SpeedInvalidException("Exception in Speed Validation");
			
			else
				sp.speed = "Valid";
		} 
		catch (SpeedInvalidException e) 
		{
			sp.speed = e.getMessage();
		}
		
		return sp.speed;
	}
}

public class CarSpeedMain 
{

	public static void main(String[] args) 
	{
		CarSpeed s = new CarSpeed();
		CarSpeedImplementation car = new CarSpeedImplementation();
		System.out.println(car.setCarSpeed(s, 25));
	}
}
