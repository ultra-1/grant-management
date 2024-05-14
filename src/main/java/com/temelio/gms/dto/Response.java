package com.temelio.gms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Response<T> {

    private T t;

    private boolean success;
}
