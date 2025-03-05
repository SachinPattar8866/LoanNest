package com.example.LoanNest.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class paymentDTO {
    private Long loanId;
    private Double amount;
    private String dueDate;
}
