package org.example.projetj2e.Repositories;

import org.example.projetj2e.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUser extends JpaRepository<User, Long> {
}
