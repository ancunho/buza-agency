package io.buza.agency.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@Setter
@ToString
public class BtAccount implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long seq;
    private String username;
    private String password;
    private String status;
    private String level;
    private String role;
    private String type;
    private String email;
    private String mobileNo;
    private String wechatId;
    private String kakaoId;
    private String avatar;
    private String birthday;
    private String gender;
    private String nickName;
    private String realName;
    private String intro;
    private String country;
    private String city;
    private String district;
    private String address;
    private Date createdAt;
    private String createdBy;
    private Date modifiedAt;
    private String modifiedBy;

}