package com.portal.centro.API.generic;

import java.util.List;
import java.util.Optional;

public abstract class ICRUDService <K>{

    public abstract List<K> getAll(String username);
    public abstract Optional<K> getById(Long id);
    public abstract K add(K model);
    public abstract void delete(Long id);
    public abstract K update(K model, Long id);
}