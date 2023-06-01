package com.squad.seoulculture.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileRequest {
    private Long prIdx;
    private String prName;
    private String prId;
    private String prRegion;
    private String prHp;
    private String prUserpw;
    private String prBirth;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
}
