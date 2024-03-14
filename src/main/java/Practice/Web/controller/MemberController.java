package Practice.Web.controller;

import Practice.Web.domain.item.Member;
import Practice.Web.repository.MemberRepository;
import Practice.Web.service.MemberService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final HttpSession session;
    private final MemberService memberService;
    private final MemberRepository memberRepository;

    @GetMapping("/members/new")
    public String createForm(Model model){
        model.addAttribute("memberForm", new MemberForm());
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(@Valid MemberForm form, BindingResult result){

        if(result.hasErrors())
            return "members/createMemberForm";

        Member member = new Member();
        member.setName(form.getName());
        member.setNid(form.getNid());
        member.setPassword(form.getPassword());
        member.setPhone_number(form.getPhone_number());
        member.setAddress(form.getAddress());

        memberService.join(member);
        return "redirect:/";
    }

    @GetMapping("/members/login")
    public String loginForm(Model model){
        model.addAttribute("LoginForm", new LoginForm());
        return "members/loginMember";
    }

    @PostMapping("/members/login")
    public String login(@Valid LoginForm form, BindingResult result, Model model){
        boolean loggedIn = false;

        if(result.hasErrors())
            return "members/loginMember";

        Member member = memberRepository.findByID(form.getNid());
        if(member != null && Objects.equals(member.getPassword(), form.getPassword())) {
            loggedIn = true;
            model.addAttribute("loggedIn", loggedIn);
            session.setAttribute("loggedInMember", member);
            return "hello";
        }
        else {
            model.addAttribute("loggedIn", loggedIn);
            model.addAttribute("LoginForm", new LoginForm());
            model.addAttribute("errorMessage", "아이디 또는 비밀번호가 틀렸습니다");
            return "members/loginMember";
        }
    }
    @GetMapping("/members/logout")
    public String logout(){
        session.removeAttribute("loggedInMember");
        return "redirect:/";
    }

    @GetMapping("/members/member")
    public String mypage(Model model){
        Member loggedInMember = (Member) session.getAttribute("loggedInMember");
        if (loggedInMember != null) {
            model.addAttribute("loggedInMember", loggedInMember);
            return "members/memberPage";
        } else
            return "hello";
    }
}