package sv.edu.catolica.safesales.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name="tiendas")
public class TiendaEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTienda;

    private String nombre;
    private String descripcion;
    private String storeAddress;

    // Ruta o URL del logo
    private String logo; // ejemplo: "/uploads/logos/logo123.png" o "https://miapp.com/logos/logo123.png"

    // Relación con usuario
    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario") // asegúrate que coincida con la PK de UsuarioEntity
    private UsuarioEntity usuario;
}