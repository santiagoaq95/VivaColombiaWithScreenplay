package co.com.vivaair.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.WebDriver;

import co.com.vivaair.exceptions.FligthException;
import co.com.vivaair.exceptions.StartingException;
import co.com.vivaair.questions.Options;
import co.com.vivaair.questions.Page;
import co.com.vivaair.questions.See;
import co.com.vivaair.tasks.Choose;
import co.com.vivaair.tasks.Do;
import co.com.vivaair.tasks.OpenTheBrowser;
import co.com.vivaair.tasks.Pick;
import co.com.vivaair.tasks.Picks;
import co.com.vivaair.tasks.Select;
import co.com.vivaair.tasks.SelectFlight;
import co.com.vivaair.ui.VivaairHomePage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;

/**
 * @author Santiagoaq95
 *
 *
 *         Step Definitions de como buscar un vuelo en Viva Colombia
 */
public class VivaairFindFlightStepDefinition {

	@Managed(driver = "firefox", clearCookies = ClearCookiesPolicy.BeforeEachTest)
	private WebDriver hisDriver;

	Actor lukas = new Actor("Lukas");

	private VivaairHomePage vivaHomepage = new VivaairHomePage();

	//Preparación del driver que usará el actor 
	@Before
	public void setUp() {

		lukas.can(BrowseTheWeb.with(hisDriver));
		hisDriver.manage().deleteAllCookies();
		hisDriver.manage().window().maximize();
	}

	@Given("^lukas open viva colombia homepage$")
	public void lukasOpenVivaColombiaHomepage() {
		lukas.wasAbleTo(OpenTheBrowser.on(vivaHomepage));
		lukas.should(seeThat(Page.load(), is(equalTo(1))).orComplainWith(StartingException.class,
				StartingException.MESSAGE_PAGE_UNLOAD));
	}

	@Given("^he selects one trip$")
	public void heSelectsOneTrip() {
		lukas.attemptsTo(Picks.oneTrip());
	}

	@When("^he selects departure city$")
	public void heSelectsDepartureCity(DataTable city) {
		lukas.attemptsTo(Select.departure(city));
	}

	@When("^he selects arrival city$")
	public void heSelectsArrivalCity(DataTable city) {
		lukas.attemptsTo(Select.arrival(city));
	}

	@When("^he picks (\\d+) Adults, (\\d+) Children and (\\d+) infants$")
	public void he_picks_Adults_Children_and_infants(int adults, int children, int infants) {
		lukas.attemptsTo(Choose.numberOfPassengers(adults, children, infants));
	}

	@When("^he selects the depart date$")
	public void heSelectsTheDepartDate(DataTable date) {
		lukas.attemptsTo(Pick.departDate(date));
	}

	@When("^he clicks on button find your flight$")
	public void heClicksOnButtonFindYourFlight() {
		lukas.attemptsTo(Do.click());
	}

	@When("^he choose a flight \"([^\"]*)\"$")
	public void heChooseAFlight(String flight) {
		lukas.should(seeThat(Options.isVisible(flight), is(equalTo(1))).orComplainWith(FligthException.class,
				FligthException.MESSAGE_FLIGTH_NOT_FOUND));
		lukas.attemptsTo(SelectFlight.inList(flight));
	}

	@Then("^he must to watch his flight \"([^\"]*)\" to \"([^\"]*)\" on booking basket$")
	public void he_must_to_watch_his_flight_to_on_booking_basket(String cityDeparture, String cityArrival) {
		lukas.should(seeThat(See.flights(), containsString(cityDeparture + " - " + cityArrival))
				.orComplainWith(FligthException.class, FligthException.MESSAGE_FLIGTH_IS_NOT_THE_SAME));
	}

}
