package co.com.vivaair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.vivaair.ui.VivaairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Do implements Task{

	/**
	 * Tarea del actor en la cual se hace click en el botón para buscar los vuelos 
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VivaairHomePage.HOMEPAGE_BUTTON_FIND_FLIGHT));
		
		
	}

	public static Do click() {
		// TODO Auto-generated method stub
		return instrumented(Do.class);
	}

}
