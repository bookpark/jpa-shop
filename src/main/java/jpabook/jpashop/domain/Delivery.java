package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    // EnumType은 꼭 String으로.. 중간에 밀려서 망할수도 있음
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; // READY, COMP

}
