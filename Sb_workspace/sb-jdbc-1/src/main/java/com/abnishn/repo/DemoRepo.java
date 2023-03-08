package com.abnishn.repo;

import org.springframework.data.repository.CrudRepository;
import com.abnishn.entity.Demo;

public interface DemoRepo extends CrudRepository<Demo, Long> {
}
