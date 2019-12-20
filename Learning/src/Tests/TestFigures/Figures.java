package Tests.TestFigures;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Tests.dataProviders.ProviderNew;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class Figures {
	@Test(dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 4)
	public void checkCircl (Double lengthOne) {
		Circle circl = new GeometricObjects().getCircle(lengthOne);
		assertEquals(circl.getClass(),"Circle");
}

	@Test(dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 4)
	public void checkQuadrat (Double lengthOne) {
	  Quadrate quad = new GeometricObjects().getQuadrate(lengthOne);
	  assertEquals(quad.getClass(),"Quadrate");
}	

	@Test(dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 4)
	public void checkRectangle (Double lengthOne, Double lengthTwo) {
		Rectangle rect = new GeometricObjects().getRectangle(lengthOne, lengthTwo);
		assertEquals(rect.getClass(),"Rectangle");
}		
	
}
