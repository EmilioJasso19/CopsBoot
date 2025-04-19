package mx.uv.coatza.aejl.copsboot.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.HashSet;
import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void testStoreUser() {
        Set<UserRole> roles = new HashSet<>();
        roles.add(UserRole.OFFICER);

        User user = repository.save(new User(
                "alex.foley@beverly-hills.com",
                "my-secret-pwd",
                roles
        ));

        assertThat(user).isNotNull();
        assertThat(user.getId()).isNotNull();
    }
}
