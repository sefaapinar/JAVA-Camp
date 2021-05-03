package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

    CustomerCheckService customerCheckService;

    public CustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        if (customerCheckService.checkIfRealCustomer(customer)){
            System.out.println("Customer System Added"+ customer.getFirstName());
        }else {
            System.out.println("Please Try Again.");
        }
    }

    @Override
    public void update(Customer customer) {
        if (customerCheckService.checkIfRealCustomer(customer)){
            System.out.println("Customer System Updated"+ customer.getFirstName());
        }else {
            System.out.println("Please Try Again.");
        }
    }

    @Override
    public void delete(Customer customer) {
        if (customerCheckService.checkIfRealCustomer(customer)){
            System.out.println("Customer System Deleted"+ customer.getFirstName());
        }else {
            System.out.println("Please Try Again.");
        }
    }
}
