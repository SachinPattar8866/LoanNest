package com.example.LoanNest.Repositories;


import com.example.LoanNest.models.Payment;
import com.example.LoanNest.models.Loan;
import com.example.LoanNest.models.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface paymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByLoan(Loan loan);
    List<Payment> findByStatus(PaymentStatus status);
}
