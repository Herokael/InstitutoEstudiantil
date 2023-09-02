package ezealva.institutoeducativo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CURSO")
public class CursoEntity {
    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(generator = "uuid", strategy = GenerationType.UUID)
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "duracion")
    private String duracion;
    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;
    @Column(name = "nota_aprobacion")
    private Float notaAprobacion;

    @ManyToMany(mappedBy = "cursos", fetch = FetchType.LAZY)
    private List<AlumnoEntity> alumnos;

    @ManyToOne
    @JoinColumn(name = "profesor_id", foreignKey = @ForeignKey(name = "profesor_id_fk"))
    private ProfesorEntity profesor;
}
