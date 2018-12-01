package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    //@Qualifier("ClienteProxyV2")
    private ClienteProxy clienteProxy;

    @Override
    public String getNombres(int id) {
        return "Nuevo Cliente : " + Integer.toString(id);
    }

    @Override
    public String getCuenta(int id) {
        return "Nueva Cuenta";
    }

    @Override
    public int calcular(int i1, int i2) {
        return clienteProxy.calcular(i1,i2);
    }
}
