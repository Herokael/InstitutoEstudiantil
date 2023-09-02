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
@Table(name = "TITULO")
public class TituloEntity {
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
    @Column(name = "nota_promedio", updatable = false)
    private Float notaPromedio;

    @ManyToOne
    @JoinColumn(name = "profesor_id", foreignKey = @ForeignKey(name = "titulo_profesor_fk"))
    private ProfesorEntity profesor;
}
