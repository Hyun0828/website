package Practice.Web.domain.item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
public class Lens {

    @Id @GeneratedValue
    @Column(name = "lens_id")
    private Long id;

    private String brand;
    private String name;
    private int price;
}
