package case_study.services;

import case_study.models.Customer;

import java.util.List;

public interface IPromotionService {
    List<Customer> displayCustomersUsingService();
    List<Customer> displayCustomersGettingVouchers();
}
