package com.squad.seoulculture.repository;

import com.squad.seoulculture.domain.CultureList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CultureListRepository extends JpaRepository<CultureList, String> {
}
