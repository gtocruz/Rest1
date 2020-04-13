import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.http.Method.GET;

public class Test1 {

    @Test
    public void testRest1(){
        Response response = RestAssured.request(GET, "http://restapi.wcaquino.me/ola");
        Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
        Assert.assertTrue(response.statusCode() == 200);
        Assert.assertEquals(201, response.statusCode());

        ValidatableResponse validacao = response.then();
        validacao.statusCode(200);
    }
}
