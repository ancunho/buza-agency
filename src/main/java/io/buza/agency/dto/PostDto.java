package io.buza.agency.dto;

import io.buza.agency.dto.request.BaseRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostDto extends BaseRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long postSeq;
    private String postUuid;
    private String postType;
    private String postTitle;
    private String postIntro;
    private String postContent;
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


}
