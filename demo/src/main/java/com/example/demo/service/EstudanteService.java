package com.example.demo.service;

import com.example.demo.model.Estudante;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EstudanteService {

    public List<Estudante> getEstudantes(){
        return List.of(new Estudante(
                "Gabriel",
                22,
                LocalDate.of(1999,8,31),
                "gabriel-pivoto@outlook.com"
        ));
    }

}
