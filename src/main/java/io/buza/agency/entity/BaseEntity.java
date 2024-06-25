package io.buza.agency.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public abstract class BaseEntity {

    private LocalDateTime createdAt; // 생성 일자
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; //변경 일자
    private String modifiedBy; //변경자

}
