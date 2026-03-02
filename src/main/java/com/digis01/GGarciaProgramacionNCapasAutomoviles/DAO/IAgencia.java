package com.digis01.GGarciaProgramacionNCapasAutomoviles.DAO;

import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Result;

public interface IAgencia {
    Result AgenciaGetAll();
    Result AgenciaGetByIdAgencia(int idAgencia);
    
}
