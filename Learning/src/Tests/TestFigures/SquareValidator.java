package Tests.TestFigures;


import  Tests.TestFigures.NotQuadratException;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class SquareValidator {
			
	
	public static boolean square(double lengthOne, double lengthTwo) throws NotQuadratException 
	{
//		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
//		boolean quad = rect.isQuadrate();
		
	boolean quad;
	if (lengthOne == lengthTwo)
	{
		quad = true;
		
	}
	else
	{
		quad = false;
		throw new NotQuadratException("Not Square, but ok");
	}
		return quad;
}
}
