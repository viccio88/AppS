package app.web;

import app.model.Account;
import app.services.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appS")
public class AccountController {
    private AccountService service;

    @GetMapping("/account")
    public Account getAcc(int id) {
        return service.getAccountById(id);
    }
}
