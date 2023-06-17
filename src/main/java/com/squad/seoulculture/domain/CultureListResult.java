package com.squad.seoulculture.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@JacksonXmlRootElement(localName = "result")
public class CultureListResult {
    @JacksonXmlProperty(localName = "totalCnt")
    private String totalCnt;
    @JacksonXmlProperty(localName = "pageUnit")
    private String pageUnit;
    @JacksonXmlProperty(localName = "pageIndex")
    private String pageIndex;
    @JacksonXmlProperty(localName = "item")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<CultureList> item;

    public CultureListResult(String totalCnt, String pageUnit, String pageIndex, List<CultureList> item) {
        this.totalCnt = totalCnt;
        this.pageUnit = pageUnit;
        this.pageIndex = pageIndex;
        this.item = item;
    }


    public CultureListResult() {

    }


}
