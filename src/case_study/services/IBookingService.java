package case_study.services;

import case_study.models.Contract;

import java.util.List;

public interface IBookingService extends IServices{
    void createNewContract();
    List<Contract> displayContracts();
    void editContract(Contract contract);
}
