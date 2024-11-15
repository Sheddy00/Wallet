package org.example.operation;

import org.example.dto.entity.Transaction;

import java.util.List;

public class TransactionOperation implements CRUDOperation<Transaction> {
    @Override
    public List<Transaction> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Transaction findById(int id) {
        return null;
    }

    @Override
    public List<Transaction> saveAll(List<Transaction> entities) {
        return List.of();
    }

    @Override
    public Transaction save(Transaction transaction) {
        return null;
    }

    @Override
    public Transaction update(Transaction transaction) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
