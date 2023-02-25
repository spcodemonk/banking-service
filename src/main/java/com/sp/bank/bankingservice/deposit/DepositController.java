package com.sp.bank.bankingservice.deposit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/deposit")
public class DepositController {

    @GetMapping("/a1")
    public Mono<String> depositAmount() {
        return Mono.justOrEmpty("Amount deposited successfully");
    }
}
