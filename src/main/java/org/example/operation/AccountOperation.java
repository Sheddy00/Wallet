package org.example.operation;

import org.example.dto.entity.Account;

import java.util.List;

public class AccountOperation implements CRUDOperation<Account> {
    @Override
    public List<Account> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Account findById(int id) {
        return null;
    }

    @Override
    public List<Account> saveAll(List<Account> entities) {
        return List.of();
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public Account update(Account account) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
