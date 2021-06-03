package com.example.bee.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item", nullable = false)
    private String item;

    @Column(name = "value", nullable = false)
    private Long value;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @Column(name = "sender_name", nullable = false)
    private String senderName;

    @Column(name = "sender_phone", nullable = false)
    private String senderPhone;

    @Column(name = "sender_address", nullable = false)
    private String senderAddress;

    @Column(name = "receiver_name", nullable = false)
    private String receiverName;

    @Column(name = "receiver_phone", nullable = false)
    private String receiverPhone;

    @Column(name = "receiver_address", nullable = false)
    private String receiverAddress;

    @Column(name = "ordered_date", nullable = false)
    private LocalDate orederedDate;

    @Column(name = "sent_date", nullable = false)
    private LocalDate sentDate;

    @Column(name = "received_date", nullable = false)
    private LocalDate receivedDate;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "shipper_id", referencedColumnName = "id")
    private Account account;
}
