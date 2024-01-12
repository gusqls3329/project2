package com.green.project2.user;

import lombok.RequiredArgsConstructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import({UserService.class})
public class UserServiceTest {
    @MockBean
    private UserMapper mapper;
    @Autowired
    private UserService service;


    @Test
    void postSignup() {

    }

    @Test
    void postSignin() {
    }

    @Test
    void getFindUid() {
    }

    @Test
    void getFindUpw() {
    }

    @Test
    void putUser() {
    }

    @Test
    void patchUser() {
    }

    @Test
    void getUSer() {
    }
}
