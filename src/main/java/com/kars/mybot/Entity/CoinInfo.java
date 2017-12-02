package com.kars.mybot.Entity;

import com.kars.mybot.Enum.IsDeleted;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CoinInfo extends BaseEntity {

    /**
     * 코인 정보 테이블 ID
     * auto increment PK
     */
    @Id
    @Column(name="coin_id")
    private Integer coinId;
    /**
     * 코인 이름
     */
    @Column(name="coin_name")
    private String coinName;

    /**
     * 코인 이니셜
     */
    @Column(name="coin_initial")
    private String coinInitial;

    /**
     * 삭제여부
     */
    @Enumerated(EnumType.STRING)
    @Column(name="is_deleted")
    private IsDeleted isDeleted;

}
