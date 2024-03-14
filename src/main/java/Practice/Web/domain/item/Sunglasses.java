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
public class Sunglasses {

    @Id @GeneratedValue
    @Column(name = "sunglasses_id")
    private Long id;

    private String brand;
    private String name;
    private int price;
}
