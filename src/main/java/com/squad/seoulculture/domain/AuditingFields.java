package com.squad.seoulculture.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@ToString
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AuditingFields {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) // 날짜 포맷
    @CreatedDate    //해당 엔티티가 생성될 때, 생성하는 시각을 자동으로 삽입해준다.
    @Column(nullable = false) private LocalDateTime regDate; // 생성일시

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @LastModifiedDate      // 마지막 수정날짜 자동으로 생성
    @Column(nullable = false) private LocalDateTime updateDate; // 수정일시
}
