package io.buza.agency.dto.response;

import io.buza.agency.entity.Account;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountResponseDto {

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
    public AccountResponseDto(Long accountSeq, String accountUsername, String accountPassword, String accountRole, String status, String realName, String birthday, String gender, String accountType, String accountLevel, String nickname, String avatar, String country) {
        this.accountSeq = accountSeq;
        this.accountUsername = accountUsername;
        this.accountPassword = accountPassword;
        this.accountRole = accountRole;
        this.status = status;
        this.realName = realName;
        this.birthday = birthday;
        this.gender = gender;
        this.accountType = accountType;
        this.accountLevel = accountLevel;
        this.nickname = nickname;
        this.avatar = avatar;
        this.country = country;
    }

    public static AccountResponseDto fromEntity(Account account) {
        return AccountResponseDto.builder()
                .accountSeq(account.getAccountSeq())
                .accountUsername(account.getAccountUsername())
                .accountPassword(account.getAccountPassword())
                .accountRole(account.getAccountRole())
                .status(account.getStatus())
                .realName(account.getRealName())
                .birthday(account.getBirthday())
                .gender(account.getGender())
                .accountType(account.getAccountType())
                .accountLevel(account.getAccountLevel())
                .nickname(account.getNickname())
                .avatar(account.getAvatar())
                .country(account.getCountry())
                .build();
    }

}
