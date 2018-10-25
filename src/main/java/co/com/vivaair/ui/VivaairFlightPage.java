package co.com.vivaair.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaairFlightPage extends PageObject{
	
	public static final Target FLIGHTPAGE_BOOKING_BASKET = Target.the("FlightPage name of fligths in the booking basket").locatedBy("//*[@id=\"basketBody\"]/div[1]/div[1]/div[1]");
	public static final Target FLIGHTPAGE_LIST_FLIGHTS = Target.the("FlightPage list of flights").locatedBy("//*[@id=\"divAvailabilityOut\"]/div[{0}]/div[1]/div[2]/label[1]");
}
