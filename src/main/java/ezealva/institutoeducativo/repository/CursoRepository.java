package ezealva.institutoeducativo.repository;

import ezealva.institutoeducativo.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, String> {
}
