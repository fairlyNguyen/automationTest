package elements;

import actions.IBottomBar;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class BottomBarElements implements IBottomBar {

    public BottomBarElements(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="home")
    @iOSFindBy(xpath = "")
    public MobileElement homeTab;

    @AndroidFindBy(id="find")
    @iOSFindBy(xpath = "")
    public MobileElement sectionTab;

    @AndroidFindBy(id="bookmarks")
    @iOSFindBy(xpath = "")
    public MobileElement bookMarkTab;

    @AndroidFindBy(id="settings")
    @iOSFindBy(xpath = "")
    public MobileElement settingTab;


    @Override
    public void homeTabClick() {
        homeTab.click();
    }

    @Override
    public void sectionTabClick() {
        sectionTab.click();
    }

    @Override
    public void bookMarkTabClick() {
        bookMarkTab.click();
    }

    @Override
    public void settingTabClick() {
        settingTab.click();
    }
}
