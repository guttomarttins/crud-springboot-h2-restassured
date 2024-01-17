package br.com.gt.crud.controller;


import br.com.gt.crud.model.Produto;
import br.com.gt.crud.repository.ProdutoRepository;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProdutoControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private ProdutoRepository repository;

    private Produto obj;
    private String url;

    @BeforeEach
    void setup(){
        obj = new Produto();
        obj.setDescricao("refrigerante");
        obj.setMarca("coca-cola");
        obj.setValor(new BigDecimal("10.0"));
        obj.setValidade("01/01/2025");
        url = "http://localhost:"+port+"/produto";
    }

    @Test
    @DisplayName("cadastro produto")
    @Order(1)
    public void cadastroTest() {
        ExtractableResponse<Response> response = RestAssured
                .given()
                  .contentType(ContentType.JSON)
                  .body(obj)
                .when()
                  .post(url)
                .then()
                  .statusCode(200)
                  .extract();
        assertNotNull(response.jsonPath().getString("id"));
        assertEquals("refrigerante", response.jsonPath().getString("descricao"));
        assertEquals("coca-cola", response.jsonPath().getString("marca"));
        assertEquals("10.0", response.jsonPath().getString("valor"));
        assertEquals("01/01/2025", response.jsonPath().getString("validade"));
    }

    @Test
    @DisplayName("Obtem produtos")
    @Order(2)
    public void obtemTodosTest() {
        ExtractableResponse<Response> response = RestAssured
                .given()
                  .contentType(ContentType.JSON)
                .when()
                  .get(url)
                .then()
                  .statusCode(200)
                  .extract();
        assertNotNull(response.jsonPath().getList("response"));
    }
}
