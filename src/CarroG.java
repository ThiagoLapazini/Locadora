public class CarroG extends Veiculos{
    public CarroG() {
        System.out.println("Digite uma cor: ");
        setCor(LerSring());
        System.out.println("Digite a Disponibilidade: ");
        setDisponibilidade(LerSring());
        System.out.println("Digite a Marca: ");
        setMarca(LerSring());
        System.out.println("Digite o Modelo: ");
        setModelo(LerSring());
        System.out.println("Digite o Númeroregistro: ");
        setNr(LerSring());
    }
}