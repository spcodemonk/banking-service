package com.sp.bank.bankingservice.deposit;

import com.sp.bank.bankingservice.deposit.domain.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/deposit")
public class DepositController {

    @GetMapping("/a1")
    public Mono<Account> depositAmount() {

        Account acc = new Account(100);
        return Mono.justOrEmpty(acc);
    }
}
