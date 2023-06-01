package com.squad.seoulculture.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SebcHistoricSiteRow {
    @Id
    @JsonProperty("MAIN_KEY")
    @Column(name = "main_key")
    private String mainKey;
    @JsonProperty("CATE1_NAME")
    @Column(name = "cate1_name")
    private String cate1Name;
    @JsonProperty("CATE2_NAME")
    @Column(name = "cate2_name")
    private String cate2Name;
    @JsonProperty("CATE3_NAME")
    @Column(name = "cate3_name")
    private String cate3Name;
    @Column(name = "name_kor")
    @JsonProperty("NAME_KOR")
    private String nameKor;
    @JsonProperty("ADD_KOR")
    @Column(name = "add_kor")
    private String addKor;
    @JsonProperty("ADD_KOR_ROAD")
    @Column(name = "add_kor_road")
    private String addKorRoad;
    @JsonProperty("H_KOR_CITY")
    @Column(name = "hkor_city")
    private String hkorCity;
    @JsonProperty("H_KOR_GU")
    @Column(name = "hkor_gu")
    private String hkorGu;
    @JsonProperty("H_KOR_DONG")
    @Column(name = "hkor_dong")
    private String hkorDong;

    public String getMainKey() {
        return mainKey;
    }

    public void setMainKey(String mainKey) {
        this.mainKey = mainKey;
    }

    public String getCate1Name() {
        return cate1Name;
    }

    public void setCate1Name(String cate1Name) {
        this.cate1Name = cate1Name;
    }

    public String getCate2Name() {
        return cate2Name;
    }

    public void setCate2Name(String cate2Name) {
        this.cate2Name = cate2Name;
    }

    public String getCate3Name() {
        return cate3Name;
    }

    public void setCate3Name(String cate3Name) {
        this.cate3Name = cate3Name;
    }

    public String getNameKor() {
        return nameKor;
    }

    public void setNameKor(String nameKor) {
        this.nameKor = nameKor;
    }

    public String getAddKor() {
        return addKor;
    }

    public void setAddKor(String addKor) {
        this.addKor = addKor;
    }

    public String getAddKorRoad() {
        return addKorRoad;
    }

    public void setAddKorRoad(String addKorRoad) {
        this.addKorRoad = addKorRoad;
    }

    public String getHkorCity() {
        return hkorCity;
    }

    public void setHkorCity(String hkorCity) {
        this.hkorCity = hkorCity;
    }

    public String getHkorGu() {
        return hkorGu;
    }

    public void setHkorGu(String hkorGu) {
        this.hkorGu = hkorGu;
    }

    public String getHkorDong() {
        return hkorDong;
    }

    public void setHkorDong(String hkorDong) {
        this.hkorDong = hkorDong;
    }

    public SebcHistoricSiteRow(String mainKey, String cate1Name, String cate2Name, String cate3Name, String nameKor, String addKor, String addKorRoad, String hkorCity, String hkorGu, String hkorDong) {
        this.mainKey = mainKey;
        this.cate1Name = cate1Name;
        this.cate2Name = cate2Name;
        this.cate3Name = cate3Name;
        this.nameKor = nameKor;
        this.addKor = addKor;
        this.addKorRoad = addKorRoad;
        this.hkorCity = hkorCity;
        this.hkorGu = hkorGu;
        this.hkorDong = hkorDong;
    }

    public SebcHistoricSiteRow() {

    }

    // 생성자, getter, setter 등 필요한 메서드를 추가하십시오.
}
