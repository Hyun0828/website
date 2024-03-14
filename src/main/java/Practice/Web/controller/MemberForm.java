package Practice.Web.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수입니다.")
    private String name;

    @NotEmpty(message = "아이디는 필수입니다")
    private String nid;

    @NotEmpty(message = "비밀번호는 필수입니다.")
    private String password;

    private String phone_number;

    private String address;
}