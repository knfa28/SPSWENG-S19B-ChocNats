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


public class APASFollowUpForm extends JFrame {

	private JPanel contentPane;
	private int pageNumber;
	private JTextField txtfldAogByLmp;
	private JTextField txtfldAogByUtg;
	private JTextField txtfldLastWorkingImpressions;
	private JTextField txtfldMedications;
	private JTextField txtfldLatestLabResults;
	private JTextField txtfldUtz;
	private JTextField txtfldFetalWeight;
	private JTextField txtfldPlacenta;
	private JTextField txtfldPresentation;
	private JTextField txtfldAfiVolume;
	private JTextField txtfldDoppler;
	private JTextField txtfldUterine;
	private JTextField txtfldUmbilical;
	private JTextField txtfldBpp;
	private JTextField txtfldHtWt;
	private JTextField txtfldBpHrRr;
	private JTextField txtfldGeneral;
	private JTextField txtfldNose;
	private JTextField txtfldOralCavity;
	private JTextField txtfldEars;
	private JTextField txtfldThroat;
	private JTextField txtfldE;
	private JTextField txtfldV;
	private JTextField txtfldM;
	private JTextField txtfldSensoryPercent;
	private JTextField txtfldReferrals;
	private JTextField txtfldExaminedBy;
	private JTextField txtfldOthers;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					APASFollowUpForm frame = new APASFollowUpForm();
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
	public APASFollowUpForm() {
		pageNumber = 0;
		
		setFont(new Font("Arial", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setTitle("APAS - Follow Up Form");
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
		
		JLabel formTitleLabel = new JLabel("APAS");
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
		layeredPane.setLayer(page1, 6);
		page1.setBackground(SystemColor.inactiveCaptionBorder);
		page1.setBounds(0, 0, 542, 367);
		layeredPane.add(page1);
		page1.setLayout(null);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Century Gothic", Font.BOLD, 13));
		
		JPanel page2 = new JPanel();
		layeredPane.setLayer(page2, 2);
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
		
		JPanel page4 = new JPanel();
		layeredPane.setLayer(page4, 4);
		page4.setBackground(SystemColor.inactiveCaptionBorder);
		page4.setBounds(0, 0, 542, 367);
		layeredPane.add(page4);
		page4.setLayout(null);
		
		JPanel page5 = new JPanel();
		layeredPane.setLayer(page5, 5);
		page5.setBackground(SystemColor.inactiveCaptionBorder);
		page5.setBounds(0, 0, 542, 367);
		layeredPane.add(page5);
		page5.setLayout(null);		
		
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
		
		JLabel lblDateOfConsult = new JLabel("Date of Consult:");
		lblDateOfConsult.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblDateOfConsult.setBounds(10, 10, 116, 20);
		page1.add(lblDateOfConsult);
		
		JLabel lblLastSeenIn = new JLabel("Last Seen in Clinic:");
		lblLastSeenIn.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblLastSeenIn.setBounds(10, 36, 130, 20);
		page1.add(lblLastSeenIn);
		
		JLabel lblAogByLmp = new JLabel("AOG by LMP:");
		lblAogByLmp.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAogByLmp.setBounds(10, 69, 116, 20);
		page1.add(lblAogByLmp);
		
		JLabel lblAogByst = new JLabel("AOG by 1st UTG:");
		lblAogByst.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAogByst.setBounds(10, 95, 116, 20);
		page1.add(lblAogByst);
		
		JLabel lblLastWorkingImpression = new JLabel("Last Working Impression:");
		lblLastWorkingImpression.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblLastWorkingImpression.setBounds(10, 121, 171, 20);
		page1.add(lblLastWorkingImpression);
		
		JLabel lblMedications = new JLabel("Medications:");
		lblMedications.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblMedications.setBounds(10, 147, 116, 20);
		page1.add(lblMedications);
		
		JLabel lblReviewOfSystems = new JLabel("Review of Systems:");
		lblReviewOfSystems.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblReviewOfSystems.setBounds(10, 173, 130, 20);
		page1.add(lblReviewOfSystems);
		
		JCheckBox chckbxHeadache = new JCheckBox("Headache");
		chckbxHeadache.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxHeadache.setBounds(0, 200, 137, 23);
		page1.add(chckbxHeadache);
		
		JCheckBox chckbxBlurringOfVision = new JCheckBox("Blurring of Vision");
		chckbxBlurringOfVision.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxBlurringOfVision.setBounds(0, 226, 137, 23);
		page1.add(chckbxBlurringOfVision);
		
		JCheckBox chckbxPhotosensitivity = new JCheckBox("Photosensitivity");
		chckbxPhotosensitivity.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxPhotosensitivity.setBounds(0, 252, 137, 23);
		page1.add(chckbxPhotosensitivity);
		
		JCheckBox chckbxMalarRash = new JCheckBox("Malar Rash");
		chckbxMalarRash.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxMalarRash.setBounds(0, 278, 137, 23);
		page1.add(chckbxMalarRash);
		
		JCheckBox chckbxOralUlcers = new JCheckBox("Oral Ulcers");
		chckbxOralUlcers.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxOralUlcers.setBounds(0, 304, 137, 23);
		page1.add(chckbxOralUlcers);
		
		JCheckBox chckbxParoxysmalDyspnea = new JCheckBox("Paroxysmal dyspnea ");
		chckbxParoxysmalDyspnea.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxParoxysmalDyspnea.setBounds(144, 200, 166, 23);
		page1.add(chckbxParoxysmalDyspnea);
		
		JCheckBox chckbxChestPain = new JCheckBox("chest pain ");
		chckbxChestPain.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxChestPain.setBounds(144, 226, 166, 23);
		page1.add(chckbxChestPain);
		
		JCheckBox chckbxAbdominalPain = new JCheckBox("Abdominal pain ");
		chckbxAbdominalPain.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxAbdominalPain.setBounds(144, 252, 166, 23);
		page1.add(chckbxAbdominalPain);
		
		JCheckBox chckbxContractions = new JCheckBox("contractions ");
		chckbxContractions.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxContractions.setBounds(144, 278, 166, 23);
		page1.add(chckbxContractions);
		
		JCheckBox chckbxBleeding = new JCheckBox("bleeding");
		chckbxBleeding.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxBleeding.setBounds(144, 304, 166, 23);
		page1.add(chckbxBleeding);
		
		JCheckBox chckbxSkinMottling = new JCheckBox("Skin mottling ");
		chckbxSkinMottling.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxSkinMottling.setBounds(312, 200, 113, 23);
		page1.add(chckbxSkinMottling);
		
		JCheckBox chckbxJointPain = new JCheckBox("Joint pain ");
		chckbxJointPain.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxJointPain.setBounds(312, 226, 113, 23);
		page1.add(chckbxJointPain);
		
		JCheckBox chckbxSwelling = new JCheckBox("swelling");
		chckbxSwelling.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxSwelling.setBounds(312, 252, 113, 23);
		page1.add(chckbxSwelling);
		
		JCheckBox chckbxBruisabiltiy = new JCheckBox("Bruisabiltiy ");
		chckbxBruisabiltiy.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxBruisabiltiy.setBounds(312, 278, 113, 23);
		page1.add(chckbxBruisabiltiy);
		
		JCheckBox chckbxClaudication = new JCheckBox("claudication ");
		chckbxClaudication.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxClaudication.setBounds(312, 304, 113, 23);
		page1.add(chckbxClaudication);
		
		JCheckBox chckbxParesthesia = new JCheckBox("paresthesia ");
		chckbxParesthesia.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxParesthesia.setBounds(427, 200, 109, 23);
		page1.add(chckbxParesthesia);
		
		JCheckBox chckbxOthers = new JCheckBox("Others");
		chckbxOthers.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxOthers.setBounds(427, 226, 109, 23);
		page1.add(chckbxOthers);
		
		txtfldAogByLmp = new JTextField();
		txtfldAogByLmp.setBounds(98, 70, 257, 20);
		page1.add(txtfldAogByLmp);
		txtfldAogByLmp.setColumns(10);
		
		txtfldAogByUtg = new JTextField();
		txtfldAogByUtg.setBounds(118, 97, 237, 18);
		page1.add(txtfldAogByUtg);
		txtfldAogByUtg.setColumns(10);
		
		txtfldLastWorkingImpressions = new JTextField();
		txtfldLastWorkingImpressions.setBounds(175, 123, 180, 20);
		page1.add(txtfldLastWorkingImpressions);
		txtfldLastWorkingImpressions.setColumns(10);
		
		txtfldMedications = new JTextField();
		txtfldMedications.setBounds(98, 152, 257, 20);
		page1.add(txtfldMedications);
		txtfldMedications.setColumns(10);
		
		JComboBox cmbbxMonthConsult = new JComboBox();
		cmbbxMonthConsult.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbbxMonthConsult.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		cmbbxMonthConsult.setBounds(118, 12, 63, 18);
		page1.add(cmbbxMonthConsult);
		
		JComboBox cmbbxDayConsult = new JComboBox();
		cmbbxDayConsult.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbbxDayConsult.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cmbbxDayConsult.setBounds(194, 12, 47, 18);
		page1.add(cmbbxDayConsult);
		
		JComboBox cmbbxYearConsult = new JComboBox();
		cmbbxYearConsult.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbbxYearConsult.setModel(new DefaultComboBoxModel(new String[] {"2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		cmbbxYearConsult.setBounds(251, 11, 59, 19);
		page1.add(cmbbxYearConsult);
		
		JComboBox cmbbxMonthLastSeen = new JComboBox();
		cmbbxMonthLastSeen.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		cmbbxMonthLastSeen.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbbxMonthLastSeen.setBounds(144, 38, 63, 18);
		page1.add(cmbbxMonthLastSeen);
		
		JComboBox cmbbxDayLastSeen = new JComboBox();
		cmbbxDayLastSeen.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cmbbxDayLastSeen.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbbxDayLastSeen.setBounds(217, 38, 47, 18);
		page1.add(cmbbxDayLastSeen);
		
		JComboBox cmbbxYearLastSeen = new JComboBox();
		cmbbxYearLastSeen.setModel(new DefaultComboBoxModel(new String[] {"2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		cmbbxYearLastSeen.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbbxYearLastSeen.setBounds(274, 38, 59, 19);
		page1.add(cmbbxYearLastSeen);
		
		txtfldOthers = new JTextField();
		txtfldOthers.setEditable(false);
		txtfldOthers.setBounds(437, 255, 95, 20);
		page1.add(txtfldOthers);
		txtfldOthers.setColumns(10);
		pages.add(page2);
		
		JLabel lblLatestLaboratoryResults = new JLabel("Latest Laboratory Results");
		lblLatestLaboratoryResults.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblLatestLaboratoryResults.setBounds(10, 10, 165, 21);
		page2.add(lblLatestLaboratoryResults);
		
		txtfldLatestLabResults = new JTextField();
		txtfldLatestLabResults.setBounds(185, 12, 165, 21);
		page2.add(txtfldLatestLabResults);
		txtfldLatestLabResults.setColumns(10);
		
		JLabel lblUtz = new JLabel("UTZ");
		lblUtz.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblUtz.setBounds(10, 37, 91, 21);
		page2.add(lblUtz);
		
		JLabel lblFetalWeight = new JLabel("Fetal Weight");
		lblFetalWeight.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblFetalWeight.setBounds(10, 64, 91, 21);
		page2.add(lblFetalWeight);
		
		JLabel lblPlacenta = new JLabel("Placenta");
		lblPlacenta.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPlacenta.setBounds(10, 91, 91, 21);
		page2.add(lblPlacenta);
		
		JLabel lblPresentation = new JLabel("Presentation");
		lblPresentation.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPresentation.setBounds(10, 118, 91, 21);
		page2.add(lblPresentation);
		
		JLabel lblAfivolume = new JLabel("AFI/Volume");
		lblAfivolume.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAfivolume.setBounds(10, 145, 91, 21);
		page2.add(lblAfivolume);
		
		JLabel lblDoppler = new JLabel("Doppler");
		lblDoppler.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblDoppler.setBounds(250, 37, 115, 21);
		page2.add(lblDoppler);
		
		JLabel lblUterine = new JLabel("Uterine (N) L/R");
		lblUterine.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblUterine.setBounds(250, 64, 115, 21);
		page2.add(lblUterine);
		
		JLabel lblUmbilical = new JLabel("Umbilical (N) L/R");
		lblUmbilical.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblUmbilical.setBounds(250, 91, 115, 21);
		page2.add(lblUmbilical);
		
		JLabel lblBpp = new JLabel("BPP");
		lblBpp.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblBpp.setBounds(250, 118, 115, 21);
		page2.add(lblBpp);
		
		txtfldUtz = new JTextField();
		txtfldUtz.setBounds(111, 37, 129, 21);
		page2.add(txtfldUtz);
		txtfldUtz.setColumns(10);
		
		txtfldFetalWeight = new JTextField();
		txtfldFetalWeight.setBounds(111, 66, 129, 21);
		page2.add(txtfldFetalWeight);
		txtfldFetalWeight.setColumns(10);
		
		txtfldPlacenta = new JTextField();
		txtfldPlacenta.setBounds(111, 93, 129, 21);
		page2.add(txtfldPlacenta);
		txtfldPlacenta.setColumns(10);
		
		txtfldPresentation = new JTextField();
		txtfldPresentation.setBounds(111, 120, 129, 19);
		page2.add(txtfldPresentation);
		txtfldPresentation.setColumns(10);
		
		txtfldAfiVolume = new JTextField();
		txtfldAfiVolume.setBounds(111, 147, 129, 21);
		page2.add(txtfldAfiVolume);
		txtfldAfiVolume.setColumns(10);
		
		txtfldDoppler = new JTextField();
		txtfldDoppler.setBounds(375, 39, 129, 21);
		page2.add(txtfldDoppler);
		txtfldDoppler.setColumns(10);
		
		txtfldUterine = new JTextField();
		txtfldUterine.setBounds(375, 66, 129, 21);
		page2.add(txtfldUterine);
		txtfldUterine.setColumns(10);
		
		txtfldUmbilical = new JTextField();
		txtfldUmbilical.setBounds(375, 93, 129, 21);
		page2.add(txtfldUmbilical);
		txtfldUmbilical.setColumns(10);
		
		txtfldBpp = new JTextField();
		txtfldBpp.setBounds(375, 120, 129, 19);
		page2.add(txtfldBpp);
		txtfldBpp.setColumns(10);
		
		JLabel lblPhysicalExamination = new JLabel("PHYSICAL EXAMINATION");
		lblPhysicalExamination.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPhysicalExamination.setBounds(10, 175, 165, 21);
		page2.add(lblPhysicalExamination);
		
		JLabel lblHtwt = new JLabel("HT/WT");
		lblHtwt.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblHtwt.setBounds(10, 202, 91, 21);
		page2.add(lblHtwt);
		
		JLabel lblBphrrr = new JLabel("BP/HR/RR");
		lblBphrrr.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblBphrrr.setBounds(10, 229, 91, 21);
		page2.add(lblBphrrr);
		
		JLabel lblGeneral = new JLabel("General");
		lblGeneral.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblGeneral.setBounds(10, 256, 91, 21);
		page2.add(lblGeneral);
		
		JLabel lblHeadfacehair = new JLabel("Head/Face/Hair");
		lblHeadfacehair.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblHeadfacehair.setBounds(217, 233, 115, 21);
		page2.add(lblHeadfacehair);
		
		txtfldHtWt = new JTextField();
		txtfldHtWt.setBounds(106, 207, 86, 20);
		page2.add(txtfldHtWt);
		txtfldHtWt.setColumns(10);
		
		txtfldBpHrRr = new JTextField();
		txtfldBpHrRr.setBounds(106, 231, 86, 20);
		page2.add(txtfldBpHrRr);
		txtfldBpHrRr.setColumns(10);
		
		txtfldGeneral = new JTextField();
		txtfldGeneral.setBounds(106, 256, 86, 20);
		page2.add(txtfldGeneral);
		txtfldGeneral.setColumns(10);
		
		JCheckBox chckbxAlopecia = new JCheckBox("Alopecia");
		chckbxAlopecia.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxAlopecia.setBounds(217, 261, 97, 23);
		page2.add(chckbxAlopecia);
		
		JCheckBox chckbxMalarRash_1 = new JCheckBox("Malar Rash");
		chckbxMalarRash_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxMalarRash_1.setBounds(316, 261, 99, 23);
		page2.add(chckbxMalarRash_1);
		
		JCheckBox chckbxDiscoidRash = new JCheckBox("Discoid Rash");
		chckbxDiscoidRash.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxDiscoidRash.setBounds(417, 261, 119, 23);
		page2.add(chckbxDiscoidRash);
		
		JLabel lblEyes = new JLabel("Eyes");
		lblEyes.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblEyes.setBounds(217, 287, 97, 21);
		page2.add(lblEyes);
		
		JLabel lblSclerae = new JLabel("Sclerae");
		lblSclerae.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSclerae.setBounds(217, 307, 97, 21);
		page2.add(lblSclerae);
		
		JLabel lblConjunctivae = new JLabel("Conjunctivae");
		lblConjunctivae.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblConjunctivae.setBounds(217, 328, 97, 19);
		page2.add(lblConjunctivae);
		
		JCheckBox chckbxAnicteric = new JCheckBox("anicteric ");
		chckbxAnicteric.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxAnicteric.setBounds(316, 306, 97, 23);
		page2.add(chckbxAnicteric);
		
		JCheckBox chckbxIcteric = new JCheckBox("icteric");
		chckbxIcteric.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxIcteric.setBounds(415, 306, 97, 23);
		page2.add(chckbxIcteric);
		
		JCheckBox chckbxPink = new JCheckBox("pink ");
		chckbxPink.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxPink.setBounds(316, 326, 97, 23);
		page2.add(chckbxPink);
		
		JCheckBox chckbxPale = new JCheckBox("pale");
		chckbxPale.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxPale.setBounds(415, 326, 97, 23);
		page2.add(chckbxPale);
		
		JLabel lblEars = new JLabel("Ears");
		lblEars.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblEars.setBounds(10, 275, 91, 21);
		page2.add(lblEars);
		
		JLabel lblNose = new JLabel("Nose");
		lblNose.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNose.setBounds(10, 299, 91, 21);
		page2.add(lblNose);
		
		JLabel lblOralCavity = new JLabel("Oral Cavity");
		lblOralCavity.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblOralCavity.setBounds(10, 325, 91, 24);
		page2.add(lblOralCavity);
		
		txtfldNose = new JTextField();
		txtfldNose.setBounds(106, 301, 86, 20);
		page2.add(txtfldNose);
		txtfldNose.setColumns(10);
		
		txtfldOralCavity = new JTextField();
		txtfldOralCavity.setBounds(106, 327, 86, 21);
		page2.add(txtfldOralCavity);
		txtfldOralCavity.setColumns(10);
		
		txtfldEars = new JTextField();
		txtfldEars.setBounds(106, 278, 86, 20);
		page2.add(txtfldEars);
		txtfldEars.setColumns(10);
		
		JLabel lblThroat = new JLabel("Throat");
		lblThroat.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblThroat.setBounds(217, 202, 43, 21);
		page2.add(lblThroat);
		
		txtfldThroat = new JTextField();
		txtfldThroat.setColumns(10);
		txtfldThroat.setBounds(264, 204, 86, 20);
		page2.add(txtfldThroat);
		pages.add(page3);
		
		JLabel lblNeckThyroid = new JLabel("Neck, Thyroid");
		lblNeckThyroid.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNeckThyroid.setBounds(10, 10, 114, 21);
		page3.add(lblNeckThyroid);
		
		JCheckBox chckbxNormal = new JCheckBox("Normal");
		chckbxNormal.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxNormal.setBounds(130, 10, 97, 23);
		page3.add(chckbxNormal);
		
		JCheckBox chckbxThyromegaly = new JCheckBox("Thyromegaly");
		chckbxThyromegaly.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxThyromegaly.setBounds(229, 10, 141, 23);
		page3.add(chckbxThyromegaly);
		
		JLabel lblLymphNodes = new JLabel("Lymph nodes");
		lblLymphNodes.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblLymphNodes.setBounds(10, 37, 114, 21);
		page3.add(lblLymphNodes);
		
		JCheckBox chckbxNormal_1 = new JCheckBox("Normal");
		chckbxNormal_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxNormal_1.setBounds(130, 36, 97, 23);
		page3.add(chckbxNormal_1);
		
		JCheckBox chckbxEnlarged = new JCheckBox("Enlarged");
		chckbxEnlarged.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxEnlarged.setBounds(229, 36, 141, 23);
		page3.add(chckbxEnlarged);
		
		JLabel lblChestAndLungs = new JLabel("Chest and Lungs");
		lblChestAndLungs.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblChestAndLungs.setBounds(10, 64, 114, 21);
		page3.add(lblChestAndLungs);
		
		JCheckBox chckbxEqualChestExpansion = new JCheckBox("Equal chest expansion ");
		chckbxEqualChestExpansion.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxEqualChestExpansion.setBounds(130, 62, 177, 23);
		page3.add(chckbxEqualChestExpansion);
		
		JCheckBox chckbxClearBreathSounds = new JCheckBox("clear breath sounds ");
		chckbxClearBreathSounds.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxClearBreathSounds.setBounds(130, 88, 177, 23);
		page3.add(chckbxClearBreathSounds);
		
		JCheckBox chckbxRales = new JCheckBox("rales ");
		chckbxRales.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxRales.setBounds(309, 62, 103, 21);
		page3.add(chckbxRales);
		
		JCheckBox chckbxWheeze = new JCheckBox("wheeze");
		chckbxWheeze.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxWheeze.setBounds(309, 88, 103, 21);
		page3.add(chckbxWheeze);
		
		JLabel lblHeart = new JLabel("Heart");
		lblHeart.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblHeart.setBounds(10, 118, 114, 21);
		page3.add(lblHeart);
		
		JCheckBox chckbxRegularRhythm = new JCheckBox("Regular rhythm");
		chckbxRegularRhythm.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxRegularRhythm.setBounds(130, 114, 177, 21);
		page3.add(chckbxRegularRhythm);
		
		JCheckBox chckbxMurmur = new JCheckBox("Murmur");
		chckbxMurmur.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxMurmur.setBounds(309, 112, 103, 21);
		page3.add(chckbxMurmur);
		
		JLabel lblAbdomen = new JLabel("Abdomen");
		lblAbdomen.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAbdomen.setBounds(10, 145, 114, 21);
		page3.add(lblAbdomen);
		
		JCheckBox chckbxNormal_2 = new JCheckBox("Normal");
		chckbxNormal_2.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxNormal_2.setBounds(130, 143, 97, 22);
		page3.add(chckbxNormal_2);
		
		JCheckBox chckbxHepatomegaly = new JCheckBox("hepatomegaly ");
		chckbxHepatomegaly.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxHepatomegaly.setBounds(227, 145, 125, 21);
		page3.add(chckbxHepatomegaly);
		
		JCheckBox chckbxSplenomegaly = new JCheckBox("splenomegaly ");
		chckbxSplenomegaly.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxSplenomegaly.setBounds(130, 168, 123, 21);
		page3.add(chckbxSplenomegaly);
		
		JCheckBox chckbxMass = new JCheckBox("mass ");
		chckbxMass.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxMass.setBounds(255, 167, 97, 23);
		page3.add(chckbxMass);
		
		JCheckBox chckbxTender = new JCheckBox("tender");
		chckbxTender.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxTender.setBounds(354, 144, 97, 23);
		page3.add(chckbxTender);
		
		JLabel lblExtremities = new JLabel("Extremities");
		lblExtremities.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblExtremities.setBounds(10, 196, 114, 21);
		page3.add(lblExtremities);
		
		JCheckBox chckbxPink_1 = new JCheckBox("Pink ");
		chckbxPink_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxPink_1.setBounds(130, 192, 87, 23);
		page3.add(chckbxPink_1);
		
		JCheckBox chckbxPale_1 = new JCheckBox("Pale");
		chckbxPale_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxPale_1.setBounds(219, 192, 95, 23);
		page3.add(chckbxPale_1);
		
		JCheckBox chckbxCyanotic = new JCheckBox("cyanotic ");
		chckbxCyanotic.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxCyanotic.setBounds(130, 218, 87, 23);
		page3.add(chckbxCyanotic);
		
		JCheckBox chckbxGangrene = new JCheckBox("gangrene ");
		chckbxGangrene.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxGangrene.setBounds(219, 218, 95, 23);
		page3.add(chckbxGangrene);
		
		JCheckBox chckbxWarm = new JCheckBox("warm ");
		chckbxWarm.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxWarm.setBounds(316, 194, 67, 23);
		page3.add(chckbxWarm);
		
		JCheckBox chckbxCold = new JCheckBox("cold ");
		chckbxCold.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxCold.setBounds(316, 220, 67, 23);
		page3.add(chckbxCold);
		
		JCheckBox chckbxEdema = new JCheckBox("edema ");
		chckbxEdema.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxEdema.setBounds(385, 196, 121, 23);
		page3.add(chckbxEdema);
		
		JCheckBox chckbxJointSwelling = new JCheckBox("joint swelling");
		chckbxJointSwelling.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxJointSwelling.setBounds(385, 220, 121, 23);
		page3.add(chckbxJointSwelling);
		
		JLabel lblPulses = new JLabel("Pulses");
		lblPulses.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPulses.setBounds(10, 248, 114, 21);
		page3.add(lblPulses);
		
		JCheckBox chckbxFull = new JCheckBox("Full ");
		chckbxFull.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxFull.setBounds(130, 244, 87, 23);
		page3.add(chckbxFull);
		
		JCheckBox chckbxEqual = new JCheckBox("equal ");
		chckbxEqual.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxEqual.setBounds(219, 244, 95, 23);
		page3.add(chckbxEqual);
		
		JCheckBox chckbxWeak = new JCheckBox("weak ");
		chckbxWeak.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxWeak.setBounds(316, 246, 67, 23);
		page3.add(chckbxWeak);
		
		JCheckBox chckbxAbsent = new JCheckBox("absent");
		chckbxAbsent.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxAbsent.setBounds(385, 248, 121, 23);
		page3.add(chckbxAbsent);
		
		JLabel lblSkin = new JLabel("Skin");
		lblSkin.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSkin.setBounds(10, 271, 114, 21);
		page3.add(lblSkin);
		
		JCheckBox chckbxNormal_3 = new JCheckBox("Normal ");
		chckbxNormal_3.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxNormal_3.setBounds(130, 270, 87, 23);
		page3.add(chckbxNormal_3);
		
		JCheckBox chckbxLivedoReticularis = new JCheckBox("livedo reticularis ");
		chckbxLivedoReticularis.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxLivedoReticularis.setBounds(219, 270, 141, 23);
		page3.add(chckbxLivedoReticularis);
		
		pages.add(page4);
		pages.add(page5);
		
		JLabel lblReferrals = new JLabel("Referrals");
		lblReferrals.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblReferrals.setBounds(10, 11, 112, 19);
		page5.add(lblReferrals);
		
		txtfldReferrals = new JTextField();
		txtfldReferrals.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldReferrals.setBounds(10, 35, 164, 26);
		page5.add(txtfldReferrals);
		txtfldReferrals.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnAdd.setBounds(184, 34, 78, 26);
		page5.add(btnAdd);
		
		JTextArea txtarReferrals = new JTextArea();
		txtarReferrals.setBounds(10, 72, 252, 80);
		page5.add(txtarReferrals);
		
		JLabel lblNextFfupOn = new JLabel("Next ffup on");
		lblNextFfupOn.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNextFfupOn.setBounds(10, 179, 88, 26);
		page5.add(lblNextFfupOn);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Century Gothic", Font.BOLD, 13));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		comboBox_4.setBounds(108, 179, 66, 26);
		page5.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Century Gothic", Font.BOLD, 13));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_5.setBounds(185, 180, 43, 25);
		page5.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Century Gothic", Font.BOLD, 13));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		comboBox_6.setBounds(238, 179, 59, 26);
		page5.add(comboBox_6);
		
		JLabel lblExaminedBy = new JLabel("Examined by");
		lblExaminedBy.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblExaminedBy.setBounds(10, 233, 88, 26);
		page5.add(lblExaminedBy);
		
		txtfldExaminedBy = new JTextField();
		txtfldExaminedBy.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldExaminedBy.setBounds(108, 233, 189, 26);
		page5.add(txtfldExaminedBy);
		txtfldExaminedBy.setColumns(10);
		
		JLabel lblNeurologic = new JLabel("Neurologic");
		lblNeurologic.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNeurologic.setBounds(82, 0, 92, 25);
		page4.add(lblNeurologic);
		
		JLabel lblGcs = new JLabel("GCS");
		lblGcs.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblGcs.setBounds(20, 29, 82, 14);
		page4.add(lblGcs);
		
		JLabel lblE = new JLabel("E");
		lblE.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblE.setBounds(30, 54, 20, 14);
		page4.add(lblE);
		
		txtfldE = new JTextField();
		txtfldE.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldE.setBounds(40, 51, 20, 20);
		page4.add(txtfldE);
		txtfldE.setColumns(10);
		
		JLabel lblV = new JLabel("V");
		lblV.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblV.setBounds(68, 54, 12, 14);
		page4.add(lblV);
		
		txtfldV = new JTextField();
		txtfldV.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldV.setColumns(10);
		txtfldV.setBounds(82, 51, 20, 20);
		page4.add(txtfldV);
		
		JLabel lblM = new JLabel("M");
		lblM.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblM.setBounds(109, 54, 12, 14);
		page4.add(lblM);
		
		txtfldM = new JTextField();
		txtfldM.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldM.setColumns(10);
		txtfldM.setBounds(122, 51, 20, 20);
		page4.add(txtfldM);
		
		JLabel lblCranialNerves = new JLabel("Cranial Nerves");
		lblCranialNerves.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblCranialNerves.setBounds(20, 79, 101, 14);
		page4.add(lblCranialNerves);
		
		JLabel lblMotor = new JLabel("Motor");
		lblMotor.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblMotor.setBounds(20, 131, 40, 20);
		page4.add(lblMotor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Century Gothic", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5/5", "4/5", "3/5", "2/5", "1/5"}));
		comboBox.setBounds(70, 130, 56, 23);
		page4.add(comboBox);
		
		JLabel lblSensory = new JLabel("Sensory");
		lblSensory.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblSensory.setBounds(20, 164, 56, 19);
		page4.add(lblSensory);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Century Gothic", Font.BOLD, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Deficit"}));
		comboBox_1.setBounds(88, 162, 74, 23);
		page4.add(comboBox_1);
		
		JLabel labelPercent = new JLabel("%");
		labelPercent.setFont(new Font("Century Gothic", Font.BOLD, 13));
		labelPercent.setBounds(172, 162, 12, 23);
		page4.add(labelPercent);
		
		txtfldSensoryPercent = new JTextField();
		txtfldSensoryPercent.setEditable(false);
		txtfldSensoryPercent.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtfldSensoryPercent.setBounds(194, 162, 31, 23);
		page4.add(txtfldSensoryPercent);
		txtfldSensoryPercent.setColumns(10);
		
		JLabel lblMeningeals = new JLabel("Meningeals");
		lblMeningeals.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblMeningeals.setBounds(20, 190, 82, 23);
		page4.add(lblMeningeals);
		
		JCheckBox chckbxSuppleNeck = new JCheckBox("Supple Neck");
		chckbxSuppleNeck.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxSuppleNeck.setBounds(50, 219, 112, 23);
		page4.add(chckbxSuppleNeck);
		
		JCheckBox chckbxKernigs = new JCheckBox("Kernig's");
		chckbxKernigs.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxKernigs.setBounds(50, 248, 112, 23);
		page4.add(chckbxKernigs);
		
		JCheckBox chckbxBrudzinksi = new JCheckBox("Brudzinksi");
		chckbxBrudzinksi.setFont(new Font("Century Gothic", Font.BOLD, 13));
		chckbxBrudzinksi.setBounds(50, 274, 112, 20);
		page4.add(chckbxBrudzinksi);
		
		JLabel lblAutonomics = new JLabel("Autonomics");
		lblAutonomics.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblAutonomics.setBounds(20, 298, 82, 20);
		page4.add(lblAutonomics);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Century Gothic", Font.BOLD, 13));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Abnormal"}));
		comboBox_2.setBounds(58, 329, 112, 20);
		page4.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Intact", "Abnormal"}));
		comboBox_3.setBounds(30, 99, 92, 20);
		page4.add(comboBox_3);
		
		JLabel lblPresentWorkingImpression = new JLabel("Present Working Impression");
		lblPresentWorkingImpression.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresentWorkingImpression.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPresentWorkingImpression.setBounds(255, 29, 279, 25);
		page4.add(lblPresentWorkingImpression);
		
		JTextArea txtarPresentWorking = new JTextArea();
		txtarPresentWorking.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtarPresentWorking.setBounds(255, 54, 279, 118);
		page4.add(txtarPresentWorking);
		
		JLabel lblDiagonostics = new JLabel("Diagonostics");
		lblDiagonostics.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiagonostics.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblDiagonostics.setBounds(255, 189, 279, 25);
		page4.add(lblDiagonostics);
		
		JTextArea txtarDiagnostics = new JTextArea();
		txtarDiagnostics.setFont(new Font("Century Gothic", Font.BOLD, 13));
		txtarDiagnostics.setBounds(255, 220, 279, 118);
		page4.add(txtarDiagnostics);
		
		JButton btnPage4 = new JButton("4");
		GridBagConstraints gbc_btnPage4 = new GridBagConstraints();
		gbc_btnPage4.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage4.gridx = 0;
		gbc_btnPage4.gridy = 6;
		contentPane.add(btnPage4, gbc_btnPage4);
		
		JButton btnPage5 = new JButton("5");
		GridBagConstraints gbc_btnPage5 = new GridBagConstraints();
		gbc_btnPage5.insets = new Insets(0, 0, 5, 5);
		gbc_btnPage5.gridx = 0;
		gbc_btnPage5.gridy = 7;
		contentPane.add(btnPage5, gbc_btnPage5);
		
		ArrayList<JButton> nav = new ArrayList<JButton>();
		nav.add(btnPage1);
		nav.add(btnPage2);
		nav.add(btnPage3);
		nav.add(btnPage4);
		nav.add(btnPage5);
		
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
