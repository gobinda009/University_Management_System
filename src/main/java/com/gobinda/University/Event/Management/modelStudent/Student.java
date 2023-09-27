package com.gobinda.University.Event.Management.modelStudent;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.objenesis.instantiator.sun.MagicInstantiator;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private Integer studentId;
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$" )
    private String firstName;
    private String lastName;
    @Min(18)
    @Max(25)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
