package com.accenture.tasks;

import com.accenture.ui.SearchBox;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String> {

               @Override
               public String answeredBy(Actor actor) {
                              // TODO Auto-generated method stub
            	              System.out.println(Text.of(SearchBox.LAST_MAIL_SENT).viewedBy(actor).asString());
                              return Text.of(SearchBox.LAST_MAIL_SENT).viewedBy(actor).asString();
               }

               public static TheResult is() {
                              // TODO Auto-generated method stub
                              return new TheResult();
               }

}
