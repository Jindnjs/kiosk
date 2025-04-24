package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //메뉴 객체 저장할 컬렉션
        List<MenuItem> menuItems = new ArrayList<MenuItem>();

        //메뉴 객체 생성& 저장
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);

        while (true){
            //메뉴 출력하기 -> 반복문&컬렉션 활용
            System.out.println("\n[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuItems.size(); i++){
                System.out.println(i+1 + ". " + menuItems.get(i));
            }
            System.out.println("0. 종료      | 종료");

            //메뉴 입력 받기
            System.out.print(">>> ");
            String userInput = scanner.nextLine();

            //입력 메뉴 유효성 검사
            int menuNumber;

            try{
                menuNumber = Integer.parseInt(userInput);
            }catch (NumberFormatException e){
                System.out.println("숫자만 입력하세요.");
                continue; // 재입력 받기
            }

            //입력 처리
            if(menuNumber == 0){
                break; //프로그램 종료
            }//1~ 저장된 메뉴수까지
            else if(0 < menuNumber && menuNumber <= menuItems.size()){
                System.out.println(menuItems.get(menuNumber-1));
            }
            else{
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
        System.out.println("\n프로그램을 종료합니다.");
    }
}