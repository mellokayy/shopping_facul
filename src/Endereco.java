import java.util.Scanner;

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero,
            String complemento) {
        this.setNomeDaRua(nomeDaRua);;
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setCep(cep);
        this.setNumero(numero);
        this.setComplemento(complemento);
    }

    public Endereco() {

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

    public void criarEndereco(Scanner scanner) {
        System.out.print("Digite o nome da rua: ");
        // scanner.nextLine();
        this.setNomeDaRua(scanner.nextLine());

        System.out.print("Digite o nome da cidade: ");
        this.setCidade(scanner.nextLine());

        System.out.print("Digite o nome do estado: ");
        this.setEstado(scanner.nextLine());

        System.out.print("Digite o nome do pais: ");
        this.setPais(scanner.nextLine());

        System.out.print("Digite seu CEP: ");
        this.setCep(scanner.nextLine());

        System.out.print("Digite o número: ");
        this.setNumero(scanner.nextLine());

        System.out.print("Digite o complemento: ");
        this.setComplemento(scanner.nextLine());
    }

    public String enderecoCompleto() {
        return (this.getNomeDaRua() + ", " + this.getCidade() + ", " + this.getEstado() + ", " + this.getPais()
                + ", " + this.getCep() + ", " + this.getNumero() + ", " + this.getComplemento());
    }

    @Override
    public String toString() {
        return "Endereco\n nome Da Rua: " + nomeDaRua + "\ncidade: " + cidade + "\nestado: " + estado + "\npais: "
                + pais
                + "\ncep: " + cep + "\nnumero: " + numero + "\ncomplemento: " + complemento;
    }

}
