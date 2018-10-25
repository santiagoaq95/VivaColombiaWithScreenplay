package co.com.vivaair.tasks;

import org.openqa.selenium.Keys;

import co.com.vivaair.models.City;
import co.com.vivaair.ui.VivaairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SelectArrival implements Task {

	private City city = new City();

	public SelectArrival(String city) {
		this.city.setName(city);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_CITY_CLICK_ARRIVAL));
		actor.attemptsTo(Enter.theValue(this.city.getName()).into(VivaairHomePage.HOMEPAGE_CITY_ARRIVAL).thenHit(Keys.ENTER));
	}

}
