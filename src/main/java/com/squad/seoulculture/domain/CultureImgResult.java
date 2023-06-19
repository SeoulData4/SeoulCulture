package com.squad.seoulculture.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "result")
public class CultureImgResult {

    @JacksonXmlProperty(localName = "totalCnt")
    private String totalCnt;
    @JacksonXmlProperty(localName = "ccbaKdcd")
    private String ccbaKdcd;
    @JacksonXmlProperty(localName = "ccbaAsno")
    private String ccbaAsno;
    @JacksonXmlProperty(localName = "ccbaCtcd")
    private String ccbaCtcd;
    @JacksonXmlProperty(localName = "ccbaMnm1")
    private String ccbaMnm1;
    @JacksonXmlProperty(localName = "ccbaMnm2")
    private String ccbaMnm2;
    @JacksonXmlProperty(localName = "item")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<CultureImg> item;

    public CultureImgResult(String totalCnt, String ccbaKdcd, String ccbaAsno, String ccbaCtcd, String ccbaMnm1, String ccbaMnm2, List<CultureImg> item) {
        this.totalCnt = totalCnt;
        this.ccbaKdcd = ccbaKdcd;
        this.ccbaAsno = ccbaAsno;
        this.ccbaCtcd = ccbaCtcd;
        this.ccbaMnm1 = ccbaMnm1;
        this.ccbaMnm2 = ccbaMnm2;
        this.item = item;
    }

    public CultureImgResult(){

    }
}
