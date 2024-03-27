package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioID;

    @Column
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "clientId")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

}
