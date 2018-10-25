package co.com.vivaair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.vivaair.ui.VivaairFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectFlight implements Task{
	private String flight;
	
	public SelectFlight(String fligth) {
		this.flight=fligth;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
			
			actor.attemptsTo(Scroll.to(VivaairFlightPage.FLIGHTPAGE_LIST_FLIGHTS.of(this.flight)));
			actor.attemptsTo(Click.on(VivaairFlightPage.FLIGHTPAGE_LIST_FLIGHTS.of(this.flight)));
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			actor.attemptsTo(Click.on("//span[.='Agree']"));
		
	}

	public static SelectFlight inList(String flight) {
		
		return instrumented(SelectFlight.class, flight);
	}
	

}
