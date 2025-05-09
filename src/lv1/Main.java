package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            //메뉴 출력하기
            System.out.println("\n[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            //메뉴 입력 받기
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
            }
            else if(menuNumber == 1){
                System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            }
            else if(menuNumber == 2){
                System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            }
            else if(menuNumber == 3){
                System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            }
            else if(menuNumber == 4){
                System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            }
            else{
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
        System.out.println("\n프로그램을 종료합니다.");
    }
}