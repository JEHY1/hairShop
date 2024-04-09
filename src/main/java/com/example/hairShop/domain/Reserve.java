package com.example.hairShop.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "reserve_tb")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "designer_id", nullable = false)
    private Long designerId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    @Column(name = "status")
    private String status;

    @Builder
    public Reserve(Long designerId, Long customerId, Long menuId, LocalDateTime time, String status){
        this.designerId = designerId;
        this.customerId = customerId;
        this.menuId = menuId;
        this.time = time;
        this.status = status;
    }




}
