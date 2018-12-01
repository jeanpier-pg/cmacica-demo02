package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Value("${labs02.nombre}")
    private String nombre;

    @Autowired
    //@Qualifier("ClienteProxyV2")
    private ClienteProxy clienteProxy;

    @Override
    public String getNombres(int id) {
        return nombre + Integer.toString(id);
    }

    @Override
    public String getCuenta(int id) {
        return "12121212-121212";
    }

    @Override
    public int calcular(int i1, int i2) {
        return clienteProxy.calcular(i1,i2);
    }
}
