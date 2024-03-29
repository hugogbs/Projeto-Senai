package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import core.Game;
import core.Question;

public class MainGame extends JFrame {
	private static MainGame janela;
	public static Game game;
	private JPanel contentPane;
	private static JButton btnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				String texto = "Qual destas pertuba��es dos canais de comunica��o � considerada uma distor��o aleat�ria?";
				String[] alternativas = new String[] { "RETARDO", "HARM�NICA",
						"ATENUA��O", "DIAFONIA", "POLARIZA��O" };
				try {
					// UIManager.setLookAndFeel(new MetalLookAndFeel());
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					setTela(new Login());
					// setTela(new QuestionPanel(1, new Question(texto,
					// alternativas, 3)));

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGame() {

		// addWindowListener(new WindowAdapter() {
		// @Override
		// public void windowClosing(WindowEvent e) {
		// try {
		// Arquivos.salvaHotel(hotel);
		// } catch (Exception e1) {
		// e1.printStackTrace();
		// }
		// }
		// });
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	private static void iniciaSistema() {
		janela = new MainGame();
		janela.setVisible(true);

	}

	public static void setTela(JPanel novaTela) {
		if (janela == null)
			iniciaSistema();

		if (novaTela == null)
			System.err.println("Tela inv�lida");
		if (novaTela instanceof Login)
			System.out.println(novaTela.getBounds());
			janela.setBounds(novaTela.getBounds());

		janela.contentPane.removeAll();
		janela.contentPane.add(novaTela);
		janela.repaint();
		janela.revalidate();

	}

}
