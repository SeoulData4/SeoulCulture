package com.squad.seoulculture.model.entity;

//import com.catchmind.catchtable.domain.type.MemberRole;
//import com.catchmind.catchtable.dto.network.request.ProfileRequest;

import com.squad.seoulculture.model.config.AuditableUpdate;
import com.squad.seoulculture.model.config.BaseEntityUpdate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


//@Table(name = "profile")
@ToString(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Profile extends BaseEntityUpdate implements AuditableUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prIdx;
    private String prName;
    private String prId;
    private String prRegion;
    private String prHp;
    private String prUserpw;
    private String prBirth;


}
