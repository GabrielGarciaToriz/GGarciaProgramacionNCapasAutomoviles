package com.digis01.GGarciaProgramacionNCapasAutomoviles.ML;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Agencia {

    private int IdAgencia;
    private String Nombre;
    private String Direccion;
    public List<Automovil> Automoviles;

}
