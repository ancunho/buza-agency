package io.buza.agency.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BtPost {
    private Long postSeq;

    private String postUuid;

    private String postType;

    private String postTitle;
    private String postIntro;

    private String eventStartTime;

    private String eventEndTime;

    private String reserveStartTime;

    private String reserveEndTime;

    private String postThumbnailSmall;

    private String postThumbnailBig;

    private String postBannerBg;

    private String postAuthor;

    private String isJoin;

    private String isNeedPay;

    private BigDecimal postPrice;

    private String status;

    private Date createdAt;

    private String createdBy;

    private Date modifiedAt;

    private String modifiedBy;

    private String postContent;

    public Long getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(Long postSeq) {
        this.postSeq = postSeq;
    }

    public String getPostUuid() {
        return postUuid;
    }

    public void setPostUuid(String postUuid) {
        this.postUuid = postUuid;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostIntro() {
        return postIntro;
    }

    public void setPostIntro(String postIntro) {
        this.postIntro = postIntro;
    }

    public String getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public String getReserveStartTime() {
        return reserveStartTime;
    }

    public void setReserveStartTime(String reserveStartTime) {
        this.reserveStartTime = reserveStartTime;
    }

    public String getReserveEndTime() {
        return reserveEndTime;
    }

    public void setReserveEndTime(String reserveEndTime) {
        this.reserveEndTime = reserveEndTime;
    }

    public String getPostThumbnailSmall() {
        return postThumbnailSmall;
    }

    public void setPostThumbnailSmall(String postThumbnailSmall) {
        this.postThumbnailSmall = postThumbnailSmall;
    }

    public String getPostThumbnailBig() {
        return postThumbnailBig;
    }

    public void setPostThumbnailBig(String postThumbnailBig) {
        this.postThumbnailBig = postThumbnailBig;
    }

    public String getPostBannerBg() {
        return postBannerBg;
    }

    public void setPostBannerBg(String postBannerBg) {
        this.postBannerBg = postBannerBg;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getIsJoin() {
        return isJoin;
    }

    public void setIsJoin(String isJoin) {
        this.isJoin = isJoin;
    }

    public String getIsNeedPay() {
        return isNeedPay;
    }

    public void setIsNeedPay(String isNeedPay) {
        this.isNeedPay = isNeedPay;
    }

    public BigDecimal getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(BigDecimal postPrice) {
        this.postPrice = postPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postSeq=").append(postSeq);
        sb.append(", postUuid=").append(postUuid);
        sb.append(", postType=").append(postType);
        sb.append(", postTitle=").append(postTitle);
        sb.append(", eventStartTime=").append(eventStartTime);
        sb.append(", eventEndTime=").append(eventEndTime);
        sb.append(", reserveStartTime=").append(reserveStartTime);
        sb.append(", reserveEndTime=").append(reserveEndTime);
        sb.append(", postThumbnailSmall=").append(postThumbnailSmall);
        sb.append(", postThumbnailBig=").append(postThumbnailBig);
        sb.append(", postBannerBg=").append(postBannerBg);
        sb.append(", postAuthor=").append(postAuthor);
        sb.append(", isJoin=").append(isJoin);
        sb.append(", isNeedPay=").append(isNeedPay);
        sb.append(", postPrice=").append(postPrice);
        sb.append(", status=").append(status);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedAt=").append(modifiedAt);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", postContent=").append(postContent);
        sb.append("]");
        return sb.toString();
    }
}