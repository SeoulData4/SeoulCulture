package com.squad.seoulculture.repository;

import com.squad.seoulculture.domain.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {
}
