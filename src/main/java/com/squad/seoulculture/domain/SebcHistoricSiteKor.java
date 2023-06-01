package com.squad.seoulculture.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SebcHistoricSiteKor {

    @JsonProperty("list_total_count")
    private int listTotalCount;
    @JsonProperty("RESULT")
    private Result result;
    @JsonProperty("row")
    private List<SebcHistoricSiteRow> rows;

    public SebcHistoricSiteKor(int listTotalCount, Result result, List<SebcHistoricSiteRow> rows) {
        this.listTotalCount = listTotalCount;
        this.result = result;
        this.rows = rows;
    }

    public SebcHistoricSiteKor(){

    }

    public int getListTotalCount() {
        return listTotalCount;
    }

    public void setListTotalCount(int listTotalCount) {
        this.listTotalCount = listTotalCount;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public List<SebcHistoricSiteRow> getRows() {
        return rows;
    }

    public void setRows(List<SebcHistoricSiteRow> rows) {
        this.rows = rows;
    }
}


