package simflow.praycard.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Feed extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="feed_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "service_id")
    private Service service;

}
