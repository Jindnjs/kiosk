package lv7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Cart {
    List<MenuItem> cartItems = new ArrayList<>();
    int cartItemCount = 0;
    double totalPrice = 0;

    //장바구니 추가
    public void addItem(MenuItem item) {
        //선택메뉴 출력
        System.out.println("\n선택한 메뉴: " + item);

        //선택받기
        System.out.println("\n위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");

        //유효한 숫자만 입력받기
        while(true) {
            int menuNum = Utils.getIntInput(">>>");
            //처리
            if(menuNum == 2) {break;}
            if(menuNum == 1) {
                //추가
                cartItems.add(item);
                cartItemCount++;
                totalPrice += item.getMenuPrice();
                System.out.println("\n" + item.getMenuName()+" 이 장바구니에 추가되었습니다.");
                break;
            }
            System.out.println("유효한 숫자를 입력하세요");
        }

    }
    //장바구니 비우기
    public void clearCart() {
        cartItems.clear();
        cartItemCount = 0;
        totalPrice = 0;
    }
    //주문하기
    public void order(){
        //장바구니 내역 출력
        System.out.println("\n아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[ Orders ]");
        cartItems.forEach(System.out::println);
        System.out.println("\n[ Total ]");
        System.out.println("W "+totalPrice);
        System.out.println("\n1. 주문       2. 메뉴판");

        //유효한 숫자만 입력받기
        while(true) {
            int menuNum = Utils.getIntInput(">>>");
            //처리
            //2는 메뉴판 돌아가기
            if(menuNum == 2) {return;}
            //주문확정
            if(menuNum == 1) {

                //할인 적용하기
                int discountRate = discountSelect();
                double discountPrice = (100 - discountRate) * totalPrice / 100;
                System.out.println("\n주문이 완료되었습니다. 금액은 W "+ discountPrice +" 입니다.");
                //카트비우기
                clearCart();
                break;
            }
            System.out.println("유효한 숫자를 입력하세요");
        }
    }
    //할인율 선택받는 메소드
    private int discountSelect(){
        while(true) {
            System.out.println("\n할인 정보를 입력해주세요.");
            UserType [] usertypes = UserType.values();
            IntStream.range(0, usertypes.length)
                    .forEach(i -> {
                        UserType userType = usertypes[i];
                        System.out.printf("%d. %-5s\t: %d%%\n",i+1,userType.getUserType(),userType.getDiscountRate());
                    });
            int menuNum = Utils.getIntInput(">>>");
            // 메뉴 범위를 벗어난 입력
            if(menuNum<=0 || menuNum > usertypes.length) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }
            return usertypes[menuNum-1].getDiscountRate();
        }
    }

    //람다 스트림 활용 적용하기
    //menuName이름을 cartItems에서 제거

    //게터
    public double getTotalPrice() {return totalPrice;}
    public int getCartItemCount() {return cartItemCount;}
    public List<MenuItem> getCartItems() {return cartItems;}
}
