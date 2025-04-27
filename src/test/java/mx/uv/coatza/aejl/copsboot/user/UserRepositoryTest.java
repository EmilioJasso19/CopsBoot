package mx.uv.coatza.aejl.copsboot.user;

import mx.uv.coatza.aejl.copsboot.orm.jpa.InMemoryUniqueIdGenerator;
import mx.uv.coatza.aejl.copsboot.orm.jpa.UniqueIdGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void testStoreUser() {
        AuthServerId authServerId = new AuthServerId(UUID.randomUUID());
        User user = repository.save(new User(
                repository.nextId(),
                "alex.foley@beverly-hills.com",
                authServerId,
                "my-mobile-token"
        ));
        assertThat(user).isNotNull();
    }

    @TestConfiguration
    static class TestConfig {
        @Bean
        public UniqueIdGenerator<UUID> generator() {
            return new InMemoryUniqueIdGenerator();
        }
    }
}

