import javax.swing.JOptionPane;
// pacote padrão: java.lang => importado automaticamente
public class SomaDoisNumero {
    public static void main(String [] args){
        // declaração de variáveis
        double primeiroOperando;
        double segundoOperando;
        double resultado;

        // entrada 
        primeiroOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));

        segundoOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));

        // processamento
        resultado = primeiroOperando + segundoOperando;

        // saida 
        JOptionPane.showMessageDialog(null, resultado);
    }
}