package org.jimcode.rapidosyfuriosos.service;

import org.jimcode.rapidosyfuriosos.entity.DistritoEntity;

import java.util.List;

public interface DistritoService {
    // Declaramos las operaciones con las cuales vamos a trabajar
    // Mostrar distrito
    List<DistritoEntity> findAll();

    // Mostrar distrito habilitado
    List<DistritoEntity> findAllCustom();

    // Buscar distrito por código
    DistritoEntity findById(Long id);

    // Registrar distrito
    DistritoEntity add(DistritoEntity distritoEntity);

    // Actualizar distrito
    DistritoEntity update(DistritoEntity distritoEntity, Long id);

    // Eliminar de manera lógica
    DistritoEntity delete(Long id);

    // Habilitar distrito
    DistritoEntity enable (Long id);
}
