package uaslp.objetos.escuela;

public class SalaC extends SalaDeJuntas {
    private SalaC(){
        this.nombre="Sala C";
    }
    private static class SalaCHolder{
        static final SalaC INSTANCE= new SalaC();
    }
    public static SalaC getInstance(){
        return SalaC.SalaCHolder.INSTANCE;
    }
}
