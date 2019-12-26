package Tests.TestFigures;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Tests.dataProviders.ProviderNew;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

public class QuadratTest 	{
	
	@Test(dataProvider = "oneNumber", dataProviderClass = ProviderNew.class, priority = 0)
	public void checkSquare (double lengthOne) {
		double trueSquare = Tests.roundUp.round(lengthOne * lengthOne);

		Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
		double square = Tests.roundUp.round(quad.getSquare());

		assertEquals(square, trueSquare);
		
	}

	@Test( dataProvider = "oneNumber", dataProviderClass = ProviderNew.class, priority = 1)
	public void checkPerimetr(double lengthOne) {
		double truePerimetr = Tests.roundUp.round(lengthOne * 4);

	  Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
		double perimetr = Tests.roundUp.round(quad.getPerimeter());

		assertEquals(perimetr, truePerimetr);

	}

}
