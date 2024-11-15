package org.example.operation;

import org.example.dto.entity.Devise;

import java.util.List;

public class DeviseOperation implements CRUDOperation<Devise> {
    @Override
    public List<Devise> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Devise findById(int id) {
        return null;
    }

    @Override
    public List<Devise> saveAll(List<Devise> entities) {
        return List.of();
    }

    @Override
    public Devise save(Devise devise) {
        return null;
    }

    @Override
    public Devise update(Devise devise) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
