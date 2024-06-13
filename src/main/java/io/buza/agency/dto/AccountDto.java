package io.buza.agency.dto;

import io.buza.agency.entity.Account;
import jakarta.persistence.Column;
import lombok.*;

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

    @Builder
    public static Account toEntity(AccountDto accountDto) {
        return Account.builder()
                .accountSeq(accountDto.accountSeq)
                .accountUsername(accountDto.accountUsername)
                .accountPassword(accountDto.accountPassword)
                .accountRole(accountDto.accountRole)
                .status(accountDto.status)
                .realName(accountDto.realName)
                .birthday(accountDto.birthday)
                .gender(accountDto.gender)
                .accountType(accountDto.accountType)
                .accountLevel(accountDto.accountLevel)
                .nickname(accountDto.nickname)
                .avatar(accountDto.avatar)
                .country(accountDto.country)
                .build();
    }

}
