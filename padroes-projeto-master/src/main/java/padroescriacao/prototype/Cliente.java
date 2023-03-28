package padroescriacao.prototype;

public class Cliente implements Cloneable {
    private int matricula;
    private String nome;
    private CertidaoNascimento certidaoNascimento;

    public Cliente(int matricula, String nome, CertidaoNascimento certidaoNascimento ) {
        this.matricula = matricula;
        this.nome = nome;
        this.certidaoNascimento = certidaoNascimento;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CertidaoNascimento getCertidaoNascimento() {
        return certidaoNascimento;
    }

    public void setCertidaoNascimento(CertidaoNascimento certidaoNascimento) {
        this.certidaoNascimento = certidaoNascimento;
    }

    @Override
    public Cliente clone() throws CloneNotSupportedException {
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.certidaoNascimento = (CertidaoNascimento) clienteClone.certidaoNascimento.clone();
        return clienteClone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", certidaoNascimento=" + certidaoNascimento +
                '}';
    }
}
