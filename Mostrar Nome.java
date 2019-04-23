import javax.swing.JOptionPane;
class mostrar_Nome
{
public static void main(String[] arga)
    {
 	String nome_pessoa;
 	nome_pessoa=(JOptionPane.showInputDialog(null,"Entre com um nome:"));
 	JOptionPane.showMessageDialog(null,"seu nome é: "+"\n\n\n"+nome_pessoa);
 	}
} 	