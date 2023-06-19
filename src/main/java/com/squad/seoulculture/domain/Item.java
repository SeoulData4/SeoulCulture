package com.squad.seoulculture.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Item {

    @JacksonXmlProperty(localName = "ccbaLcto")
    private String ccbaLcto;
    @JacksonXmlProperty(localName = "ccbaLctoNm")
    private String ccbaLctoNm;

    public Item(String ccbaLcto, String ccbaLctoNm) {
        this.ccbaLcto = ccbaLcto;
        this.ccbaLctoNm = ccbaLctoNm;
    }
    public Item(){

    }
}
