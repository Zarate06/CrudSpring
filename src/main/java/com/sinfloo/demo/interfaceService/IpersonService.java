package com.sinfloo.demo.interfaceService;

import com.sinfloo.demo.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IpersonService {
    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
