package Practice.Web.domain.item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Glasses {

    @Id @GeneratedValue
    @Column(name = "glasses_id")
    private Long id;

    private String brand;
    private String name;
    private int price;
}
