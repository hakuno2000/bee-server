package com.example.bee.support;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDate;

@Getter
@Setter
public class OrderDTO {
    private Long id;

    private String item;

    private Long value;

    private Double weight;

    private String description;

    private Boolean status;

    private String senderName;

    private String senderPhone;

    private String senderAddress;

    private String receiverName;

    private String receiverPhone;

    private String receiverAddress;

    private LocalDate orederedDate;

    private LocalDate sentDate;

    private LocalDate receivedDate;
}
