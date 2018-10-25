package co.com.vivaair.questions;


import co.com.vivaair.ui.VivaairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Page implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {
		//Question para validar si hay elemento en la pagina 
		if (Text.of(VivaairHomePage.HOMEPAGE_ONETRIP).viewedBy(actor).asList().size() > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static Page load() {
		// TODO Auto-generated method stub
		return new Page();
	}

}
