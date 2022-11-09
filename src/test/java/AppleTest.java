import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest {

    public final static String BASE_URL = "https://appleinsider.ru/";
    public final static String SEARCH_CTRING = "Отличия 13 iPhone от 12";

    @Test
    public void chechHref(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(SEARCH_CTRING);
        SearchPage searchPage = new SearchPage();
        String href =  searchPage.gerelenent();
        Assert.assertTrue(href.contains("iPhone 13"));

    }

}
