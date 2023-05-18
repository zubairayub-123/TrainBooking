package com.zubair.TrainBooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Admin {

    @Id
    private int tid;

    private String tname;


}
