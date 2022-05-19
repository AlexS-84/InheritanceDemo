package ru.sergeysjob;

public class NormalMember extends Member{

    public NormalMember(){
    } // конструктор без параметров
    public NormalMember(String pName, int pMemberID, int
            pMemberSince)
    {
        super(pName, pMemberID, pMemberSince);
    } //  дочерний конструктор с параметрами
    @Override
    public void calculateAnnualFee()
    {
        annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }
}
