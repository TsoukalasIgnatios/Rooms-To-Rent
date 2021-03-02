
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Show extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollPane = null;
	private JTable jTable = null;
	private JButton jButtonBack = null;
	private TableTest[] pinList = null;
	private JFrame par = null;
	private Client[] client = null;
	/**
	 * This is the default constructor
	 */
	public Show(Client[] client) {
		super();
		this.client = client;
		initialize();
	}


	public Show(TableTest[] matrix, Search search) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(465, 280);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJButtonBack(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(15, 5, 250, 145));
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			
			//We need to create a two - dimension array
			// holding a row into dimention one and columns in dimension two
			String [][] tbl = new String[pinList.length][2];
			
			for (int i = 0; i < pinList.length; i++) {
				tbl[i][0] = pinList[i].getName();
				tbl[i][1] = pinList[i].getSurname();
				
			}
		
			String[] stiles = new String[2];
			stiles[0]="NAME";
			stiles[1]="SURNAME";
			                             
			jTable = new JTable(tbl,stiles);
		}
		return jTable;
	}

	/**
	 * This method initializes jButtonBack	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBack() {
		if (jButtonBack == null) {
			jButtonBack = new JButton();
			jButtonBack.setBounds(new Rectangle(300, 200, 95, 30));
			jButtonBack.setText("BACK");
			jButtonBack.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					//this action listener sets this frmae invisible and the 
					// parent search fram visible
					setVisible(false);
					par.setVisible(true);
				}
			});
		}
		return jButtonBack;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
