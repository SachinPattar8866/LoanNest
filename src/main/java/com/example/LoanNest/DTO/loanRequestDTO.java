package com.example.LoanNest.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class loanRequestDTO {
    private Double amount;
    private Double interestRate;
    private Integer termMonths;
}
