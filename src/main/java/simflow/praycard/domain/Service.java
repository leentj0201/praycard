package simflow.praycard.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Service extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String serviceCode;

    @Column
    private String serviceDetailCode;

    @Column
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    //@OneToMany(mappedBy = "service", cascade = CascadeType.ALL)


}
