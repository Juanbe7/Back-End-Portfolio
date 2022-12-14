package com.portfolio.juan.bustos;

import com.portfolio.juan.bustos.model.usuarioModel;
import com.portfolio.juan.bustos.repository.loginRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;
import  static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class LoginRepositoryTest {
    @Autowired
    loginRepository repo;

    @Test

    public void testCreateUser()
    {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword= "123456Juan";
        String encodePassword= passwordEncoder.encode(rawPassword);
        usuarioModel newUser = new usuarioModel("jemiliobus@gmail.com",encodePassword);
        usuarioModel savedUser= repo.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
}
