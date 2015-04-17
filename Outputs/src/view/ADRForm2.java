/*
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class ADRForm2 extends JFrame {

	private JPanel contentPane;
	private int pageNumber;
	private JTextField textField;
	private JTextField txtfldThrombCount;
	private JTextField textField_1;
	private JTextField txtfldOrganInvolvement;
	private JTextField txtfldDrugReaction;
	private JTextField txtDiffdiag;
	private JTextField txtOtherContributingFactor;
	private JTextField txtOtherInvolvement;
	private JTextField txtPainBurning;
	private JTextField txtEdema;
	private JTextField txtArthrlagialocation;
	private JTextField txtOtherAssociatedSymptom;
	private JTextField txtOtherCardioVascularsymptoms;
	private JTextField txtPulseRate;
	private JTextField txtBloodPressure;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADRForm2 frame = new ADRForm2();
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
	public ADRForm2() {
		pageNumber = 0;
		
		setFont(new Font("Arial", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setTitle("ADR Form 2");
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
		
		JLabel formTitleLabel = new JLabel("ALLERGY AND ADR FOLLOW UP FORM");
		formTitleLabel.setFont(new Font("Century Gothic", Font.BOLD, 13));
		GridBagConstraints gbc_formTitleLabel = new GridBagConstraints();
		gbc_formTitleLabel.gridwidth = 15;
		gbc_formTitleLabel.anchor = GridBagConstraints.NORTH;
		gbc_formTitleLabel.insets = new Insets(0, 0, 5, 0);
		gbc_formTitleLabel.gridx = 0;
		gbc_formTitleLabel.gridy = 0;
		contentPane.add(formTitleLabel, gbc_formTitleLabel);
		
		JLabel lblADRForm2Up = new JLabel("ADRForm2 UP FORM");
		lblADRForm2Up.setFont(new Font("Century Gothic", Font.BOLD, 14));
		GridBagConstraints gbc_lblADRForm2Up = new GridBagConstraints();
		gbc_lblADRForm2Up.gridwidth = 9;
		gbc_lblADRForm2Up.insets = new Insets(0, 0, 5, 5);
		gbc_lblADRForm2Up.gridx = 5;
		gbc_lblADRForm2Up.gridy = 1;
		contentPane.add(lblADRForm2Up, gbc_lblADRForm2Up);
		
		JLayeredPane layeredPane = new JLayeredPane();
		GridBagConstraints gbc_layeredPane = new GridBagConstraints();
		gbc_layeredPane.gridheight = 10;
		gbc_layeredPane.gridwidth = 14;
		gbc_layeredPane.fill = GridBagConstraints.BOTH;
		gbc_layeredPane.gridx = 1;
		gbc_layeredPane.gridy = 2;
		contentPane.add(layeredPane, gbc_layeredPane);
		
		JPanel page1 = new JPanel();
		layeredPane.setLayer(page1, 2);
		page1.setBackground(SystemColor.inactiveCaptionBorder);
		page1.setBounds(0, 0, 542, 367);
		layeredPane.add(page1);
		page1.setLayout(null);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		JPanel page2 = new JPanel();
		layeredPane.setLayer(page2, 1);
		page2.setBackground(SystemColor.inactiveCaptionBorder);
		page2.setBounds(0, 0, 542, 367);
		layeredPane.add(page2);
		page2.setLayout(null);
		
		JPanel page3 = new JPanel();
		page3.setBackground(SystemColor.inactiveCaptionBorder);
		layeredPane.setLayer(page3, 3);
		page3.setBounds(0, 0, 542, 367);
		layeredPane.add(page3);
		page3.setLayout(null);
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
		
		JButton btnPage3 = new JButton("3");
		GridBagConstraints gbc_btnPage3 = new GridBagConstraints();
		gbc_btnPage3.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage3.gridx = 0;
		gbc_btnPage3.gridy = 5;
		contentPane.add(btnPage3, gbc_btnPage3);
		
		ArrayList<JPanel> pages = new ArrayList<JPanel>();
		pages.add(page1);
		
		JLabel lblDrugReaction = new JLabel("Drug Reaction");
		lblDrugReaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDrugReaction.setBounds(10, 10, 75, 25);
		page1.add(lblDrugReaction);
		
		JLabel lblCutaneousSymptoms = new JLabel("Cutaneous Symptoms");
		lblCutaneousSymptoms.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCutaneousSymptoms.setBounds(10, 41, 216, 25);
		page1.add(lblCutaneousSymptoms);
		
		JCheckBox chckbxMaculopapularExanthema = new JCheckBox("Maculopapular Exanthema");
		chckbxMaculopapularExanthema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxMaculopapularExanthema.setBounds(26, 72, 189, 25);
		page1.add(chckbxMaculopapularExanthema);
		
		JCheckBox chckbxMacularExanthema = new JCheckBox("Macular Exanthema");
		chckbxMacularExanthema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxMacularExanthema.setBounds(26, 103, 189, 25);
		page1.add(chckbxMacularExanthema);
		
		JCheckBox chckbxUrticariousExanthema = new JCheckBox("Urticarious Exanthema");
		chckbxUrticariousExanthema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxUrticariousExanthema.setBounds(26, 134, 189, 25);
		page1.add(chckbxUrticariousExanthema);
		
		JCheckBox chckbxAgep = new JCheckBox("AGEP");
		chckbxAgep.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxAgep.setBounds(26, 165, 189, 25);
		page1.add(chckbxAgep);
		
		JCheckBox chckbxEczematoidExanthema = new JCheckBox("Eczematoid Exanthema");
		chckbxEczematoidExanthema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxEczematoidExanthema.setBounds(26, 196, 189, 25);
		page1.add(chckbxEczematoidExanthema);
		
		JCheckBox chckbxErythemaExudativumMultiforme = new JCheckBox("Erythema Exudativum Multiforme");
		chckbxErythemaExudativumMultiforme.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxErythemaExudativumMultiforme.setBounds(26, 227, 189, 25);
		page1.add(chckbxErythemaExudativumMultiforme);
		
		JCheckBox chckbxBullousExanthema = new JCheckBox("Bullous Exanthema");
		chckbxBullousExanthema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxBullousExanthema.setBounds(26, 258, 189, 25);
		page1.add(chckbxBullousExanthema);
		
		JCheckBox chckbxStevensJohnsonsSyndrome = new JCheckBox("Stevens Johnsons Syndrome");
		chckbxStevensJohnsonsSyndrome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxStevensJohnsonsSyndrome.setBounds(26, 289, 189, 25);
		page1.add(chckbxStevensJohnsonsSyndrome);
		
		JCheckBox chckbxFixedDrugExantherma = new JCheckBox("Fixed Drug Exantherma");
		chckbxFixedDrugExantherma.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxFixedDrugExantherma.setBounds(26, 320, 189, 25);
		page1.add(chckbxFixedDrugExantherma);
		
		JCheckBox chckbxPurpura = new JCheckBox("Purpura");
		chckbxPurpura.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxPurpura.setBounds(233, 72, 96, 25);
		page1.add(chckbxPurpura);
		
		JLabel lblThrombocyteCount = new JLabel("Thrombocyte Count");
		lblThrombocyteCount.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblThrombocyteCount.setBounds(335, 72, 107, 25);
		page1.add(lblThrombocyteCount);
		
		txtfldThrombCount = new JTextField();
		txtfldThrombCount.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtfldThrombCount.setEditable(false);
		txtfldThrombCount.setBounds(436, 72, 82, 25);
		page1.add(txtfldThrombCount);
		txtfldThrombCount.setColumns(10);
		
		JCheckBox chckbxPalpable = new JCheckBox("Palpable");
		chckbxPalpable.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxPalpable.setBounds(258, 103, 82, 25);
		page1.add(chckbxPalpable);
		
		JCheckBox chckbxHaemorrhagicnecrotizing = new JCheckBox("Haemorrhagic-necrotizing");
		chckbxHaemorrhagicnecrotizing.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxHaemorrhagicnecrotizing.setBounds(345, 103, 157, 25);
		page1.add(chckbxHaemorrhagicnecrotizing);
		
		JCheckBox chckbxVisceral = new JCheckBox("Visceral");
		chckbxVisceral.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxVisceral.setBounds(258, 134, 82, 25);
		page1.add(chckbxVisceral);
		
		JLabel lblOrganInvolvement = new JLabel("Organ Involvement");
		lblOrganInvolvement.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblOrganInvolvement.setBounds(345, 134, 96, 25);
		page1.add(lblOrganInvolvement);
		
		txtfldOrganInvolvement = new JTextField();
		txtfldOrganInvolvement.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtfldOrganInvolvement.setEditable(false);
		txtfldOrganInvolvement.setColumns(10);
		txtfldOrganInvolvement.setBounds(447, 134, 82, 25);
		page1.add(txtfldOrganInvolvement);
		
		JCheckBox chckbxContactDermatitis = new JCheckBox("Contact Dermatitis");
		chckbxContactDermatitis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxContactDermatitis.setBounds(233, 191, 121, 25);
		page1.add(chckbxContactDermatitis);
		
		JCheckBox chckbxUticaria = new JCheckBox("Topic Cause");
		chckbxUticaria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxUticaria.setBounds(361, 191, 141, 25);
		page1.add(chckbxUticaria);
		
		JCheckBox chckbxHaematogenousCause = new JCheckBox("Haematogenous Cause");
		chckbxHaematogenousCause.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxHaematogenousCause.setBounds(233, 222, 268, 25);
		page1.add(chckbxHaematogenousCause);
		
		JCheckBox chckbxUrticariaVasculitis = new JCheckBox("Urticaria Vasculitis");
		chckbxUrticariaVasculitis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxUrticariaVasculitis.setBounds(233, 253, 121, 25);
		page1.add(chckbxUrticariaVasculitis);
		
		JCheckBox chckbxOnlyPruritus = new JCheckBox("ONLY Pruritus");
		chckbxOnlyPruritus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxOnlyPruritus.setBounds(361, 253, 141, 25);
		page1.add(chckbxOnlyPruritus);
		
		JCheckBox chckbxUrticaria = new JCheckBox("Urticaria");
		chckbxUrticaria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxUrticaria.setBounds(233, 284, 121, 25);
		page1.add(chckbxUrticaria);
		
		JCheckBox chckbxAngiodema = new JCheckBox("Angiodema");
		chckbxAngiodema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxAngiodema.setBounds(361, 284, 141, 30);
		page1.add(chckbxAngiodema);
		
		JCheckBox chckbxConjunctivitis = new JCheckBox("Conjunctivitis");
		chckbxConjunctivitis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxConjunctivitis.setBounds(233, 315, 121, 25);
		page1.add(chckbxConjunctivitis);
		
		JCheckBox chckbxMorphology = new JCheckBox("Morphology");
		chckbxMorphology.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxMorphology.setBounds(361, 315, 141, 30);
		page1.add(chckbxMorphology);
		
		txtfldDrugReaction = new JTextField();
		txtfldDrugReaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtfldDrugReaction.setBounds(83, 16, 145, 19);
		page1.add(txtfldDrugReaction);
		txtfldDrugReaction.setColumns(10);
		
		JLabel lblDateOfReaction = new JLabel("Date of Reaction");
		lblDateOfReaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDateOfReaction.setBounds(233, 10, 96, 25);
		page1.add(lblDateOfReaction);
		
		JComboBox cmbbxMonthReaction = new JComboBox();
		cmbbxMonthReaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cmbbxMonthReaction.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		cmbbxMonthReaction.setBounds(320, 12, 52, 23);
		page1.add(cmbbxMonthReaction);
		
		JComboBox chckbxDayReaction = new JComboBox();
		chckbxDayReaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxDayReaction.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		chckbxDayReaction.setBounds(382, 12, 52, 25);
		page1.add(chckbxDayReaction);
		
		JComboBox cmbbxYearReaction = new JComboBox();
		cmbbxYearReaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cmbbxYearReaction.setModel(new DefaultComboBoxModel(new String[] {"2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		cmbbxYearReaction.setBounds(447, 12, 52, 25);
		page1.add(cmbbxYearReaction);
		pages.add(page2);
		
		JLabel lblDifferentialDiagnosis = new JLabel("Differential Diagnosis");
		lblDifferentialDiagnosis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDifferentialDiagnosis.setBounds(10, 10, 216, 25);
		page2.add(lblDifferentialDiagnosis);
		
		txtDiffdiag = new JTextField();
		txtDiffdiag.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDiffdiag.setBounds(20, 41, 206, 25);
		page2.add(txtDiffdiag);
		txtDiffdiag.setColumns(10);
		
		JButton btnAddDiffDiag = new JButton("Add");
		btnAddDiffDiag.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAddDiffDiag.setBounds(232, 42, 89, 23);
		page2.add(btnAddDiffDiag);
		
		JLabel lblContributingFactors = new JLabel("Contributing Factors");
		lblContributingFactors.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContributingFactors.setBounds(10, 72, 216, 25);
		page2.add(lblContributingFactors);
		
		JCheckBox chckbxViralInfections = new JCheckBox("Viral Infections");
		chckbxViralInfections.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxViralInfections.setBounds(20, 101, 177, 25);
		page2.add(chckbxViralInfections);
		
		JCheckBox chckbxFluLikeInfections = new JCheckBox("Flu like Infections");
		chckbxFluLikeInfections.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxFluLikeInfections.setBounds(20, 132, 177, 25);
		page2.add(chckbxFluLikeInfections);
		
		JCheckBox chckbxFever = new JCheckBox("Fever");
		chckbxFever.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxFever.setBounds(20, 163, 177, 25);
		page2.add(chckbxFever);
		
		JCheckBox chckbxSuspicionOfPhotosensitivity = new JCheckBox("Suspicion of Photosensitivity");
		chckbxSuspicionOfPhotosensitivity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxSuspicionOfPhotosensitivity.setBounds(20, 195, 177, 25);
		page2.add(chckbxSuspicionOfPhotosensitivity);
		
		JCheckBox chckbxStress = new JCheckBox("Stress");
		chckbxStress.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxStress.setBounds(20, 226, 177, 25);
		page2.add(chckbxStress);
		
		JCheckBox chckbxExercise = new JCheckBox("Exercise");
		chckbxExercise.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxExercise.setBounds(20, 257, 177, 25);
		page2.add(chckbxExercise);
		
		JCheckBox chckbxOther = new JCheckBox("Other");
		chckbxOther.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxOther.setBounds(20, 288, 177, 25);
		page2.add(chckbxOther);
		
		txtOtherContributingFactor = new JTextField();
		txtOtherContributingFactor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtOtherContributingFactor.setEditable(false);
		txtOtherContributingFactor.setBounds(30, 319, 170, 25);
		page2.add(txtOtherContributingFactor);
		txtOtherContributingFactor.setColumns(10);
		
		JLabel lblGastrointestinalAndRespiratory = new JLabel("Gastrointestinal and Respiratory Symptoms");
		lblGastrointestinalAndRespiratory.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGastrointestinalAndRespiratory.setBounds(232, 71, 216, 25);
		page2.add(lblGastrointestinalAndRespiratory);
		
		JCheckBox chckbxNauseaemesis = new JCheckBox("Nausea/Emesis");
		chckbxNauseaemesis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNauseaemesis.setBounds(242, 101, 177, 25);
		page2.add(chckbxNauseaemesis);
		
		JCheckBox chckbxDiarrhea = new JCheckBox("Diarrhea");
		chckbxDiarrhea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxDiarrhea.setBounds(242, 132, 177, 25);
		page2.add(chckbxDiarrhea);
		
		JCheckBox chckbxGastroIntestinalCramps = new JCheckBox("Gastro Intestinal Cramps");
		chckbxGastroIntestinalCramps.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxGastroIntestinalCramps.setBounds(242, 163, 177, 25);
		page2.add(chckbxGastroIntestinalCramps);
		
		JCheckBox chckbxCough = new JCheckBox("Cough");
		chckbxCough.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxCough.setBounds(425, 163, 111, 25);
		page2.add(chckbxCough);
		
		JCheckBox chckbxDysphonia = new JCheckBox("Dysphonia");
		chckbxDysphonia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxDysphonia.setBounds(425, 194, 111, 25);
		page2.add(chckbxDysphonia);
		
		JCheckBox chckbxWheezingbronchospasm = new JCheckBox("Wheezing/Bronchospasm");
		chckbxWheezingbronchospasm.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxWheezingbronchospasm.setBounds(242, 195, 177, 25);
		page2.add(chckbxWheezingbronchospasm);
		
		JCheckBox chckbxRhinitis = new JCheckBox("Rhinitis");
		chckbxRhinitis.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxRhinitis.setBounds(242, 226, 177, 25);
		page2.add(chckbxRhinitis);
		
		JCheckBox chckbxRhinorrhea = new JCheckBox("Rhinorrhea");
		chckbxRhinorrhea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxRhinorrhea.setBounds(425, 226, 111, 25);
		page2.add(chckbxRhinorrhea);
		
		JCheckBox chckbxSneezing = new JCheckBox("Sneezing");
		chckbxSneezing.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxSneezing.setBounds(425, 101, 111, 25);
		page2.add(chckbxSneezing);
		
		JCheckBox chckbxNasalObstruction = new JCheckBox("Nasal Obstruction");
		chckbxNasalObstruction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNasalObstruction.setBounds(425, 132, 111, 25);
		page2.add(chckbxNasalObstruction);
		
		JLabel lblPsychicSymptoms = new JLabel("Psychic Symptoms");
		lblPsychicSymptoms.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPsychicSymptoms.setBounds(232, 257, 216, 25);
		page2.add(lblPsychicSymptoms);
		
		JCheckBox chckbxFearpanicReaction = new JCheckBox("Fear/Panic Reaction");
		chckbxFearpanicReaction.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxFearpanicReaction.setBounds(242, 288, 177, 25);
		page2.add(chckbxFearpanicReaction);
		
		JCheckBox chckbxVertigo = new JCheckBox("Vertigo");
		chckbxVertigo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxVertigo.setBounds(242, 319, 177, 25);
		page2.add(chckbxVertigo);
		pages.add(page3);
		
		JLabel lblAssociatedSymptoms = new JLabel("Associated Symptoms");
		lblAssociatedSymptoms.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAssociatedSymptoms.setBounds(10, 10, 216, 25);
		page3.add(lblAssociatedSymptoms);
		
		JCheckBox chckbxLiver = new JCheckBox("Liver");
		chckbxLiver.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxLiver.setBounds(30, 73, 49, 25);
		page3.add(chckbxLiver);
		
		JLabel lblInvolvementOf = new JLabel("Involvement of");
		lblInvolvementOf.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblInvolvementOf.setBounds(20, 41, 216, 25);
		page3.add(lblInvolvementOf);
		
		JCheckBox chckbxKidney = new JCheckBox("Kidney");
		chckbxKidney.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxKidney.setBounds(85, 73, 62, 25);
		page3.add(chckbxKidney);
		
		JCheckBox chckbxOtherInvolvement = new JCheckBox("Other");
		chckbxOtherInvolvement.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxOtherInvolvement.setBounds(30, 104, 62, 25);
		page3.add(chckbxOtherInvolvement);
		
		txtOtherInvolvement = new JTextField();
		txtOtherInvolvement.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtOtherInvolvement.setEditable(false);
		txtOtherInvolvement.setBounds(98, 102, 105, 27);
		page3.add(txtOtherInvolvement);
		txtOtherInvolvement.setColumns(10);
		
		JCheckBox chckbxFever_1 = new JCheckBox("Fever");
		chckbxFever_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxFever_1.setBounds(17, 142, 120, 25);
		page3.add(chckbxFever_1);
		
		JCheckBox chckbxMalaise = new JCheckBox("Malaise");
		chckbxMalaise.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxMalaise.setBounds(17, 173, 120, 25);
		page3.add(chckbxMalaise);
		
		JCheckBox chckbxPainburning = new JCheckBox("Pain/Burning");
		chckbxPainburning.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxPainburning.setBounds(17, 204, 120, 25);
		page3.add(chckbxPainburning);
		
		JCheckBox chckbxEdema = new JCheckBox("Edema");
		chckbxEdema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxEdema.setBounds(17, 235, 120, 25);
		page3.add(chckbxEdema);
		
		JCheckBox chckbxArthralgiamyalgia = new JCheckBox("Arthralgia/Myalgia");
		chckbxArthralgiamyalgia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxArthralgiamyalgia.setBounds(17, 266, 120, 25);
		page3.add(chckbxArthralgiamyalgia);
		
		JCheckBox chckbxLymphadenopathy = new JCheckBox("Lymphadenopathy");
		chckbxLymphadenopathy.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxLymphadenopathy.setBounds(17, 297, 120, 25);
		page3.add(chckbxLymphadenopathy);
		
		JCheckBox chckbxOtherAssociated = new JCheckBox("Other");
		chckbxOtherAssociated.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxOtherAssociated.setBounds(17, 328, 120, 25);
		page3.add(chckbxOtherAssociated);
		
		txtPainBurning = new JTextField();
		txtPainBurning.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPainBurning.setText("Location");
		txtPainBurning.setEditable(false);
		txtPainBurning.setColumns(10);
		txtPainBurning.setBounds(143, 202, 105, 27);
		page3.add(txtPainBurning);
		
		txtEdema = new JTextField();
		txtEdema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEdema.setText("Location");
		txtEdema.setEditable(false);
		txtEdema.setColumns(10);
		txtEdema.setBounds(143, 235, 105, 27);
		page3.add(txtEdema);
		
		txtArthrlagialocation = new JTextField();
		txtArthrlagialocation.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtArthrlagialocation.setText("Location");
		txtArthrlagialocation.setEditable(false);
		txtArthrlagialocation.setColumns(10);
		txtArthrlagialocation.setBounds(143, 266, 105, 27);
		page3.add(txtArthrlagialocation);
		
		txtOtherAssociatedSymptom = new JTextField();
		txtOtherAssociatedSymptom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtOtherAssociatedSymptom.setEditable(false);
		txtOtherAssociatedSymptom.setColumns(10);
		txtOtherAssociatedSymptom.setBounds(143, 326, 105, 27);
		page3.add(txtOtherAssociatedSymptom);
		
		JLabel lblCardiovascularSymptoms = new JLabel("Cardiovascular Symptoms");
		lblCardiovascularSymptoms.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCardiovascularSymptoms.setBounds(262, 10, 216, 25);
		page3.add(lblCardiovascularSymptoms);
		
		JCheckBox chckbxTachykardia = new JCheckBox("Tachykardia");
		chckbxTachykardia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxTachykardia.setBounds(272, 41, 120, 25);
		page3.add(chckbxTachykardia);
		
		JCheckBox chckbxHypotension = new JCheckBox("Hypotension");
		chckbxHypotension.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxHypotension.setBounds(272, 104, 120, 25);
		page3.add(chckbxHypotension);
		
		JCheckBox chckbxCollapse = new JCheckBox("Collapse");
		chckbxCollapse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxCollapse.setBounds(272, 173, 120, 25);
		page3.add(chckbxCollapse);
		
		JCheckBox chckbxArrhythmia = new JCheckBox("Arrhythmia");
		chckbxArrhythmia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxArrhythmia.setBounds(272, 204, 120, 25);
		page3.add(chckbxArrhythmia);
		
		JCheckBox chckbxOtherCardiovascular = new JCheckBox("Other");
		chckbxOtherCardiovascular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxOtherCardiovascular.setBounds(272, 235, 120, 25);
		page3.add(chckbxOtherCardiovascular);
		
		txtOtherCardioVascularsymptoms = new JTextField();
		txtOtherCardioVascularsymptoms.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtOtherCardioVascularsymptoms.setEditable(false);
		txtOtherCardioVascularsymptoms.setColumns(10);
		txtOtherCardioVascularsymptoms.setBounds(398, 233, 105, 27);
		page3.add(txtOtherCardioVascularsymptoms);
		
		JLabel lblPulseRate = new JLabel("Pulse Rate:");
		lblPulseRate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPulseRate.setBounds(282, 73, 62, 25);
		page3.add(lblPulseRate);
		
		txtPulseRate = new JTextField();
		txtPulseRate.setEditable(false);
		txtPulseRate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPulseRate.setBounds(350, 73, 41, 25);
		page3.add(txtPulseRate);
		txtPulseRate.setColumns(10);
		
		JLabel lblmin = new JLabel("/min");
		lblmin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblmin.setBounds(398, 73, 62, 25);
		page3.add(lblmin);
		
		JLabel lblBloodPressure = new JLabel("Blood Pressure:");
		lblBloodPressure.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblBloodPressure.setBounds(282, 135, 76, 25);
		page3.add(lblBloodPressure);
		
		txtBloodPressure = new JTextField();
		txtBloodPressure.setEditable(false);
		txtBloodPressure.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtBloodPressure.setColumns(10);
		txtBloodPressure.setBounds(368, 136, 41, 25);
		page3.add(txtBloodPressure);
		
		JLabel lblMmhg = new JLabel("mmhg");
		lblMmhg.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMmhg.setBounds(416, 136, 62, 25);
		page3.add(lblMmhg);
		
		ArrayList<JButton> nav = new ArrayList<JButton>();
		nav.add(btnPage1);
		nav.add(btnPage2);
		nav.add(btnPage3);
		
		nav.get(0).setEnabled(false);
		lbl.setText("PAGE " + (pageNumber+1) + " / " + pages.size());
		
		textField = new JTextField();
		textField.setBounds(453, 70, 77, 25);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(453, 137, 66, 25);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
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
