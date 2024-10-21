package medico.PPE.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private static Long id;



    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;


    @Column(name = "description")
    private String description;


    @Column(name = "regtime")
    @Transient
    private String regtime;


}
