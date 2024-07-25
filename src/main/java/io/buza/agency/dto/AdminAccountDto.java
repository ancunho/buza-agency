package io.buza.agency.dto;

import io.buza.agency.config.RoleEnum;
import io.buza.agency.dto.request.BaseRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AdminAccountDto extends BaseRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private RoleEnum role;

    public AdminAccountDto(String username, String password, RoleEnum role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    private Long seq;
    private String username;
    private String password;
    private String status;
    private String real_name;
    private String role_code;
    private String role_name;
    private String mobile_no;
    private String email;
    private String thumbnail_url;
    private String wechat;
    private String kakao;
    private String memo;
    private String createdAt;
    private String createdBy;
    private String modifiedAt;
    private String modifiedBy;

    private Boolean isEnable;



}
