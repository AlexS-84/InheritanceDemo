package ru.sergeysjob;

public class VIPMember extends Member{
    public VIPMember(String pName, int pMemberID, int
            pMemberSince)
    {
        super(pName, pMemberID, pMemberSince); //дочерний конструктор
    }
    @Override
    public void calculateAnnualFee()
    {
        annualFee = (1-0.01*getDiscount())*1200;
    }
}
