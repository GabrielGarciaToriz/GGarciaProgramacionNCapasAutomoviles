package com.digis01.GGarciaProgramacionNCapasAutomoviles.ML;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Automovil {

    private int IdAutomovil;
    private String Marca;
    private String Modelo;
    private String Year;
    public Agencia Agencia;

}
