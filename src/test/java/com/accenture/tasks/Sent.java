package com.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.ui.SearchBox;

public class Sent implements Task {



    @Step("Search for #searchTerm")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //email Enviados
                Click.on(SearchBox.SENT_BOTTON)
        );
    }

    public static Sent Click() {
        return instrumented(Sent.class);
    }

}
