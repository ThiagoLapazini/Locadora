import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Cliente extends Usuario {
        private Veiculos veiculo;
        private String jadevolveu;
        private Date horarioAluguel;
    public Cliente(String nome, String CPF, String RG) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setRG(RG);
        this.jadevolveu = "N";
    }


    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
        this.horarioAluguel = new Date();
    }

    public String getJadevolveu() {
        return jadevolveu;
    }

    public void setJadevolveu(String jadevolveu) {
        this.jadevolveu = jadevolveu;
    }
    public double calcularValorAluguel() {
        Date horaAtual = new Date();
        long duracao = horaAtual.getTime() - horarioAluguel.getTime();
        long duracaoEmDias = TimeUnit.MILLISECONDS.toDays(duracao);
        double valorDiaria = 0;
        switch (veiculo.getTipo()) {
            case PEQUENO:
                valorDiaria = 100.00;
                break;
            case MEDIO:
                valorDiaria = 150.00;
                break;
            case SUV:
                valorDiaria = 200.00;
                break;
        }
        double valorTotal = valorDiaria * (duracaoEmDias + 1);
        return valorTotal;
    }
}