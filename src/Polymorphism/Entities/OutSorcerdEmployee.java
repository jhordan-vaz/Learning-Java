package Polymorphism.Entities;

public class OutSorcerdEmployee extends Employee {

    private Double additionalCharge;

    public OutSorcerdEmployee() {

    }

    public OutSorcerdEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment() {
        return super.payment() + getAdditionalCharge() * 1.1;
    }

}
