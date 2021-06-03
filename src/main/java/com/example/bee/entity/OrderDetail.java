package com.example.bee.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "orderdetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ordered_date", nullable = false)
    private LocalDate orederedDate;

    @Column(name = "sent_date", nullable = false)
    private LocalDate sentDate;

    @Column(name = "received_date", nullable = false)
    private LocalDate receivedDate;

    @JsonManagedReference(value = "orederdetail_account")
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "shipper_id", referencedColumnName = "id")
    private Account account;

    @JsonBackReference(value = "order_orderdetail")
    @OneToOne(mappedBy = "orderDetail")
    private Order order;
}
