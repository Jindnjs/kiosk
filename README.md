# Java Kiost

Java 문법을 활용하여 키오스크를 만드는 프로젝트 입니다.  
단계별, 요구사항 별로 기능을 확장해 나아가며 기능 구현과 확장성 있는 구조로 작성된 키오스크 입니다.  

---


---

## 1단계 Kiosk
### 요구사항
> - 햄버거 메뉴 출력 및 선택하기
> - 제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행
> - 반복문을 이용해서 0 입력되면 프로그램을 종료

---

## 2단계 Kiosk
### 요구사항
> - MenuItem 클래스 생성하기
> - 클래스는 이름, 가격, 설명 필드
> - List를 선언하여 여러 MenuItem을 추가
> - 반복문을 활용해 menuItems를 탐색하면서 하나씩 접근

---

## 3단계 Kiosk
### 요구사항
> - Kiosk 클래스 생성하기
> - main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수에서 관리
> - 유효하지 않은 입력에 대해 오류 메시지를 출력

---

## 4단계 Kiosk
### 요구사항
> - Menu 클래스 생성
> - 여러가지 카테코리의 MenuItem 클래스를 관리하는 클래스
> - 하위 항목에 대한 로직처리 추가

---

## 5단계 Kiosk
### 요구사항
> - 캡슐화 적용
> - 모든 List 필드 private 적용
> - 데이터 사용에 필요한 getter() 구현

---

## 6단계 Kiosk
### 요구사항
> - 장바구니 및 구매하기 기능을 추가
> - 사용자가 선택한 메뉴를 장바구니에 추가할 수 있는 기능
> - 사용자가 결제를 시도하기 전에, 장바구니에 담긴 모든 메뉴와 총 금액을 출력
> - 메뉴를 클릭하면 장바구니에 추가할 지 물어보고, 입력값에 따라 “추가”, “취소” 처리
> - 합산하여 총 금액을 계산하고, “주문하기”를 누르면 장바구니를 초기화

---

## 7단계 Kiosk
### 요구사항
> - Enum을 활용한 사용자 유형별 할인율 관리하기
> - 주문 시, 사용자 유형에 맞는 할인율 적용해 총 금액 계산
> - 람다 & 스트림을 활용한 장바구니 조회 기능

---

### 사용법 & 실행결과
```bash
[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
>>> 1

[ BURGERS MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
>>> 1

선택한 메뉴: ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거

위 메뉴를 장바구니에 추가하시겠습니까?
1. 확인       2. 취소
>>>1

ShackBurger 이 장바구니에 추가되었습니다.

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료

[ ORDER MENU ]
4. Orders       | 장바구니를 확인 후 주문합니다.
5. Cancel       | 진행중인 주문을 취소합니다.
>>> 2

[ DRINKS MENU ]
1. Lemonade      | W 3.0 | 상큼한 레몬이 들어간 탄산음료
2. Orange Juice  | W 2.5 | 시원한 오렌지 주스
3. Coke          | W 2.0 | 톡 쏘는 청량감의 클래식 콜라
4. Root Beer     | W 2.5 | 달콤하고 향긋한 무알콜 맥주 맛 음료
0. 뒤로가기
>>> 1

선택한 메뉴: Lemonade      | W 3.0 | 상큼한 레몬이 들어간 탄산음료

위 메뉴를 장바구니에 추가하시겠습니까?
1. 확인       2. 취소
>>>1

Lemonade 이 장바구니에 추가되었습니다.

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료

[ ORDER MENU ]
4. Orders       | 장바구니를 확인 후 주문합니다.
5. Cancel       | 진행중인 주문을 취소합니다.
>>> 4

아래와 같이 주문 하시겠습니까?

[ Orders ]
ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
Lemonade      | W 3.0 | 상큼한 레몬이 들어간 탄산음료

[ Total ]
W 9.9
=========================
ShackBurger메뉴 삭제하기
[ Orders ]
Lemonade      | W 3.0 | 상큼한 레몬이 들어간 탄산음료

[ Total ]
W 3.0

1. 주문       2. 메뉴판
>>>1

할인 정보를 입력해주세요.
1. 국가유공자	: 10%
2. 군인   	: 5%
3. 학생   	: 3%
4. 일반   	: 0%
>>>2

주문이 완료되었습니다. 금액은 W 2.85 입니다.

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
>>> 0

프로그램을 종료합니다.

종료 코드 0(으)로 완료된 프로세스
```

---

## 프로젝트 구조

```
Kiosk
├── l1
│   └── Main.java
├── v2
│   ├── Main.java
│   └── MenuItem.java
├── v3
│   ├── Main.java
│   ├── Kiosk.java
│   └── MenuItem.java
├── v4
│   ├── Main.java
│   ├── Kiosk.java
│   ├── Menu.java
│   ├── MenuItem.java
│   └── Utils.java
├── v6
│   ├── Main.java
│   ├── Kiosk.java
│   ├── Menu.java
│   ├── MenuItem.java
│   ├── Cart.java
│   ├── UserType.java
│   └── Utils.java
└── v7
    ├── Main.java
    ├── Kiosk.java
    ├── Menu.java
    ├── MenuItem.java
    ├── Cart.java
    ├── UserType.java
    └── Utils.java
```

---
