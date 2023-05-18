package com.zubair.TrainBooking.controller;

import com.zubair.TrainBooking.model.Admin;
import com.zubair.TrainBooking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/bookticket")
    public String bookticket(@RequestBody() List<Admin> admins){
        return adminService.bookTicket(admins);
    }


    @GetMapping("/gettickets")
    public List<Admin> bookticket(){
        return adminService.getAdmins();
    }

    @GetMapping("/getticket")
    public Optional<Admin> bookticket(@RequestParam("trainId") Integer trainId){
        return adminService.getAdmin(trainId);
    }

    @DeleteMapping("/ticket")
    public String deleteTicket(@RequestParam("id")Integer id){
        return adminService.deleteTicket(id);
    }

}
