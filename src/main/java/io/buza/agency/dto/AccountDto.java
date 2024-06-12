package io.buza.agency.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AccountDto {

    private Long accountSeq;
    private String accountUsername;
    private String accountPassword;
    private String accountRole;
    private String status;
    private String realName;
    private String birthday;
    private String gender;
    private String accountType;
    private String accountLevel;
    private String nickname;
    private String avatar;
    private String country;

}
