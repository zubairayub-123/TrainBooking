package com.zubair.TrainBooking.service;

import com.zubair.TrainBooking.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    String saveUsers(List<User> users);

    List<User> getUsers();

    Optional<User> getUser(Integer userId);
}
