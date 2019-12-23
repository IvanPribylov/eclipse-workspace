package Tests.TestFigures;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Tests.dataProviders.ProviderNew;
import Tests.dataProviders.ProviderRectangle;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class Figures {
	@Test(dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 0)
	public void checkCircl (Double radius) {
		Circle circl = new GeometricObjects().getCircle(radius);
		System.out.println(circl.getClass());
		assertEquals(circl.getClass(),Circle.class);
	}

	@Test(dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 1)
	public void checkQuadrat (Double lengthOne) {
	  Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
	  System.out.println(quad.getClass());
		 assertEquals(quad.getClass(),Quadrate.class);
}	

	@Test(dataProvider = "pr", dataProviderClass =  ProviderRectangle.class, priority = 2)
	public void checkRectangle (Double lengthOne, Double lengthTwo) {
		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		System.out.println(rect.getClass());
			assertEquals(rect.getClass(),Rectangle.class);
}		
	
}
