package io.buza.agency.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @CreatedDate
    @Column
    private LocalDateTime createdAt; // 생성 일자

    @CreatedBy
    @Column
    private String createdBy; // 생성자

    @LastModifiedDate
    @Column
    private LocalDateTime modifiedAt; //변경 일자

    @LastModifiedBy
    @Column
    private String modifiedBy; //변경자

}
