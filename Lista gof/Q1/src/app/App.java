package app;

public class App {
    public static void main(String[] args) throws Exception {
        Disciplina matematica = new Disciplina();
        Coordenadora o = new Coordenadora();
        Aluno e = new Aluno();
        matematica.attache(o);
        matematica.attache(e);

        matematica.setNota(10);

        matematica.mostrarTudo();
    }
}