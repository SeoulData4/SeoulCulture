package com.squad.seoulculture.repository;

import com.squad.seoulculture.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
