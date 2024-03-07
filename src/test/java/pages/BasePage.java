package pages;

import com.codeborne.selenide.SelenideElement;
import enums.SidebarOptions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


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
        element.shouldBe(visible,enabled)
                .click();
    }

    public void openCartPage(){
        click(header.cartButton);
    }

    public void openSidebar(){
        click(header.burgerButton);
    }

    public void goToSidebarOption(SidebarOptions tab){
        openSidebar();
        click($("//*[@id='" + tab.value +"_sidebar_link']"));

    }

    public void closeSidebar(){
        click(sidebar.closeButton);
        sidebar.sidebar.shouldBe(hidden);
    }

    public class Header{
        SelenideElement cartButton = $x("//*[@class='shopping_cart_link']");
        SelenideElement burgerButton = $x("//*[@id='react-burger-menu-btn']");
    }

    class Sidebar{
        SelenideElement sidebar = $x("//*[@class='bm-item-list']");
        SelenideElement closeButton = $x("//*[@id='react-burger-cross-btn']");
    }
}
