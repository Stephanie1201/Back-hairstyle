package back.hair.Repository;

import back.hair.Model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface testRepo extends JpaRepository<Test, Long> {

    //List<test> findAll();
}
