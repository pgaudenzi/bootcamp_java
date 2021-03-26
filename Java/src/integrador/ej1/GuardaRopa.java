package integrador.ej1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private Map<Integer, List<Prenda>> guardaRopa = new HashMap<>();
    private Integer contador = 0;

    public Integer guardarPrendas(List<Prenda> prendas) {
        final Integer id = contador;
        guardaRopa.put(id, prendas);
        contador ++;
        return id;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> entry : guardaRopa.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", prendas: " + entry.getValue());
        }
    }

    public List<Prenda> devolverPrenda(Integer id) {
        List<Prenda> prendas = guardaRopa.get(id);
        guardaRopa.remove(id);
        return prendas;
    }

}
