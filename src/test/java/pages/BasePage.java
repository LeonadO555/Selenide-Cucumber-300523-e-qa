package pages;

import com.codeborne.selenide.SelenideElement;
import enums.SideBarOptions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    public Header header;
    private final Sidebar sidebar;
    public BasePage(){
        this.header = new Header();
        this.sidebar = new Sidebar();
    }
    public void setInput(SelenideElement input, String value){
        input.shouldBe(visible,enabled,editable)
                .click();
        input.clear();
        input.setValue(value)
                .shouldHave(value(value));
    }
    public void click(SelenideElement element){
        element.should(visible,enabled)
                .click();
    }
    public void openCardPage(){
        click(header.cardButton);
    }
    public void openSidebar(){
        click(header.burgerButton);
        sidebar.sidebar.shouldBe(visible);
    }
    public void goToSidebarOptionS(SideBarOptions tab){
        openSidebar();
        click($x("//*[@id='"+ tab.value +"_sidebar_link']"));
    }
    public void closeSidebar(){
        click(sidebar.closeButton);
        sidebar.sidebar.shouldBe(hidden);
    }
    class Header{
        SelenideElement cardButton = $x("//*[@class='shopping_cart_link']");
        public SelenideElement burgerButton = $x("//*[@id='react-burger-menu-btn']");
    }
    class Sidebar{
        SelenideElement sidebar = $x("//*[@class='bm-item-list']");
        SelenideElement closeButton = $x("//*[@id='react-burger-cross-btn']");
    }
}
