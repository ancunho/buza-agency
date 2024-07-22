package io.buza.agency.entity;

import java.util.Date;

public class BtAdminAccountRole {
    private Integer seq;

    private Integer adminAccountSeq;

    private Date createdAt;

    private String createdBy;

    private Date modifiedAt;

    private String modifiedBy;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getAdminAccountSeq() {
        return adminAccountSeq;
    }

    public void setAdminAccountSeq(Integer adminAccountSeq) {
        this.adminAccountSeq = adminAccountSeq;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seq=").append(seq);
        sb.append(", adminAccountSeq=").append(adminAccountSeq);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedAt=").append(modifiedAt);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append("]");
        return sb.toString();
    }
}