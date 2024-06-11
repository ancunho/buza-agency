package io.buza.agency.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString(callSuper = true)
@Table(indexes = {
        @Index(columnList = "accountUsername", unique = true),
        @Index(columnList = "createdAt")
})
@Entity
public class Account extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountSeq;

    @Setter
    @Column(nullable = false, length = 32)
    private String accountUsername;

    @Setter
    @Column(length = 100)
    private String accountPassword;
    @Setter @Column private String accountRole;


    @Setter @Column private String status;
    @Setter @Column private String realName;
    @Setter @Column private String birthday;
    @Setter @Column private String gender;
    @Setter @Column private String accountType;
    @Setter @Column private String accountLevel;
    @Setter @Column private String nickname;
    @Setter @Column private String avatar;
    @Setter @Column private String country;

    protected Account() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(accountSeq, account.accountSeq) && Objects.equals(accountUsername, account.accountUsername) && Objects.equals(accountPassword, account.accountPassword) && Objects.equals(accountRole, account.accountRole) && Objects.equals(status, account.status) && Objects.equals(realName, account.realName) && Objects.equals(birthday, account.birthday) && Objects.equals(gender, account.gender) && Objects.equals(accountType, account.accountType) && Objects.equals(accountLevel, account.accountLevel) && Objects.equals(nickname, account.nickname) && Objects.equals(avatar, account.avatar) && Objects.equals(country, account.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSeq, accountUsername, accountPassword, accountRole, status, realName, birthday, gender, accountType, accountLevel, nickname, avatar, country);
    }
}
