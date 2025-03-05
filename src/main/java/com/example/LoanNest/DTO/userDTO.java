package com.example.LoanNest.DTO;

import com.example.LoanNest.models.Role;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userDTO {
    private Long id;
    private String name;
    private String email;
    private Role role;
}
