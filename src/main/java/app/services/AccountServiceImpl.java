package app.services;

import app.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Override
    public void createAccount(String name) {

    }

    @Override
    public void createAccount(String name, int amount) {

    }

    @Override
    public Account getAccountById(int id) {
        return null;
    }

    @Override
    public Account getAccountByName(String name) {
        return null;
    }

    @Override
    public Account renameAccount(String newName) {
        return null;
    }

    @Override
    public Account changeAmount(int amount) {
        return null;
    }

    @Override
    public void deleteAccount(int id) {

    }
}
