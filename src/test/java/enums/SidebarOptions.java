package enums;

import lombok.Getter;

@Getter
public enum SidebarOptions {
    INVENTORY("inventory"),
    ABOUT("about"),
    LOGOUT("logout"),
    RESET("reset");
    public final String value;


    SidebarOptions(String value) {
        this.value = value;
    }
}
