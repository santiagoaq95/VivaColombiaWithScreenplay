package co.com.vivaair.questions;

import co.com.vivaair.ui.VivaairFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Options implements Question<Integer> {

	private String optionFlight;
	public Options(String flight) {
		optionFlight=flight;
	}

	@Override
	public Integer answeredBy(Actor actor) {
		
		return Text.of(VivaairFlightPage.FLIGHTPAGE_LIST_FLIGHTS.of(optionFlight)).viewedBy(actor).asList().size();
	}

	public static Options isVisible(String flight) {
		// TODO Auto-generated method stub
		return new Options(flight);
	}

}
