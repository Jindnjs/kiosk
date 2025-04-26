package lv6;

public enum UserType {
    NATIONAL_MERIT("국가유공자",10),
    MILITARY("군인",5),
    STUDENT("학생",3),
    GENERAL("일반",0);

    private String userType;
    private int discountRate;

    UserType(String userType, int discountRate){
        this.userType = userType;
        this.discountRate = discountRate;
    }

    public String getUserType(){return userType;}
    public int getDiscountRate(){return discountRate;}
}
