package simflow.praycard.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import simflow.praycard.domain.BaseTimeEntity;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Pray extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pray_id")
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public Pray(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
