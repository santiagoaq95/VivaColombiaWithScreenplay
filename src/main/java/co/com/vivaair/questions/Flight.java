package co.com.vivaair.questions;

import co.com.vivaair.ui.VivaairFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Flight implements Question<String>{
	private String flight;
	
	public Flight(String flight) {
		this.flight=flight;
	}
	public static Flight onScreen(String flight) {
		// TODO Auto-generated method stub
		return new Flight(flight);
	}

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(VivaairFlightPage.FLIGHTPAGE_LIST_FLIGHTS.of(this.flight)).viewedBy(actor).asString();
	}

}
