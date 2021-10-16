package app.services;

import app.model.Account;

public interface AccountService {
    void createAccount(String name);
    void createAccount(String name, int amount);

    Account getAccountById(int id);
    Account getAccountByName(String name);

    Account renameAccount(String newName);
    Account changeAmount(int amount);

    void deleteAccount(int id);
}
