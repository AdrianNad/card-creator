package per.an.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "borders")
public class Border {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String borderLocalization;
}
