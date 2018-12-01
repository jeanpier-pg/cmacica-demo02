package pe.cmacica.labs.labs02.repository;

public interface ClienteRepository {

    String getNombres(int id);
    String getCuenta(int id);

    int calcular(int i1, int i2);
}
