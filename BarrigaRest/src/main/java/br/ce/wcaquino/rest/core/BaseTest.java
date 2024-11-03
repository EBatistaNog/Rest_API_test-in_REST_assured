package br.ce.wcaquino.rest.core;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class BaseTest implements Constantes {

	@BeforeClass
	public static void setup() { // static -> Isso significa que você pode chamar esse método diretamente usando  o nome da classe
						
		RestAssured.baseURI = APP_BASE_URL;
		RestAssured.port = APP_PORT;
		RestAssured.basePath = APP_BASE_PATH;

		RequestSpecBuilder reqBuilder = new RequestSpecBuilder(); // Cria uma instância de RequestSpecBuilder, que é uma classe usada para construir uma especificação de requisição.
		reqBuilder.setContentType(APP_CONTENT_TYPE); // especifica que o tipo de conteúdo é JSON
		RestAssured.requestSpecification = reqBuilder.build();
		
		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
		resBuilder.expectResponseTime(Matchers.lessThan(MAX_TIMEOUT));
		RestAssured.responseSpecification = resBuilder.build();
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	}

}
