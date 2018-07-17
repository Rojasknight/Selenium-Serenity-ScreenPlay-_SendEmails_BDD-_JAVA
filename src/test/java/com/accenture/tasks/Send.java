package com.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.ui.SearchBox;

public class Send implements Task {
	
	private final String to;
	private final String subject;
	private final String description;
	

	
	public Send(String to, String subject, String description) {
		this.to = to;
		this.subject = subject;
		this.description = description;
	}

	@Step("Select subject field")
    public <T extends Actor> void performAs(T actor) {
        
		actor.attemptsTo(
        		//Boton redactar
				 Click.on(SearchBox.NEW_EMAIL_BOTTON),
				 
				 //Escribir destinatario
				 Enter.theValue(to)
                 .into(SearchBox.USER_FIELD)
                 .thenHit(ENTER),
                 
                 //Click en asunto
                 Click.on(SearchBox.SUBJECT_FIELD),
                 
                 //Escribir asunto
                 Enter.theValue(subject)
                 .into(SearchBox.SUBJECT_FIELD)
                 .thenHit(ENTER),
                 
                 //Enviar email
                 Click.on(SearchBox.SUBMIT_BOTTON)
                
                 
                 
        );
    }

    public static Send send(String email, String subject, String description) {
        return instrumented(Send.class, email, subject, description);
    }

}