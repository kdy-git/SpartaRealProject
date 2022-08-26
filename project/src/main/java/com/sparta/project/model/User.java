package com.sparta.project.model;
import lombok.Getter;
import javax.persistence.*;

@Table(name = "users")
@Entity
@Getter
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String nickname;

    @Column
    private Long bowlingAverage;  // 볼링 평균 평점

    @Column
    private Long bowlingMatchCount; // 볼링 게임 수

}
