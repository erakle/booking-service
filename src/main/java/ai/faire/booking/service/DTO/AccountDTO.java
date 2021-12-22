package ai.faire.booking.service.DTO;

import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AccountDTO {
    
    @NotEmpty
    private String accountNumber;
    
    @NotEmpty
    private BigDecimal balance;
    
    @NotEmpty
    private Date createDate;
}
