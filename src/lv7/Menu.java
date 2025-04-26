package lv7;

import java.util.List;

public class Menu {

    private String categoryName;
    //메뉴 아이템을 Menu클래스가 관리
    private List<MenuItem> menuItems;

    //생성자
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    //Getter
    public String getCategoryName() {return categoryName;}
    public List<MenuItem> getMenuItems() {return menuItems;}

    //메뉴 아이템을 출력하는 메소드
    public void displayMenu(){
        // 카테고리이름의 대문자 출력
        System.out.println("\n[ "+ categoryName.toUpperCase() +" MENU ]");

        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i+1 + ". " + menuItems.get(i));
        }
        System.out.println("0. 뒤로가기");
    }
}
