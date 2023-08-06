package com.epicode.gestioneDispositivi.repositoryDispositivo;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.epicode.gestioneDispositivi.enums.TipoDispositivo;
import com.epicode.gestioneDispositivi.model.Dispositivo;

public interface DispositivoRepository extends CrudRepository<Dispositivo, Long>{

	Optional<Dispositivo> findByRoleName(TipoDispositivo tipoDispositivo);
}
