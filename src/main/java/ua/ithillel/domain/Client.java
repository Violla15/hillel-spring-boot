package ua.ithillel.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "clients")
public class Client {
    @Id
    private int id;
    private String name;
    private String surname;
    private String phone;
}
