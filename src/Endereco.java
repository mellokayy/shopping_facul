import java.util.Scanner;

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.getNomeDaRua();
        this.getCidade();
        this.getEstado();
        this.getPais();
        this.getCep();
        this.getNumero();
        this.getComplemento();
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco [nomeDaRua=" + nomeDaRua + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais
                + ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + "]";
    }

    public void criarEndereco() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da rua: ");
        this.setNomeDaRua(scanner.nextLine());

        System.out.println("Digite o nome da cidade: ");
        this.setCidade(scanner.nextLine());

        System.out.println("Digite o nome do estado: ");
        this.setEstado(scanner.nextLine());

        System.out.println("Digite o nome do pais: ");
        this.setPais(scanner.nextLine());

        System.out.println("Digite seu CEP: ");
        this.setCep(scanner.nextLine());

        System.out.println("Digite o número: ");
        this.setNumero(scanner.nextLine());

        System.out.println("Digite o complemento: ");
        this.setComplemento(scanner.nextLine());

        scanner.close();

    }

}
