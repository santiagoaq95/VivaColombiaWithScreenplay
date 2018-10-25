package co.com.vivaair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import co.com.vivaair.models.Date;
import co.com.vivaair.ui.VivaairHomePage;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;

public class Pick implements Task{
	private Date date= new Date();
	public Pick(String day, String month, String year) {
		date.setYear(year);
		date.setMonth(month);
		date.setDay(day);
	}
	
	/**
	 * Tareas del actor en el cual se selecciona la fecha de partida
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Scroll.to(VivaairHomePage.HOMEPAGE_DEPART_DATE));
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_DEPART_DATE));
		actor.attemptsTo(Hit.the(Keys.DELETE).keyIn(VivaairHomePage.HOMEPAGE_DEPART_DATE));
		actor.attemptsTo(Enter.theValue(date.getDay()+"/"+date.getMonth()+"/"+date.getYear()).into(VivaairHomePage.HOMEPAGE_DEPART_DATE));
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_CLICK_ADULTS), Hit.the(Keys.ENTER).into(VivaairHomePage.HOMEPAGE_ADULTS));
		
		
	}

	public static Pick departDate(DataTable date) {
		List<Map<String, String>> params = date.asMaps(String.class, String.class);
		String year =params.get(0).get("year");
		String month =params.get(0).get("month");
		String day =params.get(0).get("day");
		return instrumented(Pick.class, day, month, year);
	}

}
