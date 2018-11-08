package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import framework.page_object_model_web.DarkskyPage;

public class DarkskySD {

    private DarkskyPage ds = new DarkskyPage();

    @Given("^I am on darksky website homepage$")
    public void iAmOnDarkskyHomePage() { }

    @When("^I clear search text field$")
    public void clearField() { ds.clearTextField(); }

    @And("^I enter (.+) into the search field$")
    public void enterText(String text){ds.sendText(text);}

    @And("^I click on search magnifying glass$")
    public void clickSearch(){ds.clickOnSearch();
    ds.verify();}
}
