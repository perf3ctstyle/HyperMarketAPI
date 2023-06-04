package com.example.hypermarketapi.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.NonNull;

@Data
public class ShopUnit {

  @NonNull private final UUID id;
  @NonNull private final String name;
  @NonNull private LocalDateTime date;
  private UUID parentId;
  private ShopUnitType type;
  private Integer price;
  private List<ShopUnit> children;
}
