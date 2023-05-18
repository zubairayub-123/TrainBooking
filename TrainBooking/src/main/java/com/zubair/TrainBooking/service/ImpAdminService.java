package com.zubair.TrainBooking.service;

import com.zubair.TrainBooking.dao.AdminDao;
import com.zubair.TrainBooking.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ImpAdminService implements AdminService{

    @Autowired
    private AdminDao adminDao;


    @Override
    public String bookTicket(List<Admin> admins) {
        adminDao.saveAll(admins);
        return "Succesfully booked the ticket "+admins.size();
    }

    @Override
    public List<Admin> getAdmins() {
        return (List<Admin>)adminDao.findAll();
    }

    @Override
    public Optional<Admin> getAdmin(Integer restroId) {
        return (Optional<Admin>) adminDao.findById(restroId);
    }

    @Override
    public String deleteTicket(Integer id) {
        adminDao.deleteById(id);
        return "Train Details Deleted";
    }

}
