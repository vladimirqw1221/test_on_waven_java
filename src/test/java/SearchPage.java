import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    public final ElementsCollection arrticlelist = $$x("//h2//a");

    public String gerelenent(){
       return arrticlelist.first().getAttribute("href");
    }

}