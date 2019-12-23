package Tests.TestFigures;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tests.dataProviders.ProviderNew;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;

public class CircleTest {
	@Test(dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 0)
	@Parameters(value = "formulaIndex")
	public void checkCircumference(@Optional ("") Double formulaIndex, Double radius) {
		double curumTrue = Tests.roundUp.round(Math.PI * formulaIndex * radius);

		Circle circl = new GeometricObjects().getCircle(radius);
		double curum = Tests.roundUp.round(circl.getCircumference());

		assertEquals(curum, curumTrue);

	}

	@Test(dataProvider = "dp", dataProviderClass = ProviderNew.class, priority = 1)

	public void checkSquare(Double radius) {
		double squareTrue = Tests.roundUp.round(Math.PI * radius * radius);

		Circle circl = new GeometricObjects().getCircle(radius);
		double square = Tests.roundUp.round(circl.getSquare());

		assertEquals(square, squareTrue);	
		
	}
}

