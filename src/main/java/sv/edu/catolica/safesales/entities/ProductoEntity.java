package sv.edu.catolica.safesales.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name="productos")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;

    private String nombre;
    private String descripcion;
    private double precio;
    private Long stock;
    private String estado;
    private Date fecha_Creacion;
    private Boolean activo;
    private String foto;
    private String categoria;

    // Relación con usuario
    @ManyToOne
    @JoinColumn(name = "idTienda", referencedColumnName = "idTienda") // asegúrate que coincida con la PK de UsuarioEntity
    private TiendaEntity tienda;
}
