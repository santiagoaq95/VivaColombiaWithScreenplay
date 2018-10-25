package co.com.vivaair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import co.com.vivaair.models.City;
import co.com.vivaair.ui.VivaairHomePage;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Select implements Task{
	private City city=new City();
	
	public Select(String city) {
		this.city.setName(city);
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_CITY_CLICK_DEPARTURE));
		actor.attemptsTo(Enter.theValue(this.city.getName()).into(VivaairHomePage.HOMEPAGE_CITY_DEPARTURE).thenHit(Keys.ENTER));
		
		
		
	}

	public static Select departure(DataTable city) {
		List<Map<String, String>> params = city.asMaps(String.class, String.class);
		String cityDeparture = params.get(0).get("cityDeparture");
		return instrumented(Select.class, cityDeparture);
	}
	public static Performable arrival(DataTable city2) {
		List<Map<String, String>> params = city2.asMaps(String.class, String.class);
		String cityDeparture = params.get(0).get("cityArrival");
		return instrumented(SelectArrival.class, cityDeparture);
	}
	

}
