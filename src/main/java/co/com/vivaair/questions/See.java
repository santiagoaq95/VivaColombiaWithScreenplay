package co.com.vivaair.questions;

import co.com.vivaair.ui.VivaairFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class See implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(VivaairFlightPage.FLIGHTPAGE_BOOKING_BASKET).viewedBy(actor).asString();
	}
	public static See flights() {
		// TODO Auto-generated method stub
		return new See();
	}

}
