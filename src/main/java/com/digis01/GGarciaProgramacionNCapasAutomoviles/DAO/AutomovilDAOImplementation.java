package com.digis01.GGarciaProgramacionNCapasAutomoviles.DAO;

import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Result;
import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Automovil;
import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Agencia;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AutomovilDAOImplementation implements IAutomovil {

    @Autowired
    private JdbcTemplate JdbcTemplate;

    @Override
    public Result AutomovilGetAll() {
        Result result = new Result();
        result.objects = new ArrayList<>();
        try {
            JdbcTemplate.execute("CALL automovilgetallsp(?)", (CallableStatementCallback<Boolean>) callableStatement -> {
                callableStatement.registerOutParameter(1, java.sql.Types.REF_CURSOR);
                callableStatement.execute();
                ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
                while (resultSet.next()) {
                    Automovil automovil = new Automovil();
                    automovil.setIdAutomovil(resultSet.getInt("IdAutomovil"));
                    automovil.setMarca(resultSet.getString("Marca"));
                    automovil.setModelo(resultSet.getString("Modelo"));
                    automovil.setYear(resultSet.getString("Year"));
                    Agencia agencia = new Agencia();
                    agencia.setIdAgencia(resultSet.getInt("IdAgencia"));
                    agencia.setNombre(resultSet.getString("Agencia"));
                    agencia.setDireccion(resultSet.getString("Direccion"));
                    automovil.setAgencia(agencia);
                    result.objects.add(automovil);

                }
                return result.correct = true;

            });
        } catch (Exception e) {
            result.correct = false;
            result.errorMessage = e.getLocalizedMessage();
            result.ex = e;
        }
        return result;
    }

    @Override
    public Result AutomovilGetAllById(int IdAutomovil) {
        Result result = new Result();

        return result;
    }

    @Override
    public Result AutomovilAdd(Automovil automovil) {
        Result result = new Result();

        return result;
    }

    @Override
    public Result AutomovilModify(Automovil automovil) {
        Result result = new Result();

        return result;
    }

    @Override
    public Result AutomovilDelete(int IdAutomovil) {
        Result result = new Result();

        return result;
    }

}
