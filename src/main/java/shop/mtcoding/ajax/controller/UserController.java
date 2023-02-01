package shop.mtcoding.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.ajax.dto.ResponseDto;

@Controller
public class UserController {

    // @getMapping("/join") => 값검증
    // public String join() {
    // 양쪽에서 검증
    // username , password , email (값 검증)
    // 모델(service , repository , db)
    // }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    // 스프링은 200만 응답(오류가 안난다면)
    // 중복체크 컨트롤러
    @GetMapping("/user/usernameSameCheck")
    public @ResponseBody ResponseDto<?> check(String username) {
        // 유효성 검사
        if (username == null || username.isEmpty()) {
            return new ResponseDto<>(-1, "username 쿼리스트링을 전달해주세요", false);
        }
        if (username.equals("ssar")) {// db에 있음
            return new ResponseDto<>(1, "동일한 username이 존재합니다", false);
        } else {
            return new ResponseDto<>(1, "현재 username으로 회원가입 할 수 있습니다", true);
            // 같은게 없다
        }
    }
}
