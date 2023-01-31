import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchosTest {

    @Test
    void shouldReturnPostmanEchosTest() {
// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("https://postman-echo.com/post") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                //.body("", hasSize(0))
        ;
    }
}