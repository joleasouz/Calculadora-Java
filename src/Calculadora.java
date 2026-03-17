import javax.swing.*;
import java.awt.*;

public class Calculadora {
    private JFrame janela;
    private JTextField visorEquacao;
    private JTextField visorAtual;

    public Calculadora(){
        janela = new JFrame();

        //janela
        janela.setSize(350, 450);
        janela.setTitle("Calculadora");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //visores
        JPanel painelVisores = new JPanel(new GridLayout(2,1));

        visorEquacao = new JTextField();
        visorEquacao.setEditable(false);
        visorEquacao.setHorizontalAlignment(JTextField.RIGHT);

        visorAtual = new JTextField("0");
        visorAtual.setEditable(false);
        visorAtual.setHorizontalAlignment(JTextField.RIGHT);
        visorAtual.setFont(new Font("Arial", Font.BOLD, 28));

        //visibilidade
        painelVisores.add(visorEquacao);
        painelVisores.add(visorAtual);

        janela.add(painelVisores, BorderLayout.NORTH);

        janela.setVisible(true);
    }
}
