package co.com.vivaair.tasks;

import co.com.vivaair.ui.VivaairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Picks implements Task {

	/**
	 * Tareas del actor en donde se da click en cerrar un mesaje y se escoge solo
	 * vuelo de ida
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_BUTTON_MESSAGE));
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_ONETRIP));

	}

	public static Picks oneTrip() {
		// TODO Auto-generated method stub
		return new Picks();
	}

}
