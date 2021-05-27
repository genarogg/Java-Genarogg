package dibujarcasita;

public class Recta {
    private Punto pInicial;
    private Punto pFinal;

    public Recta() {
    }

    public Recta(Punto pInicial, Punto pFinal) {
        this.pInicial = pInicial;
        this.pFinal = pFinal;
    }

    public Punto getpInicial() {
        return pInicial;
    }

    public void setpInicial(Punto pInicial) {
        this.pInicial = pInicial;
    }

    public Punto getpFinal() {
        return pFinal;
    }

    public void setpFinal(Punto pFinal) {
        this.pFinal = pFinal;
    }
}
