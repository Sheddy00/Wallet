package org.example.operation;

import java.util.List;

public interface CRUDOperation<T> {
    List<T> findAll() throws Exception;
    T findById(int id);
    List<T> saveAll(List<T> entities);
    T save(T t);
    T update(T t);
    void delete(int id);
}
