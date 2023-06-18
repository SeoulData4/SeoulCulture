package com.squad.seoulculture.repository;

import com.squad.seoulculture.domain.ReviewMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewMemberRepository extends JpaRepository<ReviewMember, Long> {
}
