package hello.hellospring.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author dalgun
 * @since 2018-11-28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Kiosk {

    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 병원코드
     */
    @Column
    private String hospitalCd;

    /**
     * 구역코드
     */
    @Column
    private String sectionCd;

    /**
     * 업무코드
     */
    @Column
    private String bizCd;

    /**
     * 순서
     */
    @Column
    private Integer seq;

    /**
     * 구역이름
     */
    @Column
    private String sectionNm;

    /**
     * 업무이름
     */
    @Column
    private String bizNm;

    /**
     * 비고
     */
    @Column
    private String remark;

    /**
     * 생성일시
     */
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss")
    @Column(nullable = false)
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime createDate;

    /**
     * 수정일시
     */
    @JsonFormat(pattern = "yyyy-MM-dd kk:mm:ss")
    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime updateDate;

    /**
     * 시작시간
     */
    @Column
    private String kioskStartTime;

    /**
     * 종료시간
     */
    @Column
    private String kioskEndTime;

    /**
     * 대기인수
     */
    @Transient
    private Integer waitingCnt;
}
