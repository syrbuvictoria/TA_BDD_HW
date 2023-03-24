package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;


public class RegisterSteps {

    @Given("user is on {string} page")
    public void makeSureOnPage(String pageName) {
        System.out.println("User is on " + pageName + " page");
    }

    @When("user selects {string} menu option")
    public void clickOnButton(String buttonName) {
        System.out.println("User is on " + buttonName + " page");
    }

    @And("user navigates to {string} page")
    public void clickOnForm(String formName) {
        System.out.println(formName + " is displayed");
    }

    @Then("{string} is displayed")
    public void pageIsDisplayed(String pageName) {
        System.out.println(pageName + " is displayed");
    }

    @When("user provides following data")
    public void populateFields(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        data.forEach((key, value) -> System.out.println("Field " + key + " is populated with data: " + value));
    }

    @And("user fills {string} {string} field with {string} data")
    public void populateField(String dataToEnter, String fieldName, String typeOfData) {
        switch (typeOfData) {
            case "valid" -> System.out.println(fieldName + " field is populated with valid data: " + dataToEnter);
            case "invalid" -> System.out.println(fieldName + " field is populated with invalid data: " + dataToEnter);
        }
    }


    @And("user click on {string} button")
    public void clickOnSubmitButton(String submitButton) {
        System.out.println("User clicked on " + submitButton);
    }

    /*@Then("user successfully submitted the form and a pop-up \"Thanks for submitting the form\" with following data is displayed")
    public void populatedField(String expectedMessage, DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : rows) {
            for (Map.Entry<String, String> entry : row.entrySet()) {
                System.out.println(entry.getKey() + " field is populated with valid data: " + entry.getValue());
            }
        }*/

        /*// Validate the expected pop-up message
        String actualMessage = getPopupMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }*/

    // helper method to simulate getting the pop-up message
    private String getPopupMessage() {
        return "Thanks for submitting the form";
    }

    @Then("user successfully submitted the form and a pop-up \"Thanks for submitting the form\" with following data is displayed")
    public void populatedField(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : rows) {
            for (Map.Entry<String, String> entry : row.entrySet()) {
                System.out.println(entry.getKey() + " field is populated with valid data: " + entry.getValue());
            }
        }
    }

/*    @Then("user {string} submitted the form and {string} is displayed")
    public void populatedField(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        String dataType = "valid"; // change this to "invalid" to test invalid data
        switch(dataType) {
            case "successfully":
                for (Map<String, String> row : rows) {
                    for (Map.Entry<String, String> entry : row.entrySet()) {
                        System.out.println(entry.getKey() + " field is populated with valid data: " + entry.getValue());
                    }
                }
                break;
            case "unsuccessfully":
                // do nothing for invalid data
                break;
            default:
                System.out.println("Invalid data type.");
                break;
        }
    }*/

/*    @Then("user unsuccessfully submitted the form and {string} is displayed")
    public void messageIsDisplayed(String elementName, String message) {
        System.out.println(elementName + " element is located");
        System.out.println("Message is displayed:\n" + message);
    }*/

    @Then("user unsuccessfully submitted the form and nothing is displayed")
    public void formSubmissionFailed() {
        // Add code to simulate a failed form submission
        // and ensure that no message is displayed.
        // For example, you could throw an exception here
        // to simulate a failure and verify that no message
        // is displayed to the user.
        //throw new RuntimeException("Form submission failed");
    }
}
