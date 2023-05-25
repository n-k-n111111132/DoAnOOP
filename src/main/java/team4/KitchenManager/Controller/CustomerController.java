package team4.KitchenManager.Controller;

import team4.KitchenManager.Model.Customer;
import team4.KitchenManager.DAO.DatabaseConnector;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import team4.KitchenManager.Object.Customer;

public class CustomerController {
    DatabaseConnector conn = null;

    public CustomerController() {
        conn = new DatabaseConnector();
    }

    public List<Customer> getAllCustomer() {
        List<Customer> _list = new ArrayList<>();
        Customer _Customer = new Customer();
        _Customer.setName();
        _Customer.setID();
        _Customer.setPhone();
        return _list;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Xóa khách hàng theo ID
    public void deleteCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                customers.remove(c);
                break;
            }
        }
    }

    // Sửa thông tin khách hàng
    public void updateCustomer(Customer customer) {
        for (Customer c : customers) {
            if (c.getId() == customer.getId()) {
                c.setName(customer.getName());
                c.setPhone(customer.getPhone());
                break;
            }
        }
    }

}
