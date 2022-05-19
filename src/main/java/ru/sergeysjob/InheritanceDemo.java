package ru.sergeysjob;

class InheritanceDemo {

    public static void main(String[] args) {
	// write your code here
        NormalMember mem1 = new NormalMember("Сергей", 1, 2010);
        VIPMember mem2 = new VIPMember("Евгений", 2, 2011);

        //mem1.calculateAnnualFee();
        //mem2.calculateAnnualFee();

        //mem1.displayMemInfo();
        //mem2.displayMemInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();
    }

}
