package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {

    public Anasayfa(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
