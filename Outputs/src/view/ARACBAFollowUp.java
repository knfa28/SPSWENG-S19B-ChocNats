import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class ARACBAFollowUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtDateOfConsult;
	private JTextField textLastSeenOn;
	private JTextField txtWorkingImpression;
	private JTextField txtCurrentMedications;
	private JTextField txtRash;
	private JTextField txtOthers;
	private JTextField textField;
	private JTextField txtTriggers;
	private JTextField txtLatestLaboratoryResults;
	private JTextField txtHT;
	private JTextField txtWT;
	private JTextField txtHR;
	private JTextField txtBP;
	private JTextField txtRR;
	private JTextField txtPEFR;
	private int pageNumber;
	private JTextField txtOthers_1;
	private JTextField txtApex;
	private JTextField txtPMI;
	private JTextField txtEpidermalDetachment;
	private JTextField txtDiagnostics;
	private JTextField txtMedications;
	private JTextField txtAllergen1;
	private JTextField txtAllergen2;
	private JTextField txtAllergen3;
	private JTextField txtConcentration3;
	private JTextField txtConcentration2;
	private JTextField txtConcentration1;
	private JTextField txtVolume1;
	private JTextField txtVolume2;
	private JTextField txtVolume3;
	private JTextField txtAllergen4;
	private JTextField txtConcentration4;
	private JTextField txtVolume4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ARACBAFollowUp frame = new ARACBAFollowUp();
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
	public ARACBAFollowUp() {
		pageNumber = 0;
		
		setFont(new Font("Franklin Gothic Book", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setTitle("AR / RC / BA - Follow Up Form");
		setResizable(false);
		
		try{
			UIManager.setLookAndFeel(UIManager.getLookAndFeel());

		}catch(Exception e){
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 515);
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
		
		JLabel formTitleLabel = new JLabel("ALLERGIC RHINITIS / RHINOCONJUNCTIVITIS / BRONCHIAL ASTHMA");
		formTitleLabel.setFont(new Font("Franklin Gothic Book Black", Font.BOLD, 13));
		GridBagConstraints gbc_formTitleLabel = new GridBagConstraints();
		gbc_formTitleLabel.gridwidth = 15;
		gbc_formTitleLabel.anchor = GridBagConstraints.NORTH;
		gbc_formTitleLabel.insets = new Insets(0, 0, 5, 0);
		gbc_formTitleLabel.gridx = 0;
		gbc_formTitleLabel.gridy = 0;
		contentPane.add(formTitleLabel, gbc_formTitleLabel);
		
		JLabel lblFollowUp = new JLabel("FOLLOW UP FORM");
		lblFollowUp.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
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
		layeredPane.setLayer(page1, 5);
		page1.setBackground(SystemColor.inactiveCaptionBorder);
		page1.setBounds(24, 0, 542, 367);
		layeredPane.add(page1);
		page1.setLayout(null);
		
		JLabel lblDateOfConsult = new JLabel("Date of consult:");
		lblDateOfConsult.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblDateOfConsult.setBounds(10, 11, 131, 23);
		page1.add(lblDateOfConsult);
		
		txtDateOfConsult = new JTextField();
		txtDateOfConsult.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		txtDateOfConsult.setBounds(119, 13, 155, 20);
		page1.add(txtDateOfConsult);
		txtDateOfConsult.setColumns(10);
		
		JLabel lblLastSeenOn = new JLabel("Last seen on:");
		lblLastSeenOn.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblLastSeenOn.setBounds(286, 15, 92, 14);
		page1.add(lblLastSeenOn);
		
		textLastSeenOn = new JTextField();
		textLastSeenOn.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		textLastSeenOn.setBounds(378, 13, 154, 20);
		page1.add(textLastSeenOn);
		textLastSeenOn.setColumns(10);
		
		JLabel lblLastWorkingImpression = new JLabel("Last working impression:");
		lblLastWorkingImpression.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblLastWorkingImpression.setBounds(10, 31, 177, 23);
		page1.add(lblLastWorkingImpression);
		
		txtWorkingImpression = new JTextField();
		txtWorkingImpression.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		txtWorkingImpression.setBounds(10, 55, 522, 67);
		page1.add(txtWorkingImpression);
		txtWorkingImpression.setColumns(10);
		
		JLabel lblCurrentMedications = new JLabel("Current medications:");
		lblCurrentMedications.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblCurrentMedications.setBounds(10, 126, 136, 14);
		page1.add(lblCurrentMedications);
		
		txtCurrentMedications = new JTextField();
		txtCurrentMedications.setBounds(10, 143, 522, 67);
		page1.add(txtCurrentMedications);
		txtCurrentMedications.setColumns(10);
		
		JLabel lblReviewOfSymptoms = new JLabel("Review of symptoms:");
		lblReviewOfSymptoms.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblReviewOfSymptoms.setBounds(10, 210, 154, 23);
		page1.add(lblReviewOfSymptoms);
		
		JCheckBox chckbxSneezing = new JCheckBox("sneezing");
		chckbxSneezing.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxSneezing.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxSneezing.setBounds(10, 234, 81, 23);
		page1.add(chckbxSneezing);
		
		JCheckBox chckbxCough = new JCheckBox("cough");
		chckbxCough.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCough.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCough.setBounds(93, 234, 71, 23);
		page1.add(chckbxCough);
		
		JCheckBox chckbxFever = new JCheckBox("fever");
		chckbxFever.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxFever.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxFever.setBounds(166, 234, 62, 23);
		page1.add(chckbxFever);
		
		JCheckBox chckbxRhinorrhea = new JCheckBox("rhinorrhea");
		chckbxRhinorrhea.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxRhinorrhea.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxRhinorrhea.setBounds(230, 234, 92, 23);
		page1.add(chckbxRhinorrhea);
		
		JCheckBox chckbxTearing = new JCheckBox("tearing");
		chckbxTearing.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxTearing.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxTearing.setBounds(407, 234, 71, 23);
		page1.add(chckbxTearing);
		
		JCheckBox chckbxDyspnea = new JCheckBox("dyspnea");
		chckbxDyspnea.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxDyspnea.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxDyspnea.setBounds(324, 234, 81, 23);
		page1.add(chckbxDyspnea);
		
		JCheckBox chckbxCongestion = new JCheckBox("congestion");
		chckbxCongestion.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCongestion.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCongestion.setBounds(10, 260, 97, 23);
		page1.add(chckbxCongestion);
		
		JCheckBox chckbxWheals = new JCheckBox("wheals");
		chckbxWheals.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxWheals.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxWheals.setBounds(103, 260, 71, 23);
		page1.add(chckbxWheals);
		
		JCheckBox chckbxThroatClearing = new JCheckBox("throat clearing");
		chckbxThroatClearing.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxThroatClearing.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxThroatClearing.setBounds(176, 260, 121, 23);
		page1.add(chckbxThroatClearing);
		
		JCheckBox chckbxPostNasalDrip = new JCheckBox("post nasal drip");
		chckbxPostNasalDrip.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPostNasalDrip.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPostNasalDrip.setBounds(299, 260, 121, 23);
		page1.add(chckbxPostNasalDrip);
		
		JCheckBox chckbxPruritus = new JCheckBox("pruritus");
		chckbxPruritus.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPruritus.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPruritus.setBounds(417, 260, 71, 23);
		page1.add(chckbxPruritus);
		
		JCheckBox chckbxRash = new JCheckBox("rash");
		chckbxRash.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxRash.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxRash.setBounds(10, 284, 51, 23);
		page1.add(chckbxRash);
		
		JCheckBox chckbxOthers = new JCheckBox("others");
		chckbxOthers.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxOthers.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxOthers.setBounds(203, 284, 71, 23);
		page1.add(chckbxOthers);
		
		txtRash = new JTextField();
		txtRash.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtRash.setBounds(67, 284, 130, 20);
		page1.add(txtRash);
		txtRash.setColumns(10);
		
		txtOthers = new JTextField();
		txtOthers.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtOthers.setColumns(10);
		txtOthers.setBounds(275, 284, 130, 20);
		page1.add(txtOthers);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		btnNext.setBounds(368, 368, 198, 25);
		btnNext.setContentAreaFilled(false);
		btnNext.setOpaque(true);
		btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		layeredPane.add(btnNext);
		
		JPanel page2 = new JPanel();
		layeredPane.setLayer(page2, 4);
		page2.setBackground(SystemColor.inactiveCaptionBorder);
		page2.setBounds(24, 0, 542, 367);
		layeredPane.add(page2);
		page2.setLayout(null);
		
		JLabel lblSeverityScale = new JLabel("Severity scale");
		lblSeverityScale.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblSeverityScale.setBounds(10, 11, 100, 17);
		page2.add(lblSeverityScale);
		
		JLabel lblAllergicRhinitis = new JLabel("Allergic Rhinitis");
		lblAllergicRhinitis.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblAllergicRhinitis.setBounds(40, 28, 105, 22);
		page2.add(lblAllergicRhinitis);
		
		JRadioButton rdbtnIntermittentMild = new JRadioButton("intermittent mild");
		rdbtnIntermittentMild.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		rdbtnIntermittentMild.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnIntermittentMild.setBounds(151, 27, 138, 23);
		page2.add(rdbtnIntermittentMild);
		
		JRadioButton rdbtnIntermittentModerateTo = new JRadioButton("intermittent moderate to severe");
		rdbtnIntermittentModerateTo.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		rdbtnIntermittentModerateTo.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnIntermittentModerateTo.setBounds(291, 27, 245, 23);
		page2.add(rdbtnIntermittentModerateTo);
		
		JRadioButton rdbtnPersistentMild = new JRadioButton("persistent mild");
		rdbtnPersistentMild.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		rdbtnPersistentMild.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnPersistentMild.setBounds(151, 45, 138, 23);
		page2.add(rdbtnPersistentMild);
		
		JRadioButton rdbtnPersistentModerateTo = new JRadioButton("persistent moderate to severe");
		rdbtnPersistentModerateTo.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		rdbtnPersistentModerateTo.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnPersistentModerateTo.setBounds(291, 45, 245, 23);
		page2.add(rdbtnPersistentModerateTo);
		
		JLabel lblBronchialAsthma = new JLabel("Bronchial Asthma");
		lblBronchialAsthma.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblBronchialAsthma.setBounds(32, 71, 123, 22);
		page2.add(lblBronchialAsthma);
		
		JRadioButton rdbtnPartlyControlled = new JRadioButton("partly controlled");
		rdbtnPartlyControlled.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		rdbtnPartlyControlled.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnPartlyControlled.setBounds(243, 71, 131, 23);
		page2.add(rdbtnPartlyControlled);
		
		JRadioButton rdbtnControlled = new JRadioButton("controlled");
		rdbtnControlled.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		rdbtnControlled.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnControlled.setBounds(151, 71, 100, 23);
		page2.add(rdbtnControlled);
		
		JRadioButton rdbtnUncontrolled = new JRadioButton("uncontrolled");
		rdbtnUncontrolled.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		rdbtnUncontrolled.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnUncontrolled.setBounds(376, 71, 138, 23);
		page2.add(rdbtnUncontrolled);
		
		JLabel lblOthers = new JLabel("Others");
		lblOthers.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblOthers.setBounds(106, 93, 47, 22);
		page2.add(lblOthers);
		
		textField = new JTextField();
		textField.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		textField.setBounds(161, 101, 235, 20);
		page2.add(textField);
		textField.setColumns(10);
		
		JSpinner spinnerMonth = new JSpinner();
		spinnerMonth.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		spinnerMonth.setBounds(243, 125, 35, 20);
		page2.add(spinnerMonth);
		
		JLabel lblMonth = new JLabel("x/month");
		lblMonth.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		lblMonth.setBounds(286, 128, 63, 14);
		page2.add(lblMonth);
		
		JSpinner spinnerWk = new JSpinner();
		spinnerWk.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		spinnerWk.setBounds(162, 125, 35, 20);
		page2.add(spinnerWk);
		
		JLabel lblWk = new JLabel("x/wk");
		lblWk.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		lblWk.setBounds(205, 128, 46, 14);
		page2.add(lblWk);
		
		JSpinner spinnerYr = new JSpinner();
		spinnerYr.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		spinnerYr.setBounds(345, 125, 35, 20);
		page2.add(spinnerYr);
		
		JLabel lblYr = new JLabel("x/yr");
		lblYr.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		lblYr.setBounds(390, 128, 46, 14);
		page2.add(lblYr);
		
		JLabel lblTriggers = new JLabel("Triggers");
		lblTriggers.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblTriggers.setBounds(10, 151, 63, 22);
		page2.add(lblTriggers);
		
		txtTriggers = new JTextField();
		txtTriggers.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtTriggers.setColumns(10);
		txtTriggers.setBounds(68, 152, 452, 50);
		page2.add(txtTriggers);
		
		JLabel lblReactionToLast = new JLabel("Reaction to last xIT shot");
		lblReactionToLast.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblReactionToLast.setBounds(10, 202, 158, 22);
		page2.add(lblReactionToLast);
		
		JCheckBox chckbxLocal = new JCheckBox("local");
		chckbxLocal.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxLocal.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxLocal.setBounds(54, 223, 63, 23);
		page2.add(chckbxLocal);
		
		JCheckBox chckbxSystemic = new JCheckBox("systemic");
		chckbxSystemic.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxSystemic.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxSystemic.setBounds(118, 223, 79, 23);
		page2.add(chckbxSystemic);
		
		JCheckBox checkBox = new JCheckBox("local");
		checkBox.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox.setBounds(218, 223, 63, 23);
		page2.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("systemic");
		checkBox_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_1.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_1.setBounds(282, 223, 79, 23);
		page2.add(checkBox_1);
		
		JCheckBox chckbxIntervention = new JCheckBox("intervention");
		chckbxIntervention.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxIntervention.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxIntervention.setBounds(390, 223, 113, 23);
		page2.add(chckbxIntervention);
		
		JLabel lblLatestLaboratory = new JLabel("Latest laboratory results");
		lblLatestLaboratory.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblLatestLaboratory.setBounds(10, 253, 158, 22);
		page2.add(lblLatestLaboratory);
		
		txtLatestLaboratoryResults = new JTextField();
		txtLatestLaboratoryResults.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtLatestLaboratoryResults.setColumns(10);
		txtLatestLaboratoryResults.setBounds(171, 254, 349, 50);
		page2.add(txtLatestLaboratoryResults);
		
		JLabel lblHt = new JLabel("HT");
		lblHt.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblHt.setBounds(93, 308, 35, 22);
		page2.add(lblHt);
		
		txtHT = new JTextField();
		txtHT.setBounds(115, 311, 47, 20);
		page2.add(txtHT);
		txtHT.setColumns(10);
		
		txtWT = new JTextField();
		txtWT.setColumns(10);
		txtWT.setBounds(191, 310, 47, 20);
		page2.add(txtWT);
		
		JLabel lblWt = new JLabel("WT");
		lblWt.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblWt.setBounds(169, 307, 35, 22);
		page2.add(lblWt);
		
		JLabel lblHr = new JLabel("HR");
		lblHr.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblHr.setBounds(320, 308, 35, 22);
		page2.add(lblHr);
		
		txtHR = new JTextField();
		txtHR.setColumns(10);
		txtHR.setBounds(342, 311, 47, 20);
		page2.add(txtHR);
		
		txtBP = new JTextField();
		txtBP.setColumns(10);
		txtBP.setBounds(266, 312, 47, 20);
		page2.add(txtBP);
		
		JLabel lblBp = new JLabel("BP");
		lblBp.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblBp.setBounds(244, 309, 35, 22);
		page2.add(lblBp);
		
		txtRR = new JTextField();
		txtRR.setColumns(10);
		txtRR.setBounds(421, 310, 47, 20);
		page2.add(txtRR);
		
		JLabel lblRr = new JLabel("RR");
		lblRr.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblRr.setBounds(399, 307, 35, 22);
		page2.add(lblRr);
		
		JLabel lblPefr = new JLabel("PEFR");
		lblPefr.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		lblPefr.setBounds(161, 334, 35, 22);
		page2.add(lblPefr);
		
		txtPEFR = new JTextField();
		txtPEFR.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtPEFR.setColumns(10);
		txtPEFR.setBounds(191, 337, 235, 20);
		page2.add(txtPEFR);
		
		JPanel page3 = new JPanel();
		page3.setBackground(SystemColor.inactiveCaptionBorder);
		layeredPane.setLayer(page3, 3);
		page3.setBounds(24, 0, 542, 367);
		layeredPane.add(page3);
		page3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("General");
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 60, 17);
		page3.add(lblNewLabel);
		
		JCheckBox chckbxNormal = new JCheckBox("normal");
		chckbxNormal.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal.setBounds(69, 11, 73, 17);
		page3.add(chckbxNormal);
		
		JCheckBox chckbxMouthBreathing = new JCheckBox("mouth breathing");
		chckbxMouthBreathing.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMouthBreathing.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMouthBreathing.setBounds(144, 11, 135, 17);
		page3.add(chckbxMouthBreathing);
		
		JCheckBox chckbxSpeaksInSentences = new JCheckBox("speaks in sentences");
		chckbxSpeaksInSentences.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxSpeaksInSentences.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxSpeaksInSentences.setBounds(68, 31, 151, 17);
		page3.add(chckbxSpeaksInSentences);
		
		JCheckBox chckbxNasalTwang = new JCheckBox("nasal twang");
		chckbxNasalTwang.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNasalTwang.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNasalTwang.setBounds(281, 11, 107, 17);
		page3.add(chckbxNasalTwang);
		
		JCheckBox chckbxPhrases = new JCheckBox("phrases");
		chckbxPhrases.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPhrases.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPhrases.setBounds(217, 31, 73, 17);
		page3.add(chckbxPhrases);
		
		JCheckBox chckbxWords = new JCheckBox("words");
		chckbxWords.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxWords.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxWords.setBounds(292, 31, 65, 17);
		page3.add(chckbxWords);
		
		JCheckBox checkBox_2 = new JCheckBox("words");
		checkBox_2.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_2.setBounds(441, 51, 65, 17);
		page3.add(checkBox_2);
		
		JCheckBox chckbxOrientedTo = new JCheckBox("oriented to 3 spheres ");
		chckbxOrientedTo.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxOrientedTo.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxOrientedTo.setBounds(276, 51, 163, 17);
		page3.add(chckbxOrientedTo);
		
		JCheckBox chckbxImminentRespiratoryDistress = new JCheckBox("imminent respiratory distress");
		chckbxImminentRespiratoryDistress.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxImminentRespiratoryDistress.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxImminentRespiratoryDistress.setBounds(69, 51, 205, 17);
		page3.add(chckbxImminentRespiratoryDistress);
		
		JLabel lblHairScalp = new JLabel("Hair / Scalp");
		lblHairScalp.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		lblHairScalp.setBounds(10, 78, 79, 17);
		page3.add(lblHairScalp);
		
		JCheckBox chckbxAlopecia = new JCheckBox("Alopecia");
		chckbxAlopecia.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxAlopecia.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxAlopecia.setBounds(95, 78, 88, 17);
		page3.add(chckbxAlopecia);
		
		JCheckBox chckbxCradleCap = new JCheckBox("cradle cap");
		chckbxCradleCap.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCradleCap.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCradleCap.setBounds(181, 78, 97, 17);
		page3.add(chckbxCradleCap);
		
		JCheckBox chckbxScaling = new JCheckBox("scaling");
		chckbxScaling.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxScaling.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxScaling.setBounds(281, 78, 76, 17);
		page3.add(chckbxScaling);
		
		JCheckBox checkBox_3 = new JCheckBox("scaling");
		checkBox_3.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_3.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_3.setBounds(359, 78, 76, 17);
		page3.add(checkBox_3);
		
		JLabel lblHeadFace = new JLabel("Head / Face");
		lblHeadFace.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblHeadFace.setBounds(10, 102, 88, 17);
		page3.add(lblHeadFace);
		
		JCheckBox chckbxNormal1 = new JCheckBox("normal");
		chckbxNormal1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal1.setBounds(100, 104, 73, 17);
		page3.add(chckbxNormal1);
		
		JCheckBox chckbxHeadlightSign = new JCheckBox("headlight sign ");
		chckbxHeadlightSign.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHeadlightSign.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHeadlightSign.setBounds(99, 124, 120, 17);
		page3.add(chckbxHeadlightSign);
		
		JCheckBox chckbxFacialTenderness = new JCheckBox("facial tenderness");
		chckbxFacialTenderness.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxFacialTenderness.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxFacialTenderness.setBounds(175, 104, 135, 17);
		page3.add(chckbxFacialTenderness);
		
		JCheckBox chckbxFacialErythema = new JCheckBox("facial erythema ");
		chckbxFacialErythema.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxFacialErythema.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxFacialErythema.setBounds(312, 104, 131, 17);
		page3.add(chckbxFacialErythema);
		
		JCheckBox chckbxDiscoidRash = new JCheckBox("discoid rash");
		chckbxDiscoidRash.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxDiscoidRash.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxDiscoidRash.setBounds(312, 124, 107, 17);
		page3.add(chckbxDiscoidRash);
		
		JCheckBox chckbxMalarRash = new JCheckBox("malar rash");
		chckbxMalarRash.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMalarRash.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMalarRash.setBounds(217, 124, 93, 17);
		page3.add(chckbxMalarRash);
		
		JCheckBox chckbxPallor = new JCheckBox("pallor");
		chckbxPallor.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPallor.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPallor.setBounds(441, 104, 65, 17);
		page3.add(chckbxPallor);
		
		JPanel page4 = new JPanel();
		page4.setBackground(SystemColor.inactiveCaptionBorder);
		layeredPane.setLayer(page4, 2,000);
		page4.setBounds(24, 0, 542, 367);
		layeredPane.add(page4);
		page4.setLayout(null);
		
		JLabel lblDischarge = new JLabel("Discharge");
		lblDischarge.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblDischarge.setBounds(99, 11, 95, 17);
		page4.add(lblDischarge);
		
		JCheckBox chckbxClearWatery = new JCheckBox("clear, watery");
		chckbxClearWatery.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxClearWatery.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxClearWatery.setBounds(173, 11, 109, 17);
		page4.add(chckbxClearWatery);
		
		JCheckBox chckbxMucoid = new JCheckBox("mucoid");
		chckbxMucoid.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMucoid.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMucoid.setBounds(284, 11, 82, 17);
		page4.add(chckbxMucoid);
		
		JCheckBox chckbxPurulent = new JCheckBox("purulent");
		chckbxPurulent.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPurulent.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPurulent.setBounds(368, 11, 88, 17);
		page4.add(chckbxPurulent);
		
		JCheckBox chckbxBloody = new JCheckBox("bloody");
		chckbxBloody.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxBloody.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxBloody.setBounds(458, 11, 78, 17);
		page4.add(chckbxBloody);
		
		JLabel lblNosecont = new JLabel("Nose (cont.)");
		lblNosecont.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblNosecont.setBounds(10, 11, 88, 17);
		page4.add(lblNosecont);
		
		JLabel lblNasalPolyps = new JLabel("Nasal polyps");
		lblNasalPolyps.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblNasalPolyps.setBounds(99, 30, 95, 17);
		page4.add(lblNasalPolyps);
		
		JCheckBox chckbxNone = new JCheckBox("none");
		chckbxNone.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNone.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNone.setBounds(194, 30, 59, 17);
		page4.add(chckbxNone);
		
		JCheckBox chckbxL = new JCheckBox("L");
		chckbxL.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxL.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxL.setBounds(255, 30, 40, 17);
		page4.add(chckbxL);
		
		JCheckBox chckbxR = new JCheckBox("R");
		chckbxR.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxR.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxR.setBounds(294, 30, 88, 17);
		page4.add(chckbxR);
		
		JLabel lblOralCavity = new JLabel("Oral cavity");
		lblOralCavity.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblOralCavity.setBounds(10, 51, 88, 17);
		page4.add(lblOralCavity);
		
		JCheckBox chckbxNormal_1 = new JCheckBox("normal");
		chckbxNormal_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal_1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal_1.setBounds(88, 51, 71, 17);
		page4.add(chckbxNormal_1);
		
		JCheckBox chckbxLipAngioedema = new JCheckBox("lip angioedema ");
		chckbxLipAngioedema.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxLipAngioedema.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxLipAngioedema.setBounds(162, 51, 133, 17);
		page4.add(chckbxLipAngioedema);
		
		JCheckBox chckbxCheilitis = new JCheckBox("cheilitis");
		chckbxCheilitis.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCheilitis.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCheilitis.setBounds(291, 51, 71, 17);
		page4.add(chckbxCheilitis);
		
		JCheckBox chckbxThrush = new JCheckBox("thrush");
		chckbxThrush.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxThrush.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxThrush.setBounds(364, 51, 63, 17);
		page4.add(chckbxThrush);
		
		JCheckBox chckbxOralUlcers = new JCheckBox("oral ulcers ");
		chckbxOralUlcers.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxOralUlcers.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxOralUlcers.setBounds(429, 51, 107, 17);
		page4.add(chckbxOralUlcers);
		
		JCheckBox chckbxHighArchedPalate = new JCheckBox("High arched palate");
		chckbxHighArchedPalate.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHighArchedPalate.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHighArchedPalate.setBounds(88, 69, 151, 17);
		page4.add(chckbxHighArchedPalate);
		
		JCheckBox chckbxMalocclusion = new JCheckBox("malocclusion");
		chckbxMalocclusion.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMalocclusion.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMalocclusion.setBounds(241, 69, 116, 17);
		page4.add(chckbxMalocclusion);
		
		JCheckBox chckbxHalitosis = new JCheckBox("halitosis");
		chckbxHalitosis.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHalitosis.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHalitosis.setBounds(356, 69, 82, 17);
		page4.add(chckbxHalitosis);
		
		JLabel lblThroat = new JLabel("Throat");
		lblThroat.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblThroat.setBounds(10, 89, 88, 17);
		page4.add(lblThroat);
		
		JCheckBox chckbxNormal_3 = new JCheckBox("normal");
		chckbxNormal_3.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal_3.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal_3.setBounds(111, 147, 71, 17);
		page4.add(chckbxNormal_3);
		
		JCheckBox chckbxCobblestoning_1 = new JCheckBox("Cobblestoning");
		chckbxCobblestoning_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCobblestoning_1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCobblestoning_1.setBounds(61, 89, 121, 17);
		page4.add(chckbxCobblestoning_1);
		
		JCheckBox chckbxHyperemia = new JCheckBox("hyperemia");
		chckbxHyperemia.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHyperemia.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHyperemia.setBounds(182, 89, 93, 17);
		page4.add(chckbxHyperemia);
		
		JCheckBox chckbxTonsillarHypertrophy = new JCheckBox("tonsillar hypertrophy ");
		chckbxTonsillarHypertrophy.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxTonsillarHypertrophy.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxTonsillarHypertrophy.setBounds(275, 89, 158, 17);
		page4.add(chckbxTonsillarHypertrophy);
		
		JCheckBox chckbxExudates = new JCheckBox("exudates");
		chckbxExudates.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxExudates.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxExudates.setBounds(61, 107, 85, 17);
		page4.add(chckbxExudates);
		
		JCheckBox chckbxPostnasalDrip = new JCheckBox("post-nasal drip");
		chckbxPostnasalDrip.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPostnasalDrip.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPostnasalDrip.setBounds(148, 106, 127, 17);
		page4.add(chckbxPostnasalDrip);
		
		JLabel lblNeck = new JLabel("Neck, thyroid");
		lblNeck.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblNeck.setBounds(10, 127, 101, 17);
		page4.add(lblNeck);
		
		JCheckBox chckbxNormal_2 = new JCheckBox("normal");
		chckbxNormal_2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal_2.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal_2.setBounds(111, 127, 71, 17);
		page4.add(chckbxNormal_2);
		
		JCheckBox chckbxThyromegaly = new JCheckBox("thyromegaly");
		chckbxThyromegaly.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxThyromegaly.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxThyromegaly.setBounds(185, 126, 133, 17);
		page4.add(chckbxThyromegaly);
		
		JLabel lblLymphNodes = new JLabel("Lymph Nodes");
		lblLymphNodes.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblLymphNodes.setBounds(10, 148, 101, 17);
		page4.add(lblLymphNodes);
		
		JCheckBox chckbxEnlarged = new JCheckBox("enlarged");
		chckbxEnlarged.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxEnlarged.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxEnlarged.setBounds(185, 146, 133, 17);
		page4.add(chckbxEnlarged);
		
		JCheckBox chckbxPreauricular = new JCheckBox("preauricular");
		chckbxPreauricular.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPreauricular.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPreauricular.setBounds(370, 167, 107, 17);
		page4.add(chckbxPreauricular);
		
		JCheckBox chckbxCervical = new JCheckBox("cervical");
		chckbxCervical.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCervical.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCervical.setBounds(297, 167, 85, 17);
		page4.add(chckbxCervical);
		
		JCheckBox chckbxSupraclavicular = new JCheckBox("supraclavicular");
		chckbxSupraclavicular.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxSupraclavicular.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxSupraclavicular.setBounds(209, 167, 133, 17);
		page4.add(chckbxSupraclavicular);
		
		JCheckBox chckbxSubmandibula = new JCheckBox("Submandibula");
		chckbxSubmandibula.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxSubmandibula.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxSubmandibula.setBounds(94, 167, 145, 17);
		page4.add(chckbxSubmandibula);
		
		JLabel lblOthers_1 = new JLabel("others");
		lblOthers_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblOthers_1.setBounds(99, 184, 49, 17);
		page4.add(lblOthers_1);
		
		txtOthers_1 = new JTextField();
		txtOthers_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtOthers_1.setBounds(148, 184, 127, 20);
		page4.add(txtOthers_1);
		txtOthers_1.setColumns(10);
		
		JLabel lblChestAndLungs = new JLabel("Chest and Lungs");
		lblChestAndLungs.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblChestAndLungs.setBounds(10, 206, 127, 17);
		page4.add(lblChestAndLungs);
		
		JLabel lblChestWall = new JLabel("Chest wall");
		lblChestWall.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblChestWall.setBounds(137, 208, 63, 17);
		page4.add(lblChestWall);
		
		JLabel lblBreathSounds = new JLabel("Breath sounds");
		lblBreathSounds.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblBreathSounds.setBounds(36, 234, 114, 17);
		page4.add(lblBreathSounds);
		
		JLabel lblAdventitiousSounds = new JLabel("Adventitious sounds");
		lblAdventitiousSounds.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblAdventitiousSounds.setBounds(268, 234, 136, 17);
		page4.add(lblAdventitiousSounds);
		
		JLabel lblFremiti = new JLabel("Fremiti");
		lblFremiti.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblFremiti.setBounds(344, 206, 49, 17);
		page4.add(lblFremiti);
		
		JComboBox comboBoxChestWall = new JComboBox(new String[]{"N", "AbN", "Accessory muscle use"});
		comboBoxChestWall.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxChestWall.setBounds(203, 206, 131, 20);
		page4.add(comboBoxChestWall);
		
		JComboBox comboBoxChestAndLungs = new JComboBox(new String[]{"normal", "decreased", "hyperresonant"});
		comboBoxChestAndLungs.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxChestAndLungs.setBounds(135, 232, 131, 20);
		page4.add(comboBoxChestAndLungs);
		
		JComboBox comboBoxFremiti = new JComboBox(new String[]{"normal", "increased", "decreased"});
		comboBoxFremiti.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxFremiti.setBounds(394, 206, 131, 20);
		page4.add(comboBoxFremiti);
		
		JComboBox comboBoxSounds = new JComboBox(new String[]{"rales", "wheezes", "rhonchi"});
		comboBoxSounds.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxSounds.setBounds(405, 232, 131, 20);
		page4.add(comboBoxSounds);
		
		JLabel lblHeart = new JLabel("Heart");
		lblHeart.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblHeart.setBounds(10, 258, 40, 17);
		page4.add(lblHeart);
		
		JLabel lblApexBeat = new JLabel("Apex beat");
		lblApexBeat.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblApexBeat.setBounds(61, 258, 83, 17);
		page4.add(lblApexBeat);
		
		txtApex = new JTextField();
		txtApex.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtApex.setColumns(10);
		txtApex.setBounds(148, 258, 59, 20);
		page4.add(txtApex);
		
		JLabel lblPmi = new JLabel("PMI");
		lblPmi.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblPmi.setBounds(217, 258, 36, 17);
		page4.add(lblPmi);
		
		txtPMI = new JTextField();
		txtPMI.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		txtPMI.setColumns(10);
		txtPMI.setBounds(253, 258, 59, 20);
		page4.add(txtPMI);
		
		JComboBox comboBoxHeart = new JComboBox(new String[]{"Normal rhythm", "Irregular rhythm", "Murmur"});
		comboBoxHeart.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxHeart.setBounds(346, 258, 158, 20);
		page4.add(comboBoxHeart);
		
		JLabel lblAbdomen = new JLabel("Abdomen");
		lblAbdomen.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblAbdomen.setBounds(10, 284, 88, 17);
		page4.add(lblAbdomen);
		
		JCheckBox chckbxNormal_4 = new JCheckBox("normal");
		chckbxNormal_4.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal_4.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal_4.setBounds(88, 284, 71, 17);
		page4.add(chckbxNormal_4);
		
		JCheckBox chckbxHepatomegaly = new JCheckBox("hepatomegaly");
		chckbxHepatomegaly.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHepatomegaly.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHepatomegaly.setBounds(162, 284, 121, 17);
		page4.add(chckbxHepatomegaly);
		
		JCheckBox chckbxSplenomegaly = new JCheckBox("splenomegaly");
		chckbxSplenomegaly.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxSplenomegaly.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxSplenomegaly.setBounds(286, 284, 118, 17);
		page4.add(chckbxSplenomegaly);
		
		JCheckBox chckbxMass = new JCheckBox("mass");
		chckbxMass.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMass.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMass.setBounds(403, 285, 63, 17);
		page4.add(chckbxMass);
		
		JCheckBox chckbxTender = new JCheckBox("tender");
		chckbxTender.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxTender.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxTender.setBounds(465, 285, 71, 17);
		page4.add(chckbxTender);
		
		JLabel lblExtremities = new JLabel("Extremities");
		lblExtremities.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblExtremities.setBounds(10, 306, 88, 17);
		page4.add(lblExtremities);
		
		JCheckBox chckbxPalmarHyperlinearity = new JCheckBox("Palmar hyperlinearity ");
		chckbxPalmarHyperlinearity.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPalmarHyperlinearity.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPalmarHyperlinearity.setBounds(88, 306, 163, 17);
		page4.add(chckbxPalmarHyperlinearity);
		
		JCheckBox chckbxEdema = new JCheckBox("edema");
		chckbxEdema.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxEdema.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxEdema.setBounds(250, 306, 78, 17);
		page4.add(chckbxEdema);
		
		JCheckBox chckbxJointSwelling = new JCheckBox("joint swelling");
		chckbxJointSwelling.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxJointSwelling.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxJointSwelling.setBounds(327, 306, 110, 17);
		page4.add(chckbxJointSwelling);
		
		JCheckBox chckbxClubbing = new JCheckBox("clubbing");
		chckbxClubbing.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxClubbing.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxClubbing.setBounds(433, 306, 103, 17);
		page4.add(chckbxClubbing);
		
		/*JComboBox comboBoxChestWall = new JComboBox(new String[]{"N", "AbN", "Accessory muscle use"});
		comboBoxChestWall.setBounds(204, 206, 138, 20);
		layeredPane.add(comboBoxChestWall);*/
		
		JPanel page5 = new JPanel();
		layeredPane.setLayer(page5, 1);
		page5.setBounds(24, 0, 542, 367);
		layeredPane.add(page5);
		page5.setBackground(SystemColor.inactiveCaptionBorder);
		page5.setLayout(null);
		
		JLabel lblSkin = new JLabel("Skin");
		lblSkin.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblSkin.setBounds(10, 11, 35, 17);
		page5.add(lblSkin);
		
		JLabel lblHotTest = new JLabel("Hot test");
		lblHotTest.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblHotTest.setBounds(54, 214, 57, 17);
		page5.add(lblHotTest);
		
		JCheckBox chckbxNormal_5 = new JCheckBox("normal");
		chckbxNormal_5.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal_5.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal_5.setBounds(54, 11, 71, 17);
		page5.add(chckbxNormal_5);
		
		JCheckBox chckbxWarm = new JCheckBox("warm");
		chckbxWarm.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxWarm.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxWarm.setBounds(127, 11, 57, 17);
		page5.add(chckbxWarm);
		
		JComboBox comboBoxHotTest = new JComboBox(new String[]{"+", "-"});
		comboBoxHotTest.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxHotTest.setBounds(110, 213, 43, 20);
		page5.add(comboBoxHotTest);
		
		JLabel person = new JLabel("");
		person.setBounds(376, 57, 145, 169);
		Image img = new ImageIcon(this.getClass().getResource("/person.png")).getImage(); 
		person.setIcon(new ImageIcon(img));
		page5.add(person);
		
		JCheckBox chckbxCold = new JCheckBox("cold");
		chckbxCold.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCold.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCold.setBounds(197, 11, 57, 17);
		page5.add(chckbxCold);
		
		JCheckBox chckbxTender_1 = new JCheckBox("tender");
		chckbxTender_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxTender_1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxTender_1.setBounds(256, 11, 71, 17);
		page5.add(chckbxTender_1);
		
		JCheckBox chckbxXerosis = new JCheckBox("xerosis");
		chckbxXerosis.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxXerosis.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxXerosis.setBounds(54, 31, 71, 17);
		page5.add(chckbxXerosis);
		
		JCheckBox chckbxPityriasisAlba = new JCheckBox("pityriasis alba ");
		chckbxPityriasisAlba.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPityriasisAlba.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPityriasisAlba.setBounds(127, 31, 103, 17);
		page5.add(chckbxPityriasisAlba);
		
		JCheckBox chckbxKeratosisPilaris = new JCheckBox("keratosis pilaris");
		chckbxKeratosisPilaris.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxKeratosisPilaris.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxKeratosisPilaris.setBounds(232, 31, 113, 17);
		page5.add(chckbxKeratosisPilaris);
		
		JCheckBox chckbxIchthyosis = new JCheckBox("ichthyosis");
		chckbxIchthyosis.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxIchthyosis.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxIchthyosis.setBounds(345, 31, 79, 17);
		page5.add(chckbxIchthyosis);
		
		JCheckBox chckbxMacule = new JCheckBox("macule");
		chckbxMacule.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMacule.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMacule.setBounds(54, 51, 71, 17);
		page5.add(chckbxMacule);
		
		JCheckBox chckbxPapule = new JCheckBox("papule");
		chckbxPapule.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPapule.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPapule.setBounds(127, 51, 68, 17);
		page5.add(chckbxPapule);
		
		JCheckBox chckbxMaculopapularRash = new JCheckBox("maculopapular rash ");
		chckbxMaculopapularRash.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMaculopapularRash.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMaculopapularRash.setBounds(197, 51, 148, 17);
		page5.add(chckbxMaculopapularRash);
		
		JCheckBox chckbxWheal = new JCheckBox("wheal");
		chckbxWheal.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxWheal.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxWheal.setBounds(54, 73, 71, 17);
		page5.add(chckbxWheal);
		
		JCheckBox chckbxAngioedema_1 = new JCheckBox("angioedema");
		chckbxAngioedema_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxAngioedema_1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxAngioedema_1.setBounds(127, 73, 103, 17);
		page5.add(chckbxAngioedema_1);
		
		JCheckBox chckbxPustule = new JCheckBox("pustule");
		chckbxPustule.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPustule.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPustule.setBounds(54, 93, 71, 17);
		page5.add(chckbxPustule);
		
		JCheckBox chckbxNodule = new JCheckBox("nodule");
		chckbxNodule.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNodule.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNodule.setBounds(127, 93, 68, 17);
		page5.add(chckbxNodule);
		
		JCheckBox chckbxWart = new JCheckBox("wart");
		chckbxWart.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxWart.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxWart.setBounds(197, 93, 57, 17);
		page5.add(chckbxWart);
		
		JCheckBox chckbxScaling_1 = new JCheckBox("scaling");
		chckbxScaling_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxScaling_1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxScaling_1.setBounds(197, 113, 69, 17);
		page5.add(chckbxScaling_1);
		
		JCheckBox chckbxVesicle = new JCheckBox("vesicle");
		chckbxVesicle.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxVesicle.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxVesicle.setBounds(54, 113, 71, 17);
		page5.add(chckbxVesicle);
		
		JCheckBox chckbxBullae = new JCheckBox("bullae");
		chckbxBullae.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxBullae.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxBullae.setBounds(127, 113, 68, 17);
		page5.add(chckbxBullae);
		
		JCheckBox chckbxCrusting = new JCheckBox("crusting");
		chckbxCrusting.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCrusting.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCrusting.setBounds(54, 133, 71, 17);
		page5.add(chckbxCrusting);
		
		JCheckBox chckbxPlaque = new JCheckBox("plaque");
		chckbxPlaque.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPlaque.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPlaque.setBounds(127, 133, 68, 17);
		page5.add(chckbxPlaque);
		
		JCheckBox checkBox_6 = new JCheckBox("scaling");
		checkBox_6.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_6.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_6.setBounds(197, 133, 69, 17);
		page5.add(checkBox_6);
		
		JCheckBox chckbxLichenification = new JCheckBox("lichenification");
		chckbxLichenification.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxLichenification.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxLichenification.setBounds(54, 153, 106, 17);
		page5.add(chckbxLichenification);
		
		JCheckBox checkBox_5 = new JCheckBox("plaque");
		checkBox_5.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_5.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_5.setBounds(162, 153, 68, 17);
		page5.add(checkBox_5);
		
		JCheckBox checkBox_4 = new JCheckBox("crusting");
		checkBox_4.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_4.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_4.setBounds(54, 171, 71, 17);
		page5.add(checkBox_4);
		
		JCheckBox checkBox_7 = new JCheckBox("plaque");
		checkBox_7.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_7.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_7.setBounds(127, 171, 68, 17);
		page5.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("scaling");
		checkBox_8.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		checkBox_8.setBackground(SystemColor.inactiveCaptionBorder);
		checkBox_8.setBounds(197, 171, 69, 17);
		page5.add(checkBox_8);
		
		JCheckBox chckbxHypo = new JCheckBox("hypo-");
		chckbxHypo.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHypo.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHypo.setBounds(54, 191, 71, 17);
		page5.add(chckbxHypo);
		
		JCheckBox chckbxHyperpigmentation = new JCheckBox("hyperpigmentation");
		chckbxHyperpigmentation.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHyperpigmentation.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHyperpigmentation.setBounds(127, 191, 131, 17);
		page5.add(chckbxHyperpigmentation);
		
		JCheckBox chckbxEythema = new JCheckBox("eythema");
		chckbxEythema.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxEythema.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxEythema.setBounds(256, 189, 89, 17);
		page5.add(chckbxEythema);
		
		JComboBox comboBoxColdTest = new JComboBox(new String[]{"+", "-"});
		comboBoxColdTest.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxColdTest.setBounds(214, 213, 43, 20);
		page5.add(comboBoxColdTest);
		
		JLabel lblColdTest = new JLabel("Cold test");
		lblColdTest.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblColdTest.setBounds(159, 215, 57, 17);
		page5.add(lblColdTest);
		
		JLabel lblTargetLesions = new JLabel("Target lesions");
		lblTargetLesions.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblTargetLesions.setBounds(224, 238, 85, 17);
		page5.add(lblTargetLesions);
		
		JLabel lblDermatographism = new JLabel("Dermatographism ");
		lblDermatographism.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblDermatographism.setBounds(54, 238, 113, 17);
		page5.add(lblDermatographism);
		
		JComboBox comboBoxDermatographism = new JComboBox(new String[]{"+", "-"});
		comboBoxDermatographism.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxDermatographism.setBounds(169, 236, 43, 20);
		page5.add(comboBoxDermatographism);
		
		JComboBox comboBoxTargetLesions = new JComboBox(new String[]{"Absent", "Present"});
		comboBoxTargetLesions.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxTargetLesions.setBounds(319, 237, 96, 20);
		page5.add(comboBoxTargetLesions);
		
		JLabel lblEpidermalDetachment = new JLabel("Epidermal detachment");
		lblEpidermalDetachment.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblEpidermalDetachment.setBounds(54, 262, 141, 17);
		page5.add(lblEpidermalDetachment);
		
		txtEpidermalDetachment = new JTextField();
		txtEpidermalDetachment.setBounds(198, 261, 86, 20);
		page5.add(txtEpidermalDetachment);
		txtEpidermalDetachment.setColumns(10);
		
		JLabel lblTbsa = new JLabel("% TBSA");
		lblTbsa.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblTbsa.setBounds(287, 262, 45, 17);
		page5.add(lblTbsa);
		
		JLabel lblMucosalInvolvement = new JLabel("Mucosal involvement");
		lblMucosalInvolvement.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblMucosalInvolvement.setBounds(54, 287, 130, 17);
		page5.add(lblMucosalInvolvement);
		
		JComboBox comboBoxMucosalInvolvement = new JComboBox(new String[]{"Absent", "= 1", "> 1"});
		comboBoxMucosalInvolvement.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxMucosalInvolvement.setBounds(187, 286, 103, 20);
		page5.add(comboBoxMucosalInvolvement);
		
		JLabel lblNikolskysSign = new JLabel("Nikolsky\u2019s sign");
		lblNikolskysSign.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblNikolskysSign.setBounds(297, 287, 97, 17);
		page5.add(lblNikolskysSign);
		
		JComboBox comboBoxNikolskysSign = new JComboBox(new String[]{"Absent", "P"});
		comboBoxNikolskysSign.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxNikolskysSign.setBounds(392, 286, 103, 20);
		page5.add(comboBoxNikolskysSign);
		
		JLabel lblPulses = new JLabel("Pulses");
		lblPulses.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblPulses.setBounds(10, 317, 57, 17);
		page5.add(lblPulses);
		
		JComboBox comboBoxPulses = new JComboBox(new Object[]{});
		comboBoxPulses.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxPulses.setBounds(64, 316, 96, 20);
		page5.add(comboBoxPulses);
		
		JPanel page6 = new JPanel();
		layeredPane.setLayer(page6, 0,000);
		page6.setBounds(24, 0, 542, 367);
		layeredPane.add(page6);
		page6.setBackground(SystemColor.inactiveCaptionBorder);
		page6.setLayout(null);
		
		JLabel lblDiagnostics = new JLabel("Diagnostics");
		lblDiagnostics.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblDiagnostics.setBounds(10, 7, 80, 17);
		page6.add(lblDiagnostics);
		
		JCheckBox chckbxPefr = new JCheckBox("PEFR");
		chckbxPefr.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPefr.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPefr.setBounds(62, 222, 71, 17);
		page6.add(chckbxPefr);
		
		JComboBox comboBoxReactions1 = new JComboBox(new Object[]{});
		comboBoxReactions1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxReactions1.setBounds(164, 260, 124, 20);
		page6.add(comboBoxReactions1);
		
		txtDiagnostics = new JTextField();
		txtDiagnostics.setBounds(96, 6, 436, 20);
		page6.add(txtDiagnostics);
		txtDiagnostics.setColumns(10);
		
		JLabel lblMedications = new JLabel("Medications");
		lblMedications.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblMedications.setBounds(10, 33, 96, 17);
		page6.add(lblMedications);
		
		txtMedications = new JTextField();
		txtMedications.setColumns(10);
		txtMedications.setBounds(96, 32, 436, 20);
		page6.add(txtMedications);
		
		JLabel lblImmunotherapy = new JLabel("Immunotherapy");
		lblImmunotherapy.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblImmunotherapy.setBounds(10, 61, 111, 17);
		page6.add(lblImmunotherapy);
		
		JLabel lblAllergen = new JLabel("Allergen");
		lblAllergen.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblAllergen.setBounds(153, 61, 57, 17);
		page6.add(lblAllergen);
		
		JLabel lblConcentration = new JLabel("Concentration");
		lblConcentration.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblConcentration.setBounds(273, 63, 111, 17);
		page6.add(lblConcentration);
		
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblVolume.setBounds(421, 61, 111, 17);
		page6.add(lblVolume);
		
		JLabel lblI = new JLabel("I");
		lblI.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblI.setBounds(93, 89, 13, 17);
		page6.add(lblI);
		
		JLabel lblIi = new JLabel("II");
		lblIi.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblIi.setBounds(93, 117, 13, 17);
		page6.add(lblIi);
		
		JLabel lblIii = new JLabel("III");
		lblIii.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblIii.setBounds(93, 149, 13, 17);
		page6.add(lblIii);
		
		txtAllergen1 = new JTextField();
		txtAllergen1.setBounds(120, 88, 118, 20);
		page6.add(txtAllergen1);
		txtAllergen1.setColumns(10);
		
		txtAllergen2 = new JTextField();
		txtAllergen2.setColumns(10);
		txtAllergen2.setBounds(120, 116, 118, 20);
		page6.add(txtAllergen2);
		
		txtAllergen3 = new JTextField();
		txtAllergen3.setColumns(10);
		txtAllergen3.setBounds(120, 144, 118, 20);
		page6.add(txtAllergen3);
		
		txtConcentration3 = new JTextField();
		txtConcentration3.setColumns(10);
		txtConcentration3.setBounds(248, 144, 136, 20);
		page6.add(txtConcentration3);
		
		txtConcentration2 = new JTextField();
		txtConcentration2.setColumns(10);
		txtConcentration2.setBounds(248, 116, 136, 20);
		page6.add(txtConcentration2);
		
		txtConcentration1 = new JTextField();
		txtConcentration1.setColumns(10);
		txtConcentration1.setBounds(248, 88, 136, 20);
		page6.add(txtConcentration1);
		
		txtVolume1 = new JTextField();
		txtVolume1.setColumns(10);
		txtVolume1.setBounds(394, 88, 108, 20);
		page6.add(txtVolume1);
		
		txtVolume2 = new JTextField();
		txtVolume2.setColumns(10);
		txtVolume2.setBounds(394, 116, 108, 20);
		page6.add(txtVolume2);
		
		txtVolume3 = new JTextField();
		txtVolume3.setColumns(10);
		txtVolume3.setBounds(394, 144, 108, 20);
		page6.add(txtVolume3);
		
		JLabel lblIv = new JLabel("IV");
		lblIv.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblIv.setBounds(93, 178, 13, 17);
		page6.add(lblIv);
		
		txtAllergen4 = new JTextField();
		txtAllergen4.setColumns(10);
		txtAllergen4.setBounds(120, 173, 118, 20);
		page6.add(txtAllergen4);
		
		txtConcentration4 = new JTextField();
		txtConcentration4.setColumns(10);
		txtConcentration4.setBounds(248, 173, 136, 20);
		page6.add(txtConcentration4);
		
		txtVolume4 = new JTextField();
		txtVolume4.setColumns(10);
		txtVolume4.setBounds(394, 173, 108, 20);
		page6.add(txtVolume4);
		
		JLabel lblPostImmunotherapyPhysical = new JLabel("Post immunotherapy physical exam");
		lblPostImmunotherapyPhysical.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblPostImmunotherapyPhysical.setBounds(10, 201, 254, 17);
		page6.add(lblPostImmunotherapyPhysical);
		
		JCheckBox chckbxLungs = new JCheckBox("Lungs");
		chckbxLungs.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxLungs.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxLungs.setBounds(135, 222, 71, 17);
		page6.add(chckbxLungs);
		
		JCheckBox chckbxItxSite = new JCheckBox("Itx site");
		chckbxItxSite.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxItxSite.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxItxSite.setBounds(208, 220, 71, 17);
		page6.add(chckbxItxSite);
		
		JLabel lblReactionsToCurrent = new JLabel("Reactions to current immunotherapy shot");
		lblReactionsToCurrent.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblReactionsToCurrent.setBounds(10, 240, 305, 17);
		page6.add(lblReactionsToCurrent);
		
		JComboBox comboBoxReactions2 = new JComboBox(new Object[]{});
		comboBoxReactions2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		comboBoxReactions2.setBounds(298, 260, 124, 20);
		page6.add(comboBoxReactions2);
		
		JLabel label_1 = new JLabel("Reactions to current immunotherapy shot");
		label_1.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		label_1.setBounds(10, 281, 305, 17);
		page6.add(label_1);
		
		JCheckBox chckbxEpinephrineSc = new JCheckBox("Epinephrine SC");
		chckbxEpinephrineSc.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxEpinephrineSc.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxEpinephrineSc.setBounds(64, 299, 111, 17);
		page6.add(chckbxEpinephrineSc);
		
		JLabel lblHBlocker = new JLabel("H1 blocker");
		lblHBlocker.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblHBlocker.setBounds(181, 299, 83, 17);
		page6.add(lblHBlocker);
		
		JCheckBox chckbxPo = new JCheckBox("PO");
		chckbxPo.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPo.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPo.setBounds(259, 299, 41, 17);
		page6.add(chckbxPo);
		
		JCheckBox chckbxIm = new JCheckBox("IM");
		chckbxIm.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxIm.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxIm.setBounds(298, 299, 41, 17);
		page6.add(chckbxIm);
		
		JLabel lblHBlocker_1 = new JLabel("H2 blocker");
		lblHBlocker_1.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblHBlocker_1.setBounds(353, 299, 83, 17);
		page6.add(lblHBlocker_1);
		
		JCheckBox chckbxPo1 = new JCheckBox("PO");
		chckbxPo1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPo1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPo1.setBounds(431, 299, 41, 17);
		page6.add(chckbxPo1);
		
		JLabel lblSteroid = new JLabel("Steroid");
		lblSteroid.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblSteroid.setBounds(181, 318, 83, 17);
		page6.add(lblSteroid);
		
		JCheckBox chckbxPo2 = new JCheckBox("PO");
		chckbxPo2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPo2.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPo2.setBounds(259, 318, 41, 17);
		page6.add(chckbxPo2);
		
		JCheckBox chckbxIm2 = new JCheckBox("IM");
		chckbxIm2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxIm2.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxIm2.setBounds(298, 318, 41, 17);
		page6.add(chckbxIm2);
		
		JCheckBox chckbxTopical = new JCheckBox("Topical");
		chckbxTopical.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxTopical.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxTopical.setBounds(341, 318, 81, 17);
		page6.add(chckbxTopical);
		
		JCheckBox chckbxO = new JCheckBox("O2");
		chckbxO.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxO.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxO.setBounds(62, 332, 48, 17);
		page6.add(chckbxO);
		
		JCheckBox chckbxNebulazation = new JCheckBox("Nebulization");
		chckbxNebulazation.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNebulazation.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNebulazation.setBounds(120, 332, 96, 17);
		page6.add(chckbxNebulazation);
		
		JButton btnPrevious = new JButton("PREVIOUS");
		
		btnPrevious.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		btnPrevious.setBounds(24, 368, 214, 25);
		btnPrevious.setContentAreaFilled(false);
		btnPrevious.setOpaque(true);
		btnPrevious.setCursor(new Cursor(Cursor.HAND_CURSOR));
		layeredPane.add(btnPrevious);
		
		JLabel lbl = new JLabel("PAGE 1 / 5");
		lbl.setBounds(260, 373, 77, 14);
		layeredPane.add(lbl);
		lbl.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lbl.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JButton btnPage1 = new JButton("1");
		btnPage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnPage1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		btnPage1.setContentAreaFilled(false);
		btnPage1.setOpaque(true);
		btnPage1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//btnPage1.addActionListener(navListener);
		
		JLabel lblPage = new JLabel(" PAGE");
		lblPage.setFont(new Font("Franklin Gothic Book", Font.BOLD, 17));
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
		btnPage2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		btnPage2.setContentAreaFilled(false);
		btnPage2.setOpaque(true);
		btnPage2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnPage2 = new GridBagConstraints();
		gbc_btnPage2.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage2.gridx = 0;
		gbc_btnPage2.gridy = 4;
		contentPane.add(btnPage2, gbc_btnPage2);
		
		JButton btnPage3 = new JButton("3");
		btnPage3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		btnPage3.setContentAreaFilled(false);
		btnPage3.setOpaque(true);
		btnPage3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnPage3 = new GridBagConstraints();
		gbc_btnPage3.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage3.gridx = 0;
		gbc_btnPage3.gridy = 5;
		contentPane.add(btnPage3, gbc_btnPage3);
		
		JLabel lblEyes = new JLabel("Eyes");
		lblEyes.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblEyes.setBounds(10, 148, 39, 17);
		page3.add(lblEyes);
		
		JCheckBox chckbxPink = new JCheckBox("pink");
		chckbxPink.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPink.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPink.setBounds(164, 148, 55, 17);
		page3.add(chckbxPink);
		
		JCheckBox chckbxPale = new JCheckBox("pale");
		chckbxPale.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPale.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPale.setBounds(224, 148, 55, 17);
		page3.add(chckbxPale);
		
		JCheckBox chckbxInjection = new JCheckBox("injection");
		chckbxInjection.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxInjection.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxInjection.setBounds(284, 148, 88, 17);
		page3.add(chckbxInjection);
		
		JCheckBox chckbxCobblestoning = new JCheckBox("cobblestoning");
		chckbxCobblestoning.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCobblestoning.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCobblestoning.setBounds(374, 148, 120, 17);
		page3.add(chckbxCobblestoning);
		
		JLabel lblConjunctivae = new JLabel("Conjunctivae");
		lblConjunctivae.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblConjunctivae.setBounds(47, 148, 95, 17);
		page3.add(lblConjunctivae);
		
		JLabel lblSeclarae = new JLabel("Seclarae");
		lblSeclarae.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblSeclarae.setBounds(47, 171, 95, 17);
		page3.add(lblSeclarae);
		
		JComboBox comboBoxSeclarae = new JComboBox(new String[]{"Anticteric", "Icteric"});
		comboBoxSeclarae.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		comboBoxSeclarae.setBounds(121, 168, 98, 23);
		page3.add(comboBoxSeclarae);
		
		JCheckBox chckbxTearing_1 = new JCheckBox("tearing");
		chckbxTearing_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxTearing_1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxTearing_1.setBounds(47, 195, 73, 17);
		page3.add(chckbxTearing_1);
		
		JCheckBox chckbxAngioedema = new JCheckBox("angioedema");
		chckbxAngioedema.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxAngioedema.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxAngioedema.setBounds(47, 215, 120, 17);
		page3.add(chckbxAngioedema);
		
		JCheckBox chckbxDischarge = new JCheckBox("discharge");
		chckbxDischarge.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxDischarge.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxDischarge.setBounds(127, 195, 88, 17);
		page3.add(chckbxDischarge);
		
		JCheckBox chckbxDennieMorganFold = new JCheckBox("Dennie Morgan fold ");
		chckbxDennieMorganFold.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxDennieMorganFold.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxDennieMorganFold.setBounds(220, 195, 157, 17);
		page3.add(chckbxDennieMorganFold);
		
		JCheckBox chckbxAllergicShiners = new JCheckBox("allergic shiners");
		chckbxAllergicShiners.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxAllergicShiners.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxAllergicShiners.setBounds(373, 195, 120, 17);
		page3.add(chckbxAllergicShiners);
		
		JLabel lblNose = new JLabel("Nose");
		lblNose.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
		lblNose.setBounds(10, 241, 39, 17);
		page3.add(lblNose);
		
		JCheckBox chckbxNormal2 = new JCheckBox("normal");
		chckbxNormal2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormal2.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormal2.setBounds(47, 241, 73, 17);
		page3.add(chckbxNormal2);
		
		JCheckBox chckbxNasalCrease = new JCheckBox("nasal crease");
		chckbxNasalCrease.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNasalCrease.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNasalCrease.setBounds(121, 241, 107, 17);
		page3.add(chckbxNasalCrease);
		
		JCheckBox chckbxExternalDeformity = new JCheckBox("external deformity ");
		chckbxExternalDeformity.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxExternalDeformity.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxExternalDeformity.setBounds(226, 241, 146, 17);
		page3.add(chckbxExternalDeformity);
		
		JCheckBox chckbxAlarFlaring = new JCheckBox("alar flaring");
		chckbxAlarFlaring.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxAlarFlaring.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxAlarFlaring.setBounds(47, 262, 95, 17);
		page3.add(chckbxAlarFlaring);
		
		JCheckBox chckbxBunnyRedNose = new JCheckBox("bunny red nose");
		chckbxBunnyRedNose.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxBunnyRedNose.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxBunnyRedNose.setBounds(144, 262, 151, 17);
		page3.add(chckbxBunnyRedNose);
		
		JLabel label = new JLabel("Conjunctivae");
		label.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		label.setBounds(47, 282, 95, 17);
		page3.add(label);
		
		JCheckBox chckbxMidline = new JCheckBox("Midline");
		chckbxMidline.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxMidline.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxMidline.setBounds(144, 282, 73, 17);
		page3.add(chckbxMidline);
		
		JCheckBox chckbxDeviated = new JCheckBox("deviated");
		chckbxDeviated.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxDeviated.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxDeviated.setBounds(217, 282, 88, 17);
		page3.add(chckbxDeviated);
		
		JCheckBox chckbxPerforated = new JCheckBox("perforated");
		chckbxPerforated.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPerforated.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPerforated.setBounds(312, 282, 107, 17);
		page3.add(chckbxPerforated);
		
		JCheckBox chckbxGrimacing = new JCheckBox("Grimacing");
		chckbxGrimacing.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxGrimacing.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxGrimacing.setBounds(144, 302, 97, 17);
		page3.add(chckbxGrimacing);
		
		JCheckBox chckbxAllergicSalute = new JCheckBox("allergic salute");
		chckbxAllergicSalute.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxAllergicSalute.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxAllergicSalute.setBounds(242, 302, 115, 17);
		page3.add(chckbxAllergicSalute);
		
		JLabel lblTurbinates = new JLabel("Turbinates");
		lblTurbinates.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblTurbinates.setBounds(47, 320, 95, 17);
		page3.add(lblTurbinates);
		
		JCheckBox chckbxNormalAndPink = new JCheckBox("Normal and pink");
		chckbxNormalAndPink.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxNormalAndPink.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNormalAndPink.setBounds(121, 320, 135, 17);
		page3.add(chckbxNormalAndPink);
		
		JCheckBox chckbxCongested = new JCheckBox("congested");
		chckbxCongested.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxCongested.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxCongested.setBounds(258, 320, 97, 17);
		page3.add(chckbxCongested);
		
		JCheckBox chckbxPale_1 = new JCheckBox("pale");
		chckbxPale_1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxPale_1.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxPale_1.setBounds(351, 320, 55, 17);
		page3.add(chckbxPale_1);
		
		JCheckBox chckbxHyperemic = new JCheckBox("hyperemic");
		chckbxHyperemic.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		chckbxHyperemic.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxHyperemic.setBounds(408, 320, 105, 17);
		page3.add(chckbxHyperemic);
		
		JLabel lblPolypoid = new JLabel("Polypoid");
		lblPolypoid.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblPolypoid.setBounds(147, 342, 95, 17);
		page3.add(lblPolypoid);
		
		JComboBox comboBoxPolypoid = new JComboBox(new String[]{"L", "R", "Bilateral"});
		comboBoxPolypoid.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 13));
		comboBoxPolypoid.setBounds(215, 340, 98, 23);
		page3.add(comboBoxPolypoid);
		
		JButton btnPage4 = new JButton("4");
		btnPage4.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		btnPage4.setContentAreaFilled(false);
		btnPage4.setOpaque(true);
		btnPage4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_btnPage4 = new GridBagConstraints();
		gbc_btnPage4.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage4.gridx = 0;
		gbc_btnPage4.gridy = 6;
		contentPane.add(btnPage4, gbc_btnPage4);

		JButton btnPage5 = new JButton("5");
		btnPage5.setOpaque(true);
		btnPage5.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		GridBagConstraints gbc_btnPage5 = new GridBagConstraints();
		gbc_btnPage5.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage5.gridx = 0;
		gbc_btnPage5.gridy = 7;
		btnPage5.setContentAreaFilled(false);
		btnPage5.setOpaque(true);
		btnPage5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnPage5, gbc_btnPage5);
		
		JButton btnPage6 = new JButton("6");
		btnPage6.setOpaque(true);
		btnPage6.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		GridBagConstraints gbc_btnPage6 = new GridBagConstraints();
		gbc_btnPage6.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage6.gridx = 0;
		gbc_btnPage6.gridy = 8;
		btnPage6.setContentAreaFilled(false);
		btnPage6.setOpaque(true);
		btnPage6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnPage6, gbc_btnPage6);
		
		ArrayList<JPanel> pages = new ArrayList<JPanel>();
		pages.add(page1);
		pages.add(page2);
		pages.add(page3);
		pages.add(page4);
		pages.add(page5);
		pages.add(page6);
		
		ArrayList<JButton> nav = new ArrayList<JButton>();
		nav.add(btnPage1);
		nav.add(btnPage2);
		nav.add(btnPage3);
		nav.add(btnPage4);
		nav.add(btnPage5);
		nav.add(btnPage6);
		
		nav.get(0).setEnabled(false);
		lbl.setText("PAGE " + (pageNumber+1) + " / " + pages.size());
		
		JButton btnDiscard = new JButton("DISCARD");
		btnDiscard.setToolTipText("Discard form");
		btnDiscard.setForeground(new Color(220, 20, 60));
		btnDiscard.setBackground(new Color(250, 128, 114));
		btnDiscard.setContentAreaFilled(false);
		btnDiscard.setOpaque(true);
		btnDiscard.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnDiscard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDiscard.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		btnDiscard.setBounds(175, 398, 118, 25);
		layeredPane.add(btnDiscard);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setToolTipText("Submit form");
		btnSubmit.setForeground(new Color(0, 100, 0));
		btnSubmit.setBackground(new Color(144, 238, 144));
		btnSubmit.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		btnSubmit.setBounds(303, 398, 118, 25);
		btnSubmit.setContentAreaFilled(false);
		btnSubmit.setOpaque(true);
		btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		layeredPane.add(btnSubmit);
			
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.setLayer(pages.get(pageNumber), 0);
				nav.get(pageNumber).setEnabled(true);
				pageNumber--;
				layeredPane.setLayer(pages.get(pageNumber), 100);
				nav.get(pageNumber).setEnabled(false);
				lbl.setText("PAGE " + (pageNumber+1) + " / " + pages.size());
				btnNext.setEnabled(true);
				btnSubmit.setEnabled(false);
				
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
				btnSubmit.setEnabled(false);
				
				if(pageNumber+1 == pages.size()){
					btnNext.setEnabled(false);
					btnSubmit.setEnabled(true);
					
				}
			}
		});
		
		//ButtonGroup group = new ButtonGroup();
		
	}
}