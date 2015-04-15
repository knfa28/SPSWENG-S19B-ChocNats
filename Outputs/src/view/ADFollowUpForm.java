import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class ADFollowUpForm extends JFrame {

	private JPanel contentPane;
	private int pageNumber;
	private JTextField txtfldPotency;
	private JTextField txtfldAmtPerMonth;
	private JTextField txtfldNumFlares;
	private JTextField txtfldPruritus;
	private JTextField txtfldScorad;
	private JTextField txtfldTreatment;
	private JTextField txtfldRemarks;
	private JTextField txtfldPruritusNum;
	private JTextField txtfldSleepLossNum;
	private JTextField txtfldAreaInvolved;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADFollowUpForm frame = new ADFollowUpForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ADFollowUpForm() {
		pageNumber = 0;
		
		setFont(new Font("Arial", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setTitle("AD - Follow Up Form");
		setResizable(false);
		
		try{
			UIManager.setLookAndFeel(UIManager.getLookAndFeel());

		}catch(Exception e){
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 480);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel formTitleLabel = new JLabel("ATOPIC DERMATITIS");
		formTitleLabel.setFont(new Font("Century Gothic", Font.BOLD, 13));
		GridBagConstraints gbc_formTitleLabel = new GridBagConstraints();
		gbc_formTitleLabel.gridwidth = 15;
		gbc_formTitleLabel.anchor = GridBagConstraints.NORTH;
		gbc_formTitleLabel.insets = new Insets(0, 0, 5, 0);
		gbc_formTitleLabel.gridx = 0;
		gbc_formTitleLabel.gridy = 0;
		contentPane.add(formTitleLabel, gbc_formTitleLabel);
		
		JLabel lblFollowUp = new JLabel("FOLLOW UP FORM");
		lblFollowUp.setFont(new Font("Century Gothic", Font.BOLD, 14));
		GridBagConstraints gbc_lblFollowUp = new GridBagConstraints();
		gbc_lblFollowUp.gridwidth = 9;
		gbc_lblFollowUp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFollowUp.gridx = 5;
		gbc_lblFollowUp.gridy = 1;
		contentPane.add(lblFollowUp, gbc_lblFollowUp);
		
		JLayeredPane layeredPane = new JLayeredPane();
		GridBagConstraints gbc_layeredPane = new GridBagConstraints();
		gbc_layeredPane.gridheight = 10;
		gbc_layeredPane.gridwidth = 14;
		gbc_layeredPane.fill = GridBagConstraints.BOTH;
		gbc_layeredPane.gridx = 1;
		gbc_layeredPane.gridy = 2;
		contentPane.add(layeredPane, gbc_layeredPane);
		
		JPanel page1 = new JPanel();
		layeredPane.setLayer(page1, 4);
		page1.setBackground(SystemColor.inactiveCaptionBorder);
		page1.setBounds(0, 0, 542, 367);
		layeredPane.add(page1);
		page1.setLayout(null);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		JPanel page2 = new JPanel();
		layeredPane.setLayer(page2, 4);
		page2.setBackground(SystemColor.inactiveCaptionBorder);
		page2.setBounds(0, 0, 542, 367);
		layeredPane.add(page2);
		page2.setLayout(null);
		btnNext.setBounds(344, 368, 130, 25);
		layeredPane.add(btnNext);
		
		JButton btnPrevious = new JButton("PREVIOUS");
		
		btnPrevious.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnPrevious.setBounds(84, 368, 130, 25);
		layeredPane.add(btnPrevious);
		
		JLabel lbl = new JLabel("PAGE 1 / 5");
		lbl.setBounds(236, 373, 77, 14);
		layeredPane.add(lbl);
		lbl.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lbl.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JButton btnPage1 = new JButton("1");
		
		JLabel lblPage = new JLabel(" PAGE");
		lblPage.setFont(new Font("Century Gothic", Font.BOLD, 17));
		GridBagConstraints gbc_lblPage = new GridBagConstraints();
		gbc_lblPage.insets = new Insets(0, 0, 5, 5);
		gbc_lblPage.gridx = 0;
		gbc_lblPage.gridy = 2;
		contentPane.add(lblPage, gbc_lblPage);
		GridBagConstraints gbc_btnPage1 = new GridBagConstraints();
		gbc_btnPage1.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage1.gridx = 0;
		gbc_btnPage1.gridy = 3;
		contentPane.add(btnPage1, gbc_btnPage1);
		
		JButton btnPage2 = new JButton("2");
		GridBagConstraints gbc_btnPage2 = new GridBagConstraints();
		gbc_btnPage2.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage2.gridx = 0;
		gbc_btnPage2.gridy = 4;
		contentPane.add(btnPage2, gbc_btnPage2);
		
		ArrayList<JPanel> pages = new ArrayList<JPanel>();
		pages.add(page1);
		
		JLabel lblPatientsName = new JLabel("Topical Steroid Used:");
		lblPatientsName.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPatientsName.setBounds(10, 11, 140, 14);
		page1.add(lblPatientsName);
		
		txtfldPotency = new JTextField();
		txtfldPotency.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldPotency.setBounds(233, 23, 114, 20);
		page1.add(txtfldPotency);
		txtfldPotency.setColumns(10);
		
		JLabel lblPotency = new JLabel("Potency (Brand Name)");
		lblPotency.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPotency.setBounds(41, 26, 200, 14);
		page1.add(lblPotency);
		
		JLabel lblAmountmonth = new JLabel("Amount per Month");
		lblAmountmonth.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAmountmonth.setBounds(41, 49, 200, 14);
		page1.add(lblAmountmonth);
		
		JLabel lblNumberOfFlares = new JLabel("Number of Flares per month");
		lblNumberOfFlares.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNumberOfFlares.setBounds(41, 74, 200, 14);
		page1.add(lblNumberOfFlares);
		
		txtfldAmtPerMonth = new JTextField();
		txtfldAmtPerMonth.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldAmtPerMonth.setColumns(10);
		txtfldAmtPerMonth.setBounds(233, 46, 114, 20);
		page1.add(txtfldAmtPerMonth);
		
		txtfldNumFlares = new JTextField();
		txtfldNumFlares.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldNumFlares.setColumns(10);
		txtfldNumFlares.setBounds(233, 71, 114, 20);
		page1.add(txtfldNumFlares);
		
		JLabel lblBabyPic = new JLabel("");
		lblBabyPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblBabyPic.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblBabyPic.setBounds(10, 115, 280, 187);
		Image img = new ImageIcon(this.getClass().getResource("/baby.png")).getImage(); 
		lblBabyPic.setIcon(new ImageIcon(img));
		page1.add(lblBabyPic);
		
		JLabel lblIntensity = new JLabel("Intensity");
		lblIntensity.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntensity.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblIntensity.setBounds(434, 115, 70, 20);
		page1.add(lblIntensity);
		
		JLabel lblCriteria = new JLabel("Criteria");
		lblCriteria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCriteria.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblCriteria.setBounds(309, 115, 107, 20);
		page1.add(lblCriteria);
		
		JLabel lblErythema = new JLabel("Erythema");
		lblErythema.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblErythema.setBounds(309, 147, 107, 20);
		page1.add(lblErythema);
		
		JLabel lblEdemapapule = new JLabel("Edema/papule");
		lblEdemapapule.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblEdemapapule.setBounds(309, 178, 107, 20);
		page1.add(lblEdemapapule);
		
		JLabel lblScabsoozing = new JLabel("Scabs/oozing");
		lblScabsoozing.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblScabsoozing.setBounds(309, 209, 107, 20);
		page1.add(lblScabsoozing);
		
		JLabel lblExcoriation = new JLabel("Excoriation");
		lblExcoriation.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblExcoriation.setBounds(309, 240, 107, 14);
		page1.add(lblExcoriation);
		
		JLabel lblLichenification = new JLabel("Lichenification");
		lblLichenification.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblLichenification.setBounds(309, 271, 107, 14);
		page1.add(lblLichenification);
		
		JLabel lblSkinDryness = new JLabel("Skin dryness");
		lblSkinDryness.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSkinDryness.setBounds(309, 299, 107, 20);
		page1.add(lblSkinDryness);
		
		JComboBox cmbbxErythema = new JComboBox();
		cmbbxErythema.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cmbbxErythema.setBounds(437, 146, 70, 20);
		page1.add(cmbbxErythema);
		
		JComboBox cmbbxEdema = new JComboBox();
		cmbbxEdema.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cmbbxEdema.setBounds(437, 177, 70, 20);
		page1.add(cmbbxEdema);
		
		JComboBox cmbbxScabs = new JComboBox();
		cmbbxScabs.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cmbbxScabs.setBounds(437, 208, 70, 20);
		page1.add(cmbbxScabs);
		
		JComboBox cmbbxExcoriation = new JComboBox();
		cmbbxExcoriation.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cmbbxExcoriation.setBounds(437, 239, 70, 20);
		page1.add(cmbbxExcoriation);
		
		JComboBox cmbbxLichenification = new JComboBox();
		cmbbxLichenification.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cmbbxLichenification.setBounds(437, 270, 70, 20);
		page1.add(cmbbxLichenification);
		
		JComboBox cmbbxSkinDryness = new JComboBox();
		cmbbxSkinDryness.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		cmbbxSkinDryness.setBounds(437, 301, 70, 20);
		page1.add(cmbbxSkinDryness);
		
		JLabel lblAreaInvolved = new JLabel("Area Involved:");
		lblAreaInvolved.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAreaInvolved.setBounds(10, 313, 95, 20);
		page1.add(lblAreaInvolved);
		
		txtfldAreaInvolved = new JTextField();
		txtfldAreaInvolved.setBounds(107, 315, 107, 20);
		page1.add(txtfldAreaInvolved);
		txtfldAreaInvolved.setColumns(10);
		pages.add(page2);
		
		JLabel lblSubjectiveSymptoms = new JLabel("Subjective Symptoms");
		lblSubjectiveSymptoms.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSubjectiveSymptoms.setBounds(10, 10, 167, 21);
		page2.add(lblSubjectiveSymptoms);
		
		JLabel lblPruritusSleepLoss = new JLabel("Pruritus Sleep Loss");
		lblPruritusSleepLoss.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPruritusSleepLoss.setBounds(20, 37, 157, 21);
		page2.add(lblPruritusSleepLoss);
		
		txtfldPruritus = new JTextField();
		txtfldPruritus.setBounds(154, 42, 111, 21);
		page2.add(txtfldPruritus);
		txtfldPruritus.setColumns(10);
		
		JLabel lblVisualAnalogueScale = new JLabel("Visual Analogue Scale (average for the last 3 days or nights)");
		lblVisualAnalogueScale.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblVisualAnalogueScale.setBounds(10, 69, 439, 21);
		page2.add(lblVisualAnalogueScale);
		
		JLabel lblPruritus = new JLabel("Pruritus");
		lblPruritus.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPruritus.setBounds(20, 101, 72, 21);
		page2.add(lblPruritus);
		
		JSlider sldrPruritus = new JSlider();
		sldrPruritus.setValue(5);
		sldrPruritus.setMaximum(10);
		sldrPruritus.setBounds(100, 101, 206, 26);
		page2.add(sldrPruritus);
		
		JLabel lblSleepLoss = new JLabel("Sleep Loss");
		lblSleepLoss.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSleepLoss.setBounds(20, 138, 72, 21);
		page2.add(lblSleepLoss);
		
		JSlider sldrSleepLoss = new JSlider();
		sldrSleepLoss.setValue(5);
		sldrSleepLoss.setMaximum(10);
		sldrSleepLoss.setBounds(100, 138, 206, 21);
		page2.add(sldrSleepLoss);
		
		JLabel lblScorad = new JLabel("SCORAD:");
		lblScorad.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblScorad.setBounds(20, 194, 72, 21);
		page2.add(lblScorad);
		
		txtfldScorad = new JTextField();
		txtfldScorad.setEditable(false);
		txtfldScorad.setBounds(100, 196, 133, 21);
		page2.add(txtfldScorad);
		txtfldScorad.setColumns(10);
		
		JLabel lblTreatment = new JLabel("Treatment:");
		lblTreatment.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblTreatment.setBounds(20, 226, 72, 21);
		page2.add(lblTreatment);
		
		txtfldTreatment = new JTextField();
		txtfldTreatment.setBounds(100, 228, 133, 19);
		page2.add(txtfldTreatment);
		txtfldTreatment.setColumns(10);
		
		JLabel lblRemarks = new JLabel("Remarks:");
		lblRemarks.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblRemarks.setBounds(20, 258, 72, 21);
		page2.add(lblRemarks);
		
		txtfldRemarks = new JTextField();
		txtfldRemarks.setBounds(100, 258, 133, 21);
		page2.add(txtfldRemarks);
		txtfldRemarks.setColumns(10);
		
		txtfldPruritusNum = new JTextField();
		txtfldPruritusNum.setEditable(false);
		txtfldPruritusNum.setBounds(316, 103, 30, 19);
		page2.add(txtfldPruritusNum);
		txtfldPruritusNum.setColumns(10);
		
		txtfldSleepLossNum = new JTextField();
		txtfldSleepLossNum.setEditable(false);
		txtfldSleepLossNum.setColumns(10);
		txtfldSleepLossNum.setBounds(316, 138, 30, 19);
		page2.add(txtfldSleepLossNum);
		
		ArrayList<JButton> nav = new ArrayList<JButton>();
		nav.add(btnPage1);
		nav.add(btnPage2);
		
		nav.get(0).setEnabled(false);
		lbl.setText("PAGE " + (pageNumber+1) + " / " + pages.size());
		
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.setLayer(pages.get(pageNumber), 0);
				nav.get(pageNumber).setEnabled(true);
				pageNumber--;
				layeredPane.setLayer(pages.get(pageNumber), 100);
				nav.get(pageNumber).setEnabled(false);
				lbl.setText("PAGE " + (pageNumber+1) + " / " + pages.size());
				btnNext.setEnabled(true);
				
				if(pageNumber == 0){
					btnPrevious.setEnabled(false);
				}
			}
		});

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.setLayer(pages.get(pageNumber), 0);
				nav.get(pageNumber).setEnabled(true);
				pageNumber++;
				layeredPane.setLayer(pages.get(pageNumber), 100);
				nav.get(pageNumber).setEnabled(false);
				lbl.setText("PAGE " + (pageNumber+1) + " / " + pages.size());
				btnPrevious.setEnabled(true);
				
				if(pageNumber+1 == pages.size()){
					btnNext.setEnabled(false);
				}
			}
		});
		
		btnPage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
	}
}
