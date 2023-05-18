package com.zubair.TrainBooking.dao;

import com.zubair.TrainBooking.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
