package br.ce.wcaquino.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {
    String APP_BASE_URL = "https://barrigarest.wcaquino.me"; // Define a URL base da API que será utilizada nas requisições.
    Integer APP_PORT = 443; // Porta padrão para requisições HTTPS (80 é a porta padrão para HTTP)
    String APP_BASE_PATH = ""; // Se a API tiver um caminho adicional, como /v1 ou /api, você o colocaria aqui. Atualmente, está vazio.
    
    ContentType APP_CONTENT_TYPE = ContentType.JSON; // Define o tipo de conteúdo padrão para as requisições como JSON

    Long MAX_TIMEOUT = 5000L; // Define um tempo limite máximo para as requisições (em milissegundos)
}
