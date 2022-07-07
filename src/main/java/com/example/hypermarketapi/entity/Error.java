package com.example.hypermarketapi.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Error {

  private final int code;
  private final String message;
}
