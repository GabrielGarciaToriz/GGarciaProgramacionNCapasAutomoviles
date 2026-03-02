/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digis01.GGarciaProgramacionNCapasAutomoviles.DAO;

import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Agencia;
import com.digis01.GGarciaProgramacionNCapasAutomoviles.ML.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

@Repository
public class AgenciaDAOImplementation implements IAgencia {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Result AgenciaGetAll() {
        Result result = new Result();
        result.objects = new ArrayList<>();
        try {
            jdbcTemplate.execute("{CALL AgenciaGetAll(?)}", (CallableStatementCallback<Boolean>) callablestatement -> {
                callablestatement.registerOutParameter(1, Types.REF_CURSOR);
                callablestatement.execute();
                ResultSet resultSet = (ResultSet) callablestatement.getObject(1);
                while(resultSet.next()) {
                    Agencia agencia = new Agencia();
                    agencia.setIdAgencia(resultSet.getInt("IdAgencia"));
                    agencia.setNombre(resultSet.getString("Agencia"));
                    agencia.setDireccion(resultSet.getString("Direccion"));
                    result.objects.add(agencia);
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
    public Result AgenciaGetByIdAgencia(int idAgencia) {
        Result result = new Result();

        return result;
    }
}
