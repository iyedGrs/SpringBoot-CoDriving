package org.example.projetj2e.Repositories;

import org.example.projetj2e.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoReservation extends JpaRepository<Reservation, Long> {
}
