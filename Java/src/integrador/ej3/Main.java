package integrador.ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        final Invitado invitadoMeli = () -> System.out.println("Viva la Chiqui!!");
        final Invitado invitadoStandar = () -> System.out.println("Aplauso!");

        final List<Invitado> invitados = new ArrayList<>();
        invitados.add(invitadoMeli);
        invitados.add(invitadoStandar);
        invitados.add(invitadoMeli);
        invitados.add(invitadoMeli);

        final FuegoArtificial fuego1 = () -> System.out.println("PAM!!");
        final FuegoArtificial fuego2 = () -> System.out.println("PEM!!");
        final FuegoArtificial fuego3 = () -> System.out.println("PIM!!");
        final FuegoArtificial fuego4 = () -> System.out.println("POM!!");
        final FuegoArtificial fuego5 = () -> System.out.println("PUM!!");

        final List<FuegoArtificial> fa1 = new ArrayList<>();
        fa1.add(fuego1);
        fa1.add(fuego3);

        final List<FuegoArtificial> fa2 = new ArrayList<>();
        fa2.add(fuego2);
        fa2.add(fuego4);
        fa2.add(fuego5);

        final PackFuegosArtificales pack1 = new PackFuegosArtificales(fa1);
        final PackFuegosArtificales pack2 = new PackFuegosArtificales(fa2);
        pack1.addFuegoArtificial(fuego2);
        pack1.addPack(pack2);

        List<PackFuegosArtificales> packs = new ArrayList<>();
        packs.add(pack1);
        packs.add(pack2);

        Evento eventoChiqui = new Evento(invitados, packs);
        eventoChiqui.iniciarEvento();
    }

}
