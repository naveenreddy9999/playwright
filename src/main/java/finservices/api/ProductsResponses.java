package finservices.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ScriptReader;

import java.util.HashMap;

public class ProductsResponses {

    private static ProductsResponses productsResponses = null;

    HashMap<String, String> setResponses = new HashMap<>();

    private ProductsResponses() {
    }

    public static ProductsResponses getInstance() {
        if (productsResponses == null) {
            productsResponses = new ProductsResponses();
        }
        return productsResponses;
    }

    private static final String TOTAL_PRODUCTS_URL = "https://dummyjson.com/products";
    private static final String ADD_PERSON_URL = "https://reqres.in/api/users";
    Response response;

    public void getAllProductsResponses() {
        response = RestAssured.given().get(TOTAL_PRODUCTS_URL).prettyPeek();
    }

    public void validateStatusCode(int statusCode) {
        Assert.assertEquals("Response is not matching with expected", statusCode, response.getStatusCode());
    }

    public void verifyProductTitle(String title) {
        String tileResponse = response.jsonPath().getString("products[0].title");
        Assert.assertEquals("Title is not matching with expected filed", tileResponse, title);
    }

    public void addPersonDetails() {
//        String payload = """
//                {
//                    "name": "morpheus",
//                    "job": "leader"
//                }""";
        String body = ScriptReader.getInstance().getScriptDetails("payloads/payload","EmployeeData","naveen","Automation Engineer");
        response = RestAssured
                .given().
                header("Content-Type", "application/json").
                body(body).post(ADD_PERSON_URL + "/2")
                .prettyPeek();
        setResponses.put("ID", response.jsonPath().getString("id"));

    }

    public void verifyPersonName(String name) {
        String nameResponse = response.jsonPath().getString("name");
        Assert.assertEquals("Title is not matching with expected filed", nameResponse, name);
    }

    public void updatePersonDetails() {
        String payload = """
                {
                    "name": "naveen",
                    "job": "Automation Tester"
                }""";
        RestAssured.baseURI = ADD_PERSON_URL;
        response = RestAssured
                .given().
                header("Content-Type", "application/json").
                body(payload).post("/" + setResponses.get("ID"))
                .prettyPeek();
    }

    public void updatePersonJobDetails(String job) {
        String payload = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"" + job + "\"\n" +
                "}";
        RestAssured.baseURI = ADD_PERSON_URL;
        response = RestAssured
                .given().
                header("Content-Type", "application/json").
                body(payload).post("/" + setResponses.get("ID"))
                .prettyPeek();
    }

    public void verifyUpdatedJobName(String jobName) {
        String jobResponse = response.jsonPath().getString("job");
        Assert.assertEquals("Job is not matching with expected filed", jobResponse, jobName);
    }

    public void getPersonName() {
        RestAssured.baseURI = ADD_PERSON_URL;
        response = RestAssured
                .given()
                .get("/2")
                .prettyPeek();
    }

    public void deleteResourceDetails() {
        System.out.println(setResponses.get("ID"));
        response = RestAssured
                .given()
                .delete("/" + setResponses.get("ID"))
                .prettyPeek();
    }

    public void addNameAndJob(String name, String job) {
        String body = ScriptReader.getInstance().getScriptDetails("payloads/payload","EmployeeData",name,job);
        response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .post(ADD_PERSON_URL + "/2")
                .prettyPeek();
    }
}
