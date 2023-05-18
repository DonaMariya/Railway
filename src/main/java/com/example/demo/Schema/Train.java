package com.example.demo.Schema;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Train {
    @Id
    @GeneratedValue
    private Long trainId;
    private String source;
    private String destination;

    private String classType;
}
