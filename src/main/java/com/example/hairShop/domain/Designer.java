package com.example.hairShop.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "designer_tb")
@NoArgsConstructor
@Getter
public class Designer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "info")
    private String info;

    @Builder
    public Designer(String name, String info){
        this.name = name;
        this.info = info;
    }
}
