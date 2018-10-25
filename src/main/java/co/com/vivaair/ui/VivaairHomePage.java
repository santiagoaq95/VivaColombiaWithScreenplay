package co.com.vivaair.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author Santiagoaq95
 * 
 *         Clase que hereda de PageObject, en la cual se tiene la URL de la
 *         pagina y todos los mapeos de esta dentro de lso Target
 *
 */
@DefaultUrl("https://vivaair.com/en-co")
public class VivaairHomePage extends PageObject {

	public static final Target HOMEPAGE_ONETRIP = Target.the("Homepage radio button One Trip")
			.locatedBy("//span[.='One way']");
	public static final Target HOMEPAGE_ROUNDTRIP = Target.the("Homepage radio button Round trip")
			.locatedBy("//span[.='Round trip']");
	public static final Target HOMEPAGE_CITY_CLICK_DEPARTURE = Target.the("Homepage click city departure")
			.locatedBy("//*[@id=\"s2id_departureCityDrop\"]/a/span[2]/b");
	public static final Target HOMEPAGE_CITY_DEPARTURE = Target.the("Homepage select city departure")
			.locatedBy("//input[@id='s2id_autogen20_search']");
	public static final Target HOMEPAGE_CITY_CLICK_ARRIVAL = Target.the("Homepage click city departure ")
			.locatedBy("//*[@id=\"s2id_arrivalCityDrop\"]/a/span[2]/b");
	public static final Target HOMEPAGE_CITY_ARRIVAL = Target.the("Homepage select city departure ")
			.locatedBy("//input[@id='s2id_autogen21_search']");
	public static final Target HOMEPAGE_CLICK_ADULTS = Target.the("Homepage click number of adults")
			.locatedBy("//*[@id=\"select2-chosen-22\"]");
	public static final Target HOMEPAGE_ADULTS = Target.the("Homepage select number of adults")
			.locatedBy("//input[@id='s2id_autogen22_search']");
	public static final Target HOMEPAGE_CLICK_CHILDREN = Target.the("Homepage click number of children")
			.locatedBy("//*[@id=\"s2id_Children\"]/a/span[2]/b");
	public static final Target HOMEPAGE_CHILDREN = Target.the("Homepage select number of children")
			.locatedBy("//input[@id='s2id_autogen23_search']");
	public static final Target HOMEPAGE_CLICK_INFANTS = Target.the("Homepage click number of infants")
			.locatedBy("//*[@id=\"select2-chosen-25\"]");
	public static final Target HOMEPAGE_INFANTS = Target.the("Homepage select number of infants")
			.locatedBy("//input[@id='s2id_autogen25_search']");
	public static final Target HOMEPAGE_DEPART_DATE = Target.the("Homepage select depart date")
			.locatedBy("//input[@id='DepartureDateForDisplay']");
	public static final Target HOMEPAGE_ARRIVAL_DATE = Target.the("Homepage select arrival date")
			.locatedBy("//input[@id='ReturnDateForDisplay']");
	public static final Target HOMEPAGE_EXACT_DATE = Target.the("Homepage radio button exact date")
			.locatedBy("//span[.='Exact date']");
	public static final Target HOMEPAGE_FLEXIBLE_DATES = Target.the("Homepage radio button flexible dates")
			.locatedBy("//span[.='Flexible dates']");
	public static final Target HOMEPAGE_BUTTON_FIND_FLIGHT = Target.the("Homepage button find flight")
			.locatedBy("//a[@id='continueLink']");
	public static final Target HOMEPAGE_BUTTON_MESSAGE = Target.the("Homepage button message down")
			.locatedBy("//div[@id='MessageTopBottomPart10136']//button");
	public static final Target HOMEPAGE_SORRY_MESSAGE = Target.the("Homepage sorry message")
			.locatedBy("//div[@class='warningContainer noflights out']");

}
