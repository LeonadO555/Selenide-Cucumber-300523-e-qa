package enums;

import lombok.Getter;

@Getter
public enum SideBarOptions {
    INVENTORY("inventory"),
    ABOUT("about"),
    LOGOUT("logout"),
    RESET("reset");
    public final String value;


    SideBarOptions(String value) {
        this.value = value;
    }
}
