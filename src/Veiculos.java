import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculos { //marca, modelo, número de registro, cor e disponibilidade.
    private String nr;
    private String Disponibilidade;
    private String Modelo;
    private String Cor;


    public void setNr(String nr) {
        this.nr = nr;
    }
    public String getNr() {
        return nr;
    }

    public void setDisponibilidade(String disponibilidade) {
        Disponibilidade = disponibilidade;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public static void setVeiculos(List<Veiculos> veiculos) {
        Veiculos.veiculos = veiculos;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getMarca() {
        return Marca;
    }

    public String getCor() {
        return Cor;
    }

    private String Marca;

    private static List<Veiculos> veiculos = new ArrayList<>();

    public static void RegistraVeiculos(Veiculos vc) {
        boolean encontrado = false;
        for (Veiculos v : veiculos) {
            if (vc.getNr().equals(v.getNr())) {
                System.out.println("Veículo já cadastrado!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            veiculos.add(vc);
            System.out.println("Veículo cadastrado com sucesso!");
        }
    }

    public static List<Veiculos> getVeiculos() {
        return veiculos;
    }

    public String getDisponibilidade() {
        return Disponibilidade;
    }


    public String getModelo() {
        return Modelo;
    }


    public static String LerSring() {
        Scanner Teclado = new Scanner(System.in);
        return Teclado.nextLine().trim();
    }

    public static int Lerint() {
        try {
            Scanner Teclado = new Scanner(System.in);
            return Teclado.nextInt();

        } catch (Exception e) {
            System.out.println("Numero invalido!Digite novamente:  ");
            return Lerint();
        }
    }

}