package integrador.ej3;

import java.util.List;

public class PackFuegosArtificales {

    private final List<FuegoArtificial> fuegosArtificales;

    public PackFuegosArtificales(List<FuegoArtificial> fuegosArtificales) {
        this.fuegosArtificales = fuegosArtificales;
    }

    public List<FuegoArtificial> getFuegosArtificales() {
        return fuegosArtificales;
    }

    public void addFuegoArtificial(final FuegoArtificial fuegoArtificial) {
        this.fuegosArtificales.add(fuegoArtificial);
    }

    public void addPack(final PackFuegosArtificales pack) {
        this.fuegosArtificales.addAll(pack.getFuegosArtificales());
    }
}
