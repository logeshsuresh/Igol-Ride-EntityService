package com.example.IgolEntityService.models;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DBConstant extends BaseModel {

    @Column(unique = true, nullable = false)
    private String name;

    private String value;

}
