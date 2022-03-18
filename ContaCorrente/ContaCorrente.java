package ContaCorrente;

public class ContaCorrente {

    private int Nuconta;
    private String NomeConta;
    private float Saldoconta;

    public ContaCorrente(int initNuconta, String initNomeConta) {
        this.Nuconta = initNuconta;
        this.NomeConta = initNomeConta;
        this.Saldoconta = 0;

    }

    public float SetDeposito(float Deposito) {
        return this.Saldoconta += Deposito;

    }

    public float setSaque(float saque) {
        return this.Saldoconta -= saque;
       
    }

    public int getNuconta() {
        return Nuconta;
    }

    public String getNomeConta() {
        return NomeConta;
    }

    public float getSaldoconta() {
        return Saldoconta;
    }
}
