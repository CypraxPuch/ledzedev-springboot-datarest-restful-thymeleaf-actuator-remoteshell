package com.ledzedev.springboot.datarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 14/Nov/2016.
 */
@RepositoryRestResource
public interface RepositorioCuentas extends JpaRepository<CuentaBancaria, Long> {

    CuentaBancaria findById(@Param("id") Long id);

    Collection<CuentaBancaria> findByTitularCuenta(@Param("tc") String titularCuenta);

}
