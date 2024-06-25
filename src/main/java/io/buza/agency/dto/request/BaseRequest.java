package io.buza.agency.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@ToString
public class BaseRequest implements Serializable {

    private Long rowNum;
    private int page;
    private int limit;
    private int rows;

    private int pageNum;
    private int pageSize;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String sessionId;
    private String ipAddr;
    private String userAgent;
    private String referer;
    private String statusName;

    public int getPageNum() {
        if (this.pageNum == 0) {
            return 1;
        }
        return pageNum;
    }


    public int getPageSize() {
        if (this.pageSize == 0) {
            return 15;
        }
        return pageSize;
    }

    public int getRows() {
        if (this.rows == 0) {
            return 15;
        }
        return rows;
    }

    public Long getRowNum() {
        return rowNum;
    }

    public int getPage() {
        return page;
    }

    public int getLimit() {
        return limit;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getReferer() {
        return referer;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setRowNum(Long rowNum) {
        this.rowNum = rowNum;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
