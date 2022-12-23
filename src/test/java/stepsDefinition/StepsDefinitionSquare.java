package stepsDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.PageObjectsSquare;

public class StepsDefinitionSquare {

    PageObjectsSquare pageObjectsSquare = new PageObjectsSquare();

    @Given("^that the user is on the hammer\\.js page$")
    public void thatTheUserIsOnTheHammerJsPage() {
        pageObjectsSquare.openPage();
    }

    @When("^the user makes a longclick on the green frame$")
    public void theUserMakesALongclickOnTheGreenFrame() throws InterruptedException {
        pageObjectsSquare.longClick();
    }

    @Then("^the green frame expands its size to (\\d+) x (\\d+)$")
    public void theGreenFrameExpandsItsSizeToX(int arg0, int arg1) {
        int[] expectedSize = new int[]{arg0, arg1};
        int[] realSize = pageObjectsSquare.getSquareSize();
        Assert.assertArrayEquals(expectedSize, realSize);
    }

    @After
    public void AfterAllTest() {
        pageObjectsSquare.closePage();
    }
}