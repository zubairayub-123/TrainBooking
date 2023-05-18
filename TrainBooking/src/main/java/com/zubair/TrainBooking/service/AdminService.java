package com.zubair.TrainBooking.service;


import com.zubair.TrainBooking.model.Admin;


import java.util.List;
import java.util.Optional;

public interface AdminService {


    String bookTicket(List<Admin> admins);

    List<Admin> getAdmins();

    Optional<Admin> getAdmin(Integer restroId);

    String deleteTicket(Integer id);
}
