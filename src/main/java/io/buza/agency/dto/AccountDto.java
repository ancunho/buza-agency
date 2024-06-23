package io.buza.agency.dto;

import io.buza.agency.dto.request.BaseRequest;
import io.buza.agency.entity.Account;
import jakarta.persistence.Column;
import lombok.*;
import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AccountDto extends BaseRequest {

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
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;



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

    @Builder
    public AccountDto(
            Long accountSeq,
            String accountUsername,
            String accountPassword,
            String accountRole,
            String status,
            String realName,
            String birthday,
            String gender,
            String accountType,
            String accountLevel,
            String nickname,
            String avatar,
            String country,
            LocalDateTime createdAt,
            String createdBy,
            LocalDateTime modifiedAt,
            String modifiedBy) {
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
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }

    public static AccountDto fromEntitytoDto(Account entity) {
        return new AccountDto(
                entity.getAccountSeq(),
                entity.getAccountUsername(),
                entity.getAccountPassword(),
                entity.getAccountRole(),
                entity.getStatus(),
                entity.getRealName(),
                entity.getBirthday(),
                entity.getGender(),
                entity.getAccountType(),
                entity.getAccountLevel(),
                entity.getNickname(),
                entity.getAvatar(),
                entity.getCountry(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getModifiedBy()
        );
    }

}
