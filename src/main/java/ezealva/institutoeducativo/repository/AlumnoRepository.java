package ezealva.institutoeducativo.repository;

import ezealva.institutoeducativo.entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, String> {
}
