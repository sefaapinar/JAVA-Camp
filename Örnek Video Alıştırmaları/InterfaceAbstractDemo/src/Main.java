import Abstract.BaseCustomerManager;
import Concrete.CaribouCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager caribouCustomerManager = new CaribouCustomerManager();
        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        try {
            caribouCustomerManager.Save(new Customer(1, "Sefa", "Pınar", new Date(), "1111111111"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            starbucksCustomerManager.Save(new Customer(2, "Engin", "DEMİROĞ", new Date(), "22222222222"));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        }
    }
}
