package ua.ithillel.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
public class Car {

    @Id
    private long id;
    private String manufacturer;
    private String model;
    private int year;
    private int price;
    private boolean available;
}
