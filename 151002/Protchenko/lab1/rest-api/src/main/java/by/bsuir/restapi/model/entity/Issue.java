package by.bsuir.restapi.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Issue implements Entity<Long> {

    private Long id;
    private String title;
    private String content;
    private Date created;
    private Date modified;

}
