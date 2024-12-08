package org.example.projetj2e.Repositories;

import org.example.projetj2e.Entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoReview extends JpaRepository<Review, Long>{}

