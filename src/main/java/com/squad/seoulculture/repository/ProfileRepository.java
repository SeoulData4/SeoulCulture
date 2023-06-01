package com.squad.seoulculture.repository;


import com.squad.seoulculture.model.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {

    Optional<Profile> findByPrIdAndPrUserpw (String prId, String prUserpw);

}