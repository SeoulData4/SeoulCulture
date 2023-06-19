package com.squad.seoulculture.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JacksonXmlRootElement(localName = "item")
public class CultureImg {

    @Id
    @JacksonXmlProperty(localName = "sn")
    @Column(name = "sn")
    private String sn;
    @JacksonXmlProperty(localName = "imageNuri")
    @Column(name = "image_nuri")
    private String imageNuri;
    @JacksonXmlProperty(localName = "imageUrl")
    @Column(name = "image_url")
    private String imageUrl;
    @JacksonXmlProperty(localName = "ccimDesc")
    @Column(name = "ccim_desc")
    private String ccimDesc;

    public CultureImg(String sn, String imageNuri, String imageUrl, String ccimDesc) {
        this.sn = sn;
        this.imageNuri = imageNuri;
        this.imageUrl = imageUrl;
        this.ccimDesc = ccimDesc;
    }

    public CultureImg(){

    }
}
