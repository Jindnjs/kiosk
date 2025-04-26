package lv7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //메뉴 객체 저장할 컬렉션
        List<Menu> menus = new ArrayList<>();

        //햄버거
        menus.add(new Menu("Burgers", new ArrayList<>(List.of(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        ))));
        //음료수
        menus.add(new Menu("Drinks", new ArrayList<>(List.of(
                new MenuItem("Lemonade", 3.0, "상큼한 레몬이 들어간 탄산음료"),
                new MenuItem("Orange Juice", 2.5, "시원한 오렌지 주스"),
                new MenuItem("Coke", 2.0, "톡 쏘는 청량감의 클래식 콜라"),
                new MenuItem("Root Beer", 2.5, "달콤하고 향긋한 무알콜 맥주 맛 음료")
        ))));
        //디저트
        menus.add(new Menu("Desserts", new ArrayList<>(List.of(
                new MenuItem("Vanilla Custard", 4.0, "부드러운 바닐라 맛 커스터드"),
                new MenuItem("Chocolate Custard", 4.0, "진한 초콜릿 맛 커스터드")
        ))));

        //Kiosk 객체 생성 & items 초기화
        Kiosk kiosk = new Kiosk(menus);

        //kiosk 시작
        kiosk.start();

    }
}