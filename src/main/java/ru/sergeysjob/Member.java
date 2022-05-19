package ru.sergeysjob;


import org.apache.log4j.Logger;
import java.util.Scanner;

public class Member {

    final static Logger logger = Logger.getLogger(Member.class);

    public String welcome = "Добро пожаловать!";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member(){

    }
    public Member(String pName, int pMemberID, int pMemberSince){
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    } //конструктор с параметрами

    public int getDiscount() {
        return discount;
    }

    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println(welcome);
        System.out.print("Ведите пароль администратора");
        password = input.nextLine();

        if (!password.equals("1234")){
            System.out.println("неверный пароль");
            logger.info(password);

        }else {
            System.out.print("ведите скидку:");
            discount = input.nextInt();
        }
    }
    public void displayMemInfo(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }
    public void calculateAnnualFee()
    {
        annualFee = 0;
    }

}
