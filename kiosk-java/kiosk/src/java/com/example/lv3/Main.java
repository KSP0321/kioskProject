package java.com.example.lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>(
                List.of(
                        new MenuItem("ShackBurger", 6.5, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("SmokeBurger", 8.5, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                        new MenuItem("CheeseBurger", 5.5, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                        new MenuItem("Hamburger", 4.5, "비프패티를 기반으로 야채가 들어간 기본버거")
                )
        );

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}
