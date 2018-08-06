package com.accenture.VideoConCucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.accenture.VideoConCucumber.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps santiago;

    @Given("El usuario abre youtube")
    public void Abrir_Youtube() {
    	santiago.AbrirYoutube();
    }

    @When("busca y reproduce el video '(.*)'")
    public void ElUsuarioBuscaVideo(String video) {
    	santiago.Buscar_video(video);
    }
    
    @When("comparte y selecciona GooglePlus")
    public void ElUsuarioCompartePorGooglePlus() {
    	santiago.Compartir();
    	santiago.Cambiar_a_PaginaDeGmail();
    }
    
    @When("el usuario ingresa con el usuario '(.*)' y la clave '(.*)'")
    public void IniciarSesion(String usuario,String contraseña) {		
    	santiago.IniciarSesionGmail(usuario,contraseña);
	}
    
    @When("el usuario publica el video buscado con el mensaje '(.*)'")
    public void ElUsuarioFinalmentePubicaVideo(String comment) {
    	santiago.Publicar(comment);
	}


}
