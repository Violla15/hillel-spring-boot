package ua.ithillel.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "managers")
public class Manager {
    @Id
    private int id;
    private String name;
    private String login;
    private String password;
    private String email;

    @Enumerated
    private Role role;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private List<Order> orders;
}
