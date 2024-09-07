package com.dayone.model;

import lombok.Builder;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.annotation.sql.DataSourceDefinitions;
import java.time.LocalDateTime;

@Data
@Builder
public class Dividend {
    private LocalDateTime date;
    private String dividend;
}
