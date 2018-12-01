package pe.cmacica.labs.labs02.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClienteProxyImpl implements ClienteProxy {
    @Override
    public int calcular(int i1, int i2) {
        return i1+i2;
    }
}
