package pe.cmacica.labs.labs02.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ClienteProxyV2")
public class ClienteProxyV2impl implements ClienteProxy {
    @Override
    public int calcular(int i1, int i2) {
        return i1 * i2;
    }
}
