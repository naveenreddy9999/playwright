package stepDefinition.api;

import finservices.api.ProductsResponses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class APIResponsesStepDefinition {
    ProductsResponses productsResponses;
    public APIResponsesStepDefinition(){
        this.productsResponses=ProductsResponses.getInstance();
    }
    @Given("get products details")
    public void get_products_details() {
        productsResponses.getAllProductsResponses();
    }

    @Then("Response status code is {int}")
    public void responseStatusCodeIs(int statusCodes) {
        productsResponses.validateStatusCode(statusCodes);
    }

    @Then("Verify product tile is {string}")
    public void verifyProductTileIs(String title) {
        productsResponses.verifyProductTitle(title);
    }

    @Given("add person details")
    public void addPersonDetails() {
        productsResponses.addPersonDetails();
    }

    @Then("Verify person name is {string}")
    public void verifyPersonNameIs(String name) {
        productsResponses.verifyPersonName(name);
    }

    @Given("update person details")
    public void updatePersonDetails() {
        productsResponses.updatePersonDetails();
    }

    @Given("update person job {string} details")
    public void updatePersonJobDetails(String job) {
        productsResponses.updatePersonJobDetails(job);
    }

    @Then("Verify person Job is {string}")
    public void verifyPersonJobIs(String jobName) {
        productsResponses.verifyUpdatedJobName(jobName);
    }

    @Given("get person name details")
    public void getPersonNameDetails() {
        productsResponses.getPersonName();
    }

    @Given("Delete resource details")
    public void deleteResourceDetails() {
        productsResponses.deleteResourceDetails();
    }

    @Given("add name {string} and job {string}")
    public void addNameAndJob(String name, String job) {
        productsResponses.addNameAndJob(name,job);
    }
}
