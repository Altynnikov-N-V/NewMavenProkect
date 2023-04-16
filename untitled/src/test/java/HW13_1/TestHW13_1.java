package HW13_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHW13_1 {
    @Test
    public void testHomeWork13_1() {
        Worker13_1 worker13_1 = new Worker13_1("Nikita", 270000);
        Manager13_1 manager = new Manager13_1("Vasilii", 10000, 0);
        Manager13_1 manager2 = new Manager13_1("PETR", 10000, 20);
        Director13_1 director = new Director13_1("Ivan", 10000, 0);
        Director13_1 director2 = new Director13_1("Sanya", 10000, 200);

        Assert.assertEquals(worker13_1.getSalary(), worker13_1.getBaseSalary());
        Assert.assertEquals(manager.getSalary(),0);
        Assert.assertEquals(manager2.getSalary(),6000);
        Assert.assertEquals(director.getSalary(),0);
        Assert.assertEquals(director2.getSalary(),180000);
    }
}
