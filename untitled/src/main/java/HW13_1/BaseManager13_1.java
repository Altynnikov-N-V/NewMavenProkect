package HW13_1;

public abstract class BaseManager13_1 extends Employee13_1 {
    private int numberOfSubordinates;

    public BaseManager13_1(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public abstract int getSalaryCoefficient();

    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return 0;
        }
        return getBaseSalary() * getSalaryCoefficient() * numberOfSubordinates / 100;
    }

}
