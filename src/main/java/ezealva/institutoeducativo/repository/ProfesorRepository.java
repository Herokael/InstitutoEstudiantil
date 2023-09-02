package ezealva.institutoeducativo.repository;

import ezealva.institutoeducativo.entity.ProfesorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<ProfesorEntity, String> {
}
