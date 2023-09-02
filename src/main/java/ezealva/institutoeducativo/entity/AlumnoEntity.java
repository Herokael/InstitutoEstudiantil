package ezealva.institutoeducativo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import ezealva.institutoeducativo.util.Sexo;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ALUMNO")
public class AlumnoEntity {
    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(generator = "uuid", strategy = GenerationType.UUID)
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    @Column(name = "tipo_dni")
    private String tipoDni;
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "domicilio_actual")
    private String domicilioActual;
    @Column(name = "sexo")
    private Sexo sexo;
    @Column(name = "telefono")
    private String telefono;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "ALUMNO_CURSO",
            joinColumns = @JoinColumn(
                    name = "alumno_id",
                    foreignKey = @ForeignKey(name = "alumno_curso_fk")
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "curso_id",
                    foreignKey = @ForeignKey(name = "curso_alumno_fk")
            )
    )
    private List<CursoEntity> cursos;
}
