package uitesting.upb.org.managepage.mypage.home;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

/**
 * @autor Marcelo Garay
 */
public class Home extends BasePage {

    @FindBy(xpath = "")
    private WebElement searchTextField;

    @FindBy(id = "Transferir")
    private WebElement transferButton;

    public Home searchText(String text){
        Events.fillField(searchTextField, text);
        return this;
    }

    public void clicktransferButton(){
        Events.click(transferButton);
    }

//    public void searchTextAndClickSearchButton(String text){
//        searchText(text).clickSearchButton();
//    }
}
