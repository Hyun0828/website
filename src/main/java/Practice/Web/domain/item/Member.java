package Practice.Web.domain.item;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    private String nid;

    @NotEmpty
    private String name;

    @NotEmpty
    private String password;

    private String phone_number;

    private String address;

}
