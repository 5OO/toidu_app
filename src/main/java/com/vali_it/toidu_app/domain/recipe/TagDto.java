package com.vali_it.toidu_app.domain.recipe;

import lombok.Data;

import java.io.Serializable;

@Data
public class TagDto implements Serializable {
    private final Integer id;
    private final String description;
}
