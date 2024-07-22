package io.buza.agency.entity;

public class BtWriterPost {
    private Integer seq;

    private String isAdminWrite;

    private Integer adminAccountSeq;

    private Integer accountSeq;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getIsAdminWrite() {
        return isAdminWrite;
    }

    public void setIsAdminWrite(String isAdminWrite) {
        this.isAdminWrite = isAdminWrite;
    }

    public Integer getAdminAccountSeq() {
        return adminAccountSeq;
    }

    public void setAdminAccountSeq(Integer adminAccountSeq) {
        this.adminAccountSeq = adminAccountSeq;
    }

    public Integer getAccountSeq() {
        return accountSeq;
    }

    public void setAccountSeq(Integer accountSeq) {
        this.accountSeq = accountSeq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seq=").append(seq);
        sb.append(", isAdminWrite=").append(isAdminWrite);
        sb.append(", adminAccountSeq=").append(adminAccountSeq);
        sb.append(", accountSeq=").append(accountSeq);
        sb.append("]");
        return sb.toString();
    }
}