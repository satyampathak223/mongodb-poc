package com.experiment.mongo.model.form;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlogForm {
    @NotNull
    private String name;
    @NotNull
    private String title;
    @NotNull
    private String post;
}
