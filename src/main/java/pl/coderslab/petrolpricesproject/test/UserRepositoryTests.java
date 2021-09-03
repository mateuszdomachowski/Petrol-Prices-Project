package pl.coderslab.petrolpricesproject.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import pl.coderslab.petrolpricesproject.entity.User;
import pl.coderslab.petrolpricesproject.repository.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repo;


    @Test
    public void testCreateUser() {
        //given
        User user = new User();

        user.setEmail("heh@heh.pl");
        user.setFirstName("Moze");
        user.setLastName("Sieudazaliczyc");
        user.setPassword("fingerscrossed");

        //when
        User savedUser = repo.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        //then
        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
    }
    @Test
    public void testFindUserByEmail(){
        //given
        String email = "heh@heh.pl";

        //when
        User user = repo.findByEmail(email);

        //then
        assertThat(user).isNotNull();
    }

}
