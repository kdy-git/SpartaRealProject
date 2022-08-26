package com.sparta.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Post {

    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String writer;

    @Column
    private String title;

    @Column
    private String contents;

    @OneToMany
    @JoinColumn(name = "post_id")
    private List<InvitedUser> invitedUsers;

}
