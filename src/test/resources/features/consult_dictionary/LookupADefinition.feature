Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario: El usuario abre youtube y buscar 'duende alegra'
    Given El usuario abre youtube
    When busca y reproduce el video 'duende alegre'     
    When comparte y selecciona GooglePlus
    When el usuario ingresa con el usuario 'semail' y la clave 'contraseña'
    When el usuario publica el video buscado con el mensaje 'Publicacion automatica con cucumber' 
