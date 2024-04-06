package ma.emsi.userrole.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String password;
    @ManyToMany(mappedBy = "users" ,fetch = FetchType.LAZY)
    private List<Role> roles =new ArrayList<>();
}
