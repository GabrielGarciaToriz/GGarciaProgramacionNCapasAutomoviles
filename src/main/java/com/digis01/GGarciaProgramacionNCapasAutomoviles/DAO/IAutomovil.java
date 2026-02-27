package com.digis01.GGarciaProgramacionNCapasAutomoviles.DAO;

import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Result;
import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Automovil;

public interface IAutomovil {

    Result AutomovilGetAll();

    Result AutomovilGetAllById(int IdAutomovil);

    Result AutomovilAdd(Automovil automovil);

    Result AutomovilModify(Automovil automovil);

    Result AutomovilDelete(int IdAutomovil);
}
