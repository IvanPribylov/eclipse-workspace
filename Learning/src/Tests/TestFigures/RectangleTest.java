package Tests.TestFigures;


import  Tests.TestFigures.SquareValidator;
import  Tests.TestFigures.NotQuadratException;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.ExecutionException;

import org.testng.annotations.Test;

import Tests.dataProviders.ProviderRectangle;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;



public class RectangleTest {
	

	

	@Test(dataProvider = "twoNumbers", dataProviderClass = ProviderRectangle.class, priority = 0)
	public void checkRectangle(double lengthOne, double lengthTwo) {
		double trueSquare = Tests.roundUp.round(lengthOne * lengthTwo);

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double square = Tests.roundUp.round(rect.getSquare());
		
		assertEquals(square, trueSquare);
		
		}

	@Test(dataProvider = "twoNumbers", dataProviderClass =  ProviderRectangle.class, priority = 1)
	public void checkPerimetr(double lengthOne, double lengthTwo) {
		double truePerimetr = Tests.roundUp.round(lengthOne * 2 + lengthTwo * 2);

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double perimetr = Tests.roundUp.round(rect.getPerimeter());
		
		assertEquals(perimetr, truePerimetr);
	
	}
	
	@Test(dataProvider = "twoNumbers", dataProviderClass =  ProviderRectangle.class, priority = 2)
	public void checkQuadrat(double lengthOne, double lengthTwo) 
	{
		boolean trueQuadrat;
		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		if (lengthOne == lengthTwo)
		{
			trueQuadrat = true;
		}
			
		else 
		{
			trueQuadrat = false;
		 
				}
		
		assertEquals(trueQuadrat, rect.isQuadrate());
			}

	@Test(expectedExceptions = NotQuadratException.class,dataProvider = "twoNumbers", dataProviderClass =  ProviderRectangle.class,  priority = 3)
	public void checkSquare(double lengthOne, double lengthTwo) throws NotQuadratException
	{
		
		
		assertTrue(SquareValidator.square(lengthOne, lengthTwo));	

}
	
}

