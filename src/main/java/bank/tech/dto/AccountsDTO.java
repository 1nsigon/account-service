package bank.tech.dto;



import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountsDTO {

    private Long accountId;

    private double balance;
    private String currency;
    private String status;

}