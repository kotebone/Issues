package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Issue {
    private int id;
    private String name;
    private String author;
    private boolean assignee;
    private boolean opened;
}

