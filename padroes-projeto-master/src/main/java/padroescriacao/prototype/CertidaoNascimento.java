package padroescriacao.prototype;

public class CertidaoNascimento implements Cloneable {
    private String local;
    private Integer matricula;

    public CertidaoNascimento(String local, Integer matricula) {
        super();
        this.local = local;
        this.matricula =matricula;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getNumero() {
        return matricula;
    }

    public void setNumero(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CertidaoNascimento{" +
                "local='" + local + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
