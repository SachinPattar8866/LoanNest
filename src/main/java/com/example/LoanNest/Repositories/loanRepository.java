package com.example.LoanNest.Repositories;



import com.example.LoanNest.models.LoanStatus;
import com.example.LoanNest.models.User;
import com.example.LoanNest.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface loanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByBorrower(User borrower);
    List<Loan> findByStatus(LoanStatus status);
}

