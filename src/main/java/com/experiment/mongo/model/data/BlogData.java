package com.experiment.mongo.model.data;

import com.experiment.mongo.model.form.BlogForm;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlogData extends BlogForm {

    private Integer id;

    public BlogData(Integer id, @NotNull String name, @NotNull String title, @NotNull String post) {
        super(name, title, post);
        this.id = id;
    }
}
