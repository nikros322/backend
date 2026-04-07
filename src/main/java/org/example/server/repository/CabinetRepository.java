package org.example.server.repository;

import org.example.server.entity.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabinetRepository extends JpaRepository<Cabinet, String> {
}
