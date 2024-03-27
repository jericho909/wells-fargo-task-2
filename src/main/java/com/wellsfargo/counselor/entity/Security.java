package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Security {
    @Id
    @GeneratedValue()
    private Long securityId;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private Double purchasePrice;

    @Column
    private LocalDate purchaseDate;

    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolioId")
    private Portfolio portfolio;
}
