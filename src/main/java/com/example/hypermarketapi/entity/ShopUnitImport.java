package com.example.hypermarketapi.entity;

import java.util.UUID;
import lombok.Data;
import lombok.NonNull;

@Data
public class ShopUnitImport {

  @NonNull private final UUID id;
  @NonNull private final String name;
  @NonNull private final UUID parentId;
  private ShopUnitType type;
  private Integer price;
}
