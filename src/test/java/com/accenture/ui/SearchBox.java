package com.accenture.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchBox {
	
    public static Target SEARCH_FIELD = Target.the("search field").located(By.name("q"));
    public static Target EMAIL_FIELD = Target.the("search field").located(By.xpath("//*[@id='identifierId']"));
    public static Target PASS_FIELD = Target.the("search field").located(By.name("password"));
    
    public static Target NEW_EMAIL_BOTTON = Target.the("search field").located(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3' or text()='REDACTAR']"));
    public static Target USER_FIELD = Target.the("search field").located(By.xpath("//textarea[@name='to']"));
    public static Target SUBJECT_FIELD = Target.the("search field").located(By.xpath("//input[@name='subjectbox']"));
    public static Target SUBMIT_BOTTON = Target.the("search field").located(By.xpath("//*[text()='Enviar']"));
    public static Target SENT_BOTTON = Target.the("search field").located(By.xpath("//a[contains(text(),'Enviados')]"));
    public static Target LAST_MAIL_SENT = Target.the("Field to").located(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div[2]/span/span[1]"));
}
////div[@class='b8 UC bAp']//div[@class='vh']