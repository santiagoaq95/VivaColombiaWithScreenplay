package co.com.vivaair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.vivaair.models.Passenger;
import co.com.vivaair.ui.VivaairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

/**
 * @author Santiagoaq95
 *
 */
public class Choose implements  Task{

	private Passenger passengers= new Passenger();
	
	public Choose(int adults, int children, int infants) {
		passengers.setAdults(adults);
		passengers.setChildren(children);
		passengers.setInfants(infants);
	}
	/**
	 * Task del actor en donde se hace un scroll al botón para visualizar mejor la pagina 
	 * en está se introduccirá los datos de cuantos adultos, niños y bebes irán en el vuelo 
	 * 
	 */
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Scroll.to(VivaairHomePage.HOMEPAGE_BUTTON_FIND_FLIGHT));
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_CLICK_ADULTS));
		actor.attemptsTo(Enter.theValue(String.valueOf(passengers.getAdults())).into(VivaairHomePage.HOMEPAGE_ADULTS).thenHit(Keys.ENTER));

		
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_CLICK_CHILDREN));
		actor.attemptsTo(Enter.theValue(String.valueOf(passengers.getChildren())).into(VivaairHomePage.HOMEPAGE_CHILDREN).thenHit(Keys.ENTER));	
		
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_CLICK_INFANTS));
		actor.attemptsTo(Enter.theValue(String.valueOf(passengers.getInfants())).into(VivaairHomePage.HOMEPAGE_INFANTS).thenHit(Keys.ENTER));
		
	}

	public static Choose numberOfPassengers(int adults, int children, int infants) {
		
		return instrumented(Choose.class, adults,children,infants);
	}

}
