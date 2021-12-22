package ai.faire.booking.service.controller;

import ai.faire.booking.service.DTO.AccountDTO;
import ai.faire.booking.service.DTO.TransactionDTO;
import ai.faire.booking.service.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api")
public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
    @Operation(summary = "Add new account")
    @PostMapping("/add-account")
    public void addAccount(@Valid @RequestBody AccountDTO accountDto){
                
        accountService.addAccount(accountDto);
    }
    
    @Operation(summary = "Add transaction")
    @PostMapping("/add-transaction")
    public void transaction(@Valid @RequestBody TransactionDTO transactionDto){

        accountService.addTransaction(transactionDto);
    }
}
