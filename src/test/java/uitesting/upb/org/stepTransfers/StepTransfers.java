package uitesting.upb.org.stepTransfers;

import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.mypage.home.Home;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepTransfers {


    private Home home;

    @Given("^My Page is loaded$")
    public void myPageIsLoaded() {
        home = LoadPage.loadMypageHome();
    }

    @Then("^click 'Transfer' Button$")
    public void clickTransferButton() {
        home.clicktransferButton();
    }


    @Then("^fill amount$")
    public void fillAmount() {
    }
}
