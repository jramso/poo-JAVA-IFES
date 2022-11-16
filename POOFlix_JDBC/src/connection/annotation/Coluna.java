package connection.annotation;

public @interface Coluna {

    public String col();

    public boolean pk() default false;
}
