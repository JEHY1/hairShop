package com.example.hairShop.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "but_tb")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Buy {

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "designer_id", nullable = false)
    private Long designerId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "price")
    private int price;

    @Column(name = "time")
    private LocalDateTime time;

    @Builder
    public Buy(Long designerId, Long customerId, int price, LocalDateTime time){
        this.designerId = designerId;
        this.customerId = customerId;
        this.time = time;
    }
}
