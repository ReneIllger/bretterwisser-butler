package de.bretterwisser.butler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JDAConfig {

    public JDAConfig(@Value("${TOKEN}") String token) {
        System.out.println(token);
    }

}
