package uaslp.objetos.escuela;

public class SalaB extends SalaDeJuntas {
    private SalaB(){
        this.nombre="Sala B";
    }
    private static class SalaBHolder{
        static final SalaB INSTANCE= new SalaB();
    }

    public static SalaB getInstance(){
        return SalaB.SalaBHolder.INSTANCE;
    }
}

