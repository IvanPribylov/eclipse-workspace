package Tests.TestFigures;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Tests.dataProviders.ProviderRectangle;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;


public class RectangleTest {
	@Test(dataProvider = "pr", dataProviderClass = ProviderRectangle.class, priority = 0)
	public void checkRectangle(Double lengthOne, Double lengthTwo) {
		double trueSquare = Tests.roundUp.round(lengthOne * lengthTwo);

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double square = Tests.roundUp.round(rect.getSquare());
		
		assertEquals(square, trueSquare);
		
		}

	@Test(dataProvider = "pr", dataProviderClass =  ProviderRectangle.class, priority = 0)
	public void checkPerimetr(Double lengthOne, Double lengthTwo) {
		double truePerimetr = Tests.roundUp.round(lengthOne * 2 + lengthTwo * 2);

		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		double perimetr = Tests.roundUp.round(rect.getPerimeter());
		
		assertEquals(perimetr, truePerimetr);
	
	}
	
	@Test(dataProvider = "pr", dataProviderClass =  ProviderRectangle.class, priority = 0)
	public void checkQuadrat(Double lengthOne, Double lengthTwo) {
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
	
}
