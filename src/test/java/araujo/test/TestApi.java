package araujo.test;

import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestApi {
    @Test
    public void testDadoAdministradorQuandoCadastroPetEntaoObtenhoStatusCod201() {
        // Configurar o caminho de acesso a minha API rest
        baseURI = "'https://petstore.swagger.io";


        // Cadastrar novo pedido de pet com sucesso
        given()
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"petId\": 0,\n" +
                        "  \"quantity\": 0,\n" +
                        "  \"shipDate\": \"2022-05-04T15:52:04.160Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
        .when()
                .post("/store/order")
        .then()
                .log().all()
                .assertThat()
                    .statusCode(200);

        // Pesquisar por um pet inexistente

        // Atualizar dados de um pet existente

        //Pesquisar por pets com status “pending”

    }
}
