package com.lec.spring.domain;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Chat extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, columnDefinition = "text")
    private String message;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    @ToString.Exclude
    private User sender;

    @ManyToOne
    @JoinColumn(name = "room_id")
    @ToString.Exclude
    private ChatRoom chatRoom;
}
