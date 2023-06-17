package com.squad.seoulculture.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
@JacksonXmlRootElement(localName = "item")
public class CultureList {
    @Id
    @JacksonXmlProperty(localName = "sn")
    @Column(name = "sn")
    private String sn;
    @JacksonXmlProperty(localName = "no")
    @Column(name = "no")
    private String no;
    @JacksonXmlProperty(localName = "ccmaName")
    @Column(name = "ccma_name")
    private String ccmaName;
    @JacksonXmlProperty(localName = "crltsnoNm")
    @Column(name = "crltsno_nm")
    private String crltsnoNm;
    @JacksonXmlProperty(localName = "ccbaMnm1")
    @Column(name = "ccba_mnm1")
    private String ccbaMnm1;
    @JacksonXmlProperty(localName = "ccbaMnm2")
    @Column(name = "ccba_mnm2")
    private String ccbaMnm2;
    @JacksonXmlProperty(localName = "ccbaCtcdNm")
    @Column(name = "ccba_ctcd_nm")
    private String ccbaCtcdNm;
    @JacksonXmlProperty(localName = "ccsiName")
    @Column(name = "ccsi_name")
    private String ccsiName;
    @JacksonXmlProperty(localName = "ccbaAdmin")
    @Column(name = "ccba_admin")
    private String ccbaAdmin;
    @JacksonXmlProperty(localName = "ccbaKdcd")
    @Column(name = "ccba_kdcd")
    private String ccbaKdcd;
    @JacksonXmlProperty(localName = "ccbaCtcd")
    @Column(name = "ccba_ctcd")
    private String ccbaCtcd;
    @JacksonXmlProperty(localName = "ccbaAsno")
    @Column(name = "ccba_asno")
    private String ccbaAsno;
    @JacksonXmlProperty(localName = "ccbaCncl")
    @Column(name = "ccba_cncl")
    private String ccbaCncl;
    @JacksonXmlProperty(localName = "ccbaCpno")
    @Column(name = "ccba_cpno")
    private String ccbaCpno;
    @JacksonXmlProperty(localName = "longitude")
    @Column(name = "longitude")
    private String longitude;
    @JacksonXmlProperty(localName = "latitude")
    @Column(name = "latitude")
    private String latitude;

    public CultureList(String sn, String no, String ccmaName, String crltsnoNm, String ccbaMnm1, String ccbaMnm2, String ccbaCtcdNm, String ccsiName, String ccbaAdmin, String ccbaKdcd, String ccbaCtcd, String ccbaAsno, String ccbaCncl, String ccbaCpno, String longitude, String latitude) {
        this.sn = sn;
        this.no = no;
        this.ccmaName = ccmaName;
        this.crltsnoNm = crltsnoNm;
        this.ccbaMnm1 = ccbaMnm1;
        this.ccbaMnm2 = ccbaMnm2;
        this.ccbaCtcdNm = ccbaCtcdNm;
        this.ccsiName = ccsiName;
        this.ccbaAdmin = ccbaAdmin;
        this.ccbaKdcd = ccbaKdcd;
        this.ccbaCtcd = ccbaCtcd;
        this.ccbaAsno = ccbaAsno;
        this.ccbaCncl = ccbaCncl;
        this.ccbaCpno = ccbaCpno;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public CultureList(){

    }
}
