package integrador.ej3;

import java.util.List;

public class Evento {

    private final List<Invitado> invitados;
    private final List<PackFuegosArtificales> fuegosArtificiales;

    public Evento(List<Invitado> invitados, List<PackFuegosArtificales> fuegosArtificiales) {
        this.invitados = invitados;
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public List<Invitado> getInvitados() {
        return invitados;
    }

    public List<PackFuegosArtificales> getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void iniciarEvento() {
        System.out.println("**** Show de fuegos artificiales ****");
        System.out.println("");
        for (PackFuegosArtificales pack : fuegosArtificiales) {
            for (FuegoArtificial fuegoArtificial : pack.getFuegosArtificales()) {
                fuegoArtificial.explotar();
            }
        }
        System.out.println("");
        System.out.println("**** Se reparten las porciones de torta ****");
        System.out.println("");
        for (Invitado invitado : invitados) {
            invitado.festejar();
        }
    }

}
