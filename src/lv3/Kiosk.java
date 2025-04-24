package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //메뉴 관리
    List<MenuItem> menuItems;

    //생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //키오스크 시작 메소드
    public void start(){
        //스캐너 객체 생성
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
