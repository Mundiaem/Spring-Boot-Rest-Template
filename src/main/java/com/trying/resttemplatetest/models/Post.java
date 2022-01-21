package com.trying.resttemplatetest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created with love by mundiaem
 * created on 21/01/2022
 * Time: 19:05
 * ⚡  - RestTemplateTest
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
    @JsonProperty("userId")
    int userId;
    @JsonProperty("id")
    int id;
    @JsonProperty("title")
    String title;
    @JsonProperty("body")
    String body;
}
