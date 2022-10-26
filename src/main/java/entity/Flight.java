package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// para usarlos hay que importar loombook
@Data //genera getters y setters, hashcode, equals y tostring
@AllArgsConstructor // genera constructor con todos los campos
@NoArgsConstructor // genera construcctor vacio

public class Flight {

    private String origin;
    private String destiny;
    private String date;
    private List<String> passagers;

}
