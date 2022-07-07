package com.example.hypermarketapi.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;

@Data
public class ShopUnitStatisticUnit {

  private UUID id;
  private String name;
  private UUID parentId;
  private ShopUnitType type;
  private Integer price;
  private LocalDateTime date;
}
