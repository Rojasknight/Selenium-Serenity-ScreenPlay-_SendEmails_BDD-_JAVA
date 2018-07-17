package com.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.ui.SearchBox;

public class Login implements Task {
	
	private final String email;
	private final String password;

	
	public Login(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Step("Select subject field")
    public <T extends Actor> void performAs(T actor) {
        
		actor.attemptsTo(
        		
        		 Enter.theValue(email)
                 .into(SearchBox.EMAIL_FIELD)
                 .thenHit(ENTER),
                 
                 Enter.theValue(password)
                 .into(SearchBox.PASS_FIELD)
                 .thenHit(ENTER)
                 
        );
    }

    public static Login login(String email, String pass) {
        return instrumented(Login.class, email, pass);
    }

}