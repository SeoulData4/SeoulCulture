package com.squad.seoulculture.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode
@EntityListeners(AuditingEntityListener.class)
public class ReviewMember extends AuditingFields{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idx;
    private boolean isEvent; // 0: 문화재, 1: 문화행사
    private String targetIdx;
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_idx")
    public Member member;

    // lk, images 추가 필요
}
