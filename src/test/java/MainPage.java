import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

/**
 *
 */
public class MainPage {
    public final SelenideElement textBoxIpput = $x("//input[@name='s']");

    public MainPage(String url){
        Selenide.open(url);

    }

    /**
     *  this well if array href adn favourite mail
     * @param searchString
     */
    public void search(String searchString){
        textBoxIpput.setValue(searchString);
        textBoxIpput.sendKeys(Keys.ENTER);
    }


}
