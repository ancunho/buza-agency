package io.buza.agency.entity;

public class BtPostTag {
    private Integer seq;

    private Integer postSeq;

    private Integer tagSeq;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(Integer postSeq) {
        this.postSeq = postSeq;
    }

    public Integer getTagSeq() {
        return tagSeq;
    }

    public void setTagSeq(Integer tagSeq) {
        this.tagSeq = tagSeq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seq=").append(seq);
        sb.append(", postSeq=").append(postSeq);
        sb.append(", tagSeq=").append(tagSeq);
        sb.append("]");
        return sb.toString();
    }
}