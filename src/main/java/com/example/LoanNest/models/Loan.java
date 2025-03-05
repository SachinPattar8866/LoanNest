package com.example.LoanNest.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private Double interestRate;
    private Integer termMonths;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User borrower;

    @Enumerated(EnumType.STRING)
    private LoanStatus status;
}

