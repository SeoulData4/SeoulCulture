package com.squad.seoulculture.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EntityListeners(AuditingFields.class)
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    private Long followerIdx;
    private Long followingIdx;
}
