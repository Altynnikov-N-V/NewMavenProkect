package HW13_1;

public class Manager13_1 extends BaseManager13_1 {
    public static final int SALARY_COEFFICIENT = 3;

    public Manager13_1(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
     public int getSalaryCoefficient() {
        return SALARY_COEFFICIENT;
     }
}
