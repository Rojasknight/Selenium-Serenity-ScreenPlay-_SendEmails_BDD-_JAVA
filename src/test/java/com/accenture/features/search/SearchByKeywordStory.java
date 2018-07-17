package com.accenture.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.accenture.tasks.Dato;
import com.accenture.tasks.Excel;
import com.accenture.tasks.Login;
import com.accenture.tasks.OpenTheApplication;
import com.accenture.tasks.Send;
import com.accenture.tasks.Sent;
import com.accenture.tasks.TheResult;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() throws InterruptedException {

        givenThat(anna).wasAbleTo(openTheApplication);//precondicion
        when(anna).attemptsTo(Login.login("user", "password"));
        
        for(Dato informacion: Excel.lectura()) {
        	
        	when(anna).attemptsTo(Send.send(informacion.getCorreo(), "hey there", "hi there"));
        	
	        System.out.println("------- Correo enviado a :"+ informacion.getCorreo());
        }
        //when(anna).attemptsTo(Sent.Click());
        
        then(anna).should(eventually(seeThat(TheResult.is(), containsString("Se envió el mensaje."))));//resultado
        System.out.println("-------  :"+ TheResult.is());
    }
}