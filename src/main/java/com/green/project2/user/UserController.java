package com.green.project2.user;

import com.green.project2.common.ResVo;
import com.green.project2.user.model.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;

    @PostMapping("/signup")
    public ResVo postSignup(@RequestBody SignupDto dto){
        return new ResVo(service.postSignup(dto));
    }

    @PostMapping
    public SigninVo postSignin(@RequestBody SigninDto dto){
        return service.postSignin(dto);
    }

    @PostMapping("/id")
    public FindUidVo getFindUid(@RequestBody FindUidDto phone){
        return service.getFindUid(phone);
    }

    @PatchMapping("/pw")
    public ResVo getFindUpw(@RequestBody FindUpwDto dto){
        return new ResVo(service.getFindUpw(dto));
    }
    @PutMapping
    public int putUser(@RequestBody ChangeUserDto dto){
        return service.putUser(dto);
    }
    @PatchMapping
    public int patchUser(@RequestBody DelUserDto dto){
        return service.patchUser(dto);
    }
    @GetMapping
    public SelUserVo getUSer( int iuser){
        return service.getUSer(iuser);
    }

}
