public class Cliente extends Usuario{

    public Veiculos getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }
    private String jadevolveu;
    public String getJadevolveu() {
        return jadevolveu;
    }

    public void setJadevolveu(String jadevolveu) {
        this.jadevolveu = jadevolveu;
    }

    private Veiculos veiculo;
    public Cliente(String nome,String cpf, String rg) {
        setNome(nome);
        setCPF(cpf);
        setRG(rg);
    }
}