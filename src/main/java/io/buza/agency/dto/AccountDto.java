package io.buza.agency.dto;

import io.buza.agency.dto.request.BaseRequest;
import io.buza.agency.entity.BtAccount;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AccountDto extends BaseRequest implements Serializable {

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
    private String createdAt;
    private String createdBy;
    private String modifiedAt;
    private String modifiedBy;

    public static AccountDto toEntity(AccountDto accountDto) {
        AccountDto entity = new AccountDto();
        entity.setSeq(accountDto.getSeq());
        entity.setUsername(accountDto.getUsername());
        entity.setPassword(accountDto.getPassword());
        entity.setStatus(accountDto.getStatus());
        entity.setLevel(accountDto.getLevel());
        entity.setRole(accountDto.getRole());
        entity.setType(accountDto.getType());
        entity.setEmail(accountDto.getEmail());
        entity.setMobileNo(accountDto.getMobileNo());
        entity.setWechatId(accountDto.getWechatId());
        entity.setKakaoId(accountDto.getKakaoId());
        entity.setAvatar(accountDto.getAvatar());
        entity.setBirthday(accountDto.getBirthday());
        entity.setGender(accountDto.getGender());
        entity.setNickName(accountDto.getNickName());
        entity.setRealName(accountDto.getRealName());
        entity.setIntro(accountDto.getIntro());
        entity.setCountry(accountDto.getCountry());
        entity.setCity(accountDto.getCity());
        entity.setDistrict(accountDto.getDistrict());
        entity.setAddress(accountDto.getAddress());
        entity.setCreatedAt(accountDto.getCreatedAt());
        entity.setCreatedBy(accountDto.getCreatedBy());
        entity.setModifiedAt(accountDto.getModifiedAt());
        entity.setModifiedBy(accountDto.getModifiedBy());

        return entity;

    }



}
