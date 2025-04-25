package lv6;

public class MenuItem {

    private String menuName;
    private double menuPrice;
    private String menuDescription;

    //생성자
    public MenuItem(String menuName, double menuPrice, String menuDescription) {
        this.menuName = menuName;
        //가격 예외처리
        if(menuPrice < 0)
            throw new IllegalArgumentException("가격은 0 이상이어야함");
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
    }

    //게터
    public String getMenuName() {return menuName;}
    public double getMenuPrice() {return menuPrice;}

    //메뉴 출력 형식
    @Override
    public String toString() {
        return String.format("%-13s | W %3.1f | %s", menuName, menuPrice, menuDescription);
    }
}
