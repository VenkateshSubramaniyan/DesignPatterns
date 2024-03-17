package creational.factory;

public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}

class  DomesticPlan extends Plan{

    @Override
    public void getRate(){
        rate=3.50;
    }
}


class  CommercialPlan extends Plan {

    @Override
    public void getRate() {
        rate = 7.50;
    }
}

class  InstitutionalPlan extends Plan{

    @Override
    public void getRate(){
        rate=5.50;
    }
}