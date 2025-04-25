package lv6;

import java.util.List;

public class Kiosk {

    //메뉴 관리
    List<Menu> menus;
    //장바구니
    Cart cart;
    //생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.cart = new Cart();
    }

    //메인메뉴 출력 메소드
    private void displayMainMenu() {
        // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
        System.out.println("\n[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.println(i + 1 + ". " + menus.get(i).getCategoryName());
        }
        System.out.println("0. 종료      | 종료");

        //장바구니가 비어있으면 끝.
        if(cart.getCartItemCount() == 0) return;

        //장바구니 출력
        System.out.println("\n[ ORDER MENU ]");
        System.out.println(menus.size()+1 + ". Orders       | 장바구니를 확인 후 주문합니다.");
        System.out.println(menus.size()+2 + ". Cancel       | 진행중인 주문을 취소합니다.");
    }
    //키오스크 시작 메소드
    public void start(){
        while (true){
            //메인메뉴 출력
            displayMainMenu();
            //메뉴 입력 받기
            int menuNumber = Utils.getIntInput(">>> ");

            //입력 처리
            if(menuNumber == 0){
                System.out.println("\n프로그램을 종료합니다.");
                break; //프로그램 종료
            }
            // 메뉴 범위를 벗어난 입력
            if(menuNumber<0 || menuNumber > menus.size()) {
                //장바구니가 0일때 메뉴보다 큰숫자 입력은 잘못된 입력임
                if(cart.getCartItemCount() == 0) {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    continue;
                }
                //장바구니에 메뉴아이템이있으면 menus.size()+1 , menus.size()+2 는 유효숫자임
                //+1은 Order +2 는 Cancle실행
                if(menuNumber == menus.size()+1) {
                    cart.order();
                    //Main메뉴복귀
                    continue;
                }
                if(menuNumber == menus.size()+2) {
                    //장바구니 비우기
                    cart.clearCart();
                    continue;
                }
                //다시 입력받기 (입력범위를 벗어남 >
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }

            //입력 메뉴
            Menu menu = menus.get(menuNumber-1);

            //메뉴 아이템 선택을위한 반복문
            while (true){
                //입력받은 메뉴의 메뉴아이템 출력
                menu.displayMenu();

                //메뉴아이템 사용자 입력 받기
                int menuItemNumber = Utils.getIntInput(">>> ");

                //입력 메뉴아이템 처리
                if(menuItemNumber == 0){
                    break; //반복문 탈출후 외부 반복문 재실행
                }
                // 메뉴 아이템 범위를 벗어난 입력
                if(menuItemNumber<0 || menuItemNumber > menu.getMenuItems().size()) {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    continue;
                }

                //입력 받은 메뉴 아이템
                MenuItem menuItem = menu.getMenuItems().get(menuItemNumber-1);
                //선택 메뉴 출력


                //메뉴선택 후 로직 수행 ex. 장바구니 추가 등..
                cart.addItem(menuItem);

                //메인메뉴 복귀
                break;
            }
        }
    }
}

