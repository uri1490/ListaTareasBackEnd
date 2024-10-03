package com.SpringBackEnd.TaskList.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoResponse {
    private String message;
    private boolean status;
}
