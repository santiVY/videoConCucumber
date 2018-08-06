package com.accenture.VideoConCucumber.steps.serenity;

import com.accenture.VideoConCucumber.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void AbrirYoutube() {
    	dictionaryPage.open();
        WebDriver driver = dictionaryPage.getDriver();
        driver.manage().window().maximize();
    }
    
    @Step
    public void Buscar_video(String video) {              
    	dictionaryPage.busquedadeVideo(video);
    }    
    
    @Step
    public void Compartir() {
    	dictionaryPage.compartirVideo();        	
    }    
    @Step
    public void Cambiar_a_PaginaDeGmail() {	
    	WebDriver driver = dictionaryPage.getDriver();
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
	}
    @Step
    public void IniciarSesionGmail(String usuario,String contraseña) {		
    	dictionaryPage.iniciarSesionGmail(usuario, contraseña);
	}

    @Step
    public void Publicar(String mensaje) {
    	dictionaryPage.publicarVideo(mensaje);
	}   
}