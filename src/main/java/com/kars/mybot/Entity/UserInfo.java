package com.kars.mybot.Entity;

import com.kars.mybot.Enum.IsDeleted;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserInfo extends BaseEntity {

    /**
     * 유저 정보 테이블 ID
     * auto increment PK
     */
    @Id
    @Column(name="user_id")
    private Integer userId;
    /**
     * 유저 아이디
     * e-mail
     */
    @Column(name="user_account")
    private String userAccount;

    /**
     * 비번
     */
    @Column(name="user_password")
    private String userPassword;

    /**
     * 닉네임
     */
    @Column(name="user_nick")
    private String userNick;

    /**
     * 탈퇴여부
     */
    @Enumerated(EnumType.STRING)
    @Column(name="is_deleted")
    private IsDeleted isDeleted;


}
