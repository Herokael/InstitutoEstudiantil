package ezealva.institutoeducativo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CAPACITACION")
public class CapacitacionEntity {
    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(generator = "uuid", strategy = GenerationType.UUID)
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha_inicio", updatable = false)
    private LocalDate fechaInicio;
    @Column(name = "fecha_fin", updatable = false)
    private LocalDate fechaFin;
    @Column(name = "profesional_a_cargo", updatable = false)
    private String profesionalACargo;

    @ManyToOne
    @JoinColumn(name = "profesor_id", foreignKey = @ForeignKey(name = "capacitacion_profesor_fk"))
    private ProfesorEntity profesor;
}
