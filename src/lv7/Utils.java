package lv7;

import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    //입력중 int만 반환하는 메소드
    public static int getIntInput(String prompt){
        while(true){
            System.out.print(prompt);
            //유효성 검사
            try{
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("숫자만 입력하세요.");
            }
        }
    }
}
