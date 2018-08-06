package com.accenture.VideoConCucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://Youtube.com")
public class DictionaryPage extends PageObject {

	@FindBy(xpath="/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElementFacade SearchBar;

    @FindBy(xpath="/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/ytd-searchbox[1]/form[1]/button[1]")
    private WebElementFacade Search;
    
    @FindBy(xpath="//a[@title='El Duende Alegre -  Parranda']")
    private WebElementFacade ClickVideo;
    
    @FindBy(xpath="//button[@class='ytp-play-button ytp-button']")
    private WebElementFacade StopVideo;
    
    @FindBy(xpath="//button[@aria-label=\"Share\"]")
    private WebElementFacade ShareVideo;
    
    @FindBy(xpath="/html[1]/body[1]/ytd-app[1]/ytd-popup-container[1]/paper-dialog[1]/ytd-unified-share-panel-renderer[1]/div[3]/ytd-third-party-network-section-renderer[1]/div[1]/ytd-third-party-share-target-section-renderer[1]/div[1]/div[1]/ytd-share-target-renderer[4]/button[1]")
    private WebElementFacade ShareGooglePlus;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/content[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElementFacade User; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    private WebElementFacade Nextuser; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/content[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElementFacade Password; 
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    private WebElementFacade Nextpassword; 
    
    @FindBy(xpath="//textarea[@id='pg7w8']")
	private WebElementFacade Mensaje;
	
	@FindBy(xpath="//span[text()='Post']")
	private WebElementFacade Publicar;

    public void busquedadeVideo(String cancion) {
        SearchBar.type(cancion);
        Search.click();
        ClickVideo.click();
        StopVideo.click();
    }
    
    public void compartirVideo() {
        ShareVideo.click();
        ShareGooglePlus.click();
    }
    
    public void iniciarSesionGmail(String user, String password) {
    	User.type(user);
    	Nextuser.click();
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Password.type(password);
    	Nextpassword.click();
    }
    
    public void publicarVideo(String mens) {
    	Mensaje.type(mens);
    	Publicar.click();
    }


  
}