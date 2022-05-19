package ru.sergeysjob;

class InheritanceDemo {

    public static void main(String[] args) {
	// write your code here
        NormalMember mem1 = new NormalMember("Сергей", 1, 2010);
        NormalMember mem2 = new NormalMember("Наташа",3,2005);
        VIPMember vmem1 = new VIPMember("Евгений", 2, 2011);

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();

        mem2.calculateAnnualFee();
        mem2.displayMemInfo();

        vmem1.calculateAnnualFee();
        vmem1.displayMemInfo();

    }

}
