package com.bdqn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Peitems {
    private int itemId;
    private String itemName;
    private int typeId;
    private int necessary;
    private String ref;
    private double price;
    private String info;
    private Itemtypes typeName;
}
