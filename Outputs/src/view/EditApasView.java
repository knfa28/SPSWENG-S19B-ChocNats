package view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class EditApasView extends javax.swing.JFrame {
    private boolean peForm = false;
    
    public EditApasView() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);  
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        APASLabel = new javax.swing.JLabel();
        cseNumLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateData = new javax.swing.JLabel();
        caseNumData = new javax.swing.JLabel();
        patientIDLabel = new javax.swing.JLabel();
        patientIDData = new javax.swing.JLabel();
        complaintLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complaintTextArea = new javax.swing.JTextArea();
        illnessLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        illnessTextArea = new javax.swing.JTextArea();
        systemsReviewLabel = new javax.swing.JLabel();
        blurringCheck = new javax.swing.JCheckBox();
        photoCheck = new javax.swing.JCheckBox();
        bruiseCheck = new javax.swing.JCheckBox();
        malarCheck = new javax.swing.JCheckBox();
        headacheCheck = new javax.swing.JCheckBox();
        ulcerCheck = new javax.swing.JCheckBox();
        chestCheck = new javax.swing.JCheckBox();
        mottlingCheck = new javax.swing.JCheckBox();
        PDcheck = new javax.swing.JCheckBox();
        abdominalCheck = new javax.swing.JCheckBox();
        contractionsCheck = new javax.swing.JCheckBox();
        bleedingCheck = new javax.swing.JCheckBox();
        jointCheck = new javax.swing.JCheckBox();
        paresthesiaCheck = new javax.swing.JCheckBox();
        claudicationCheck = new javax.swing.JCheckBox();
        othersCheck = new javax.swing.JCheckBox();
        othersTxtbx = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        birthHistoLabel = new javax.swing.JLabel();
        aogLabel = new javax.swing.JLabel();
        deliveryLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        complicationLabel = new javax.swing.JLabel();
        catherizationLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        prenatalLabel = new javax.swing.JLabel();
        maternalUseLabel = new javax.swing.JLabel();
        maternalIllnessLabel = new javax.swing.JLabel();
        termCheck = new javax.swing.JCheckBox();
        pretermCheck = new javax.swing.JCheckBox();
        estimateAOGLabel = new javax.swing.JLabel();
        estimateAOGTxtbx = new javax.swing.JTextField();
        nsvdCheck = new javax.swing.JCheckBox();
        forcepsCheck = new javax.swing.JCheckBox();
        csCheck = new javax.swing.JCheckBox();
        hospitalCheck = new javax.swing.JCheckBox();
        lyingCheck = new javax.swing.JCheckBox();
        homeCheck = new javax.swing.JCheckBox();
        homeTxtbx = new javax.swing.JTextField();
        noCompCheck = new javax.swing.JCheckBox();
        yesCompCheck = new javax.swing.JCheckBox();
        yesCompTxtbx = new javax.swing.JTextField();
        noUCCheck = new javax.swing.JCheckBox();
        yesUCCheck = new javax.swing.JCheckBox();
        gLabel = new javax.swing.JLabel();
        gTxtbx = new javax.swing.JTextField();
        pLabel = new javax.swing.JLabel();
        pTxtbx = new javax.swing.JTextField();
        xVisitLabel = new javax.swing.JLabel();
        prenatalTxtbx = new javax.swing.JTextField();
        alcoholCheck = new javax.swing.JCheckBox();
        drugsCheck = new javax.swing.JCheckBox();
        geneticCheck = new javax.swing.JCheckBox();
        infectiousCheck = new javax.swing.JCheckBox();
        autoimmuneCheck = new javax.swing.JCheckBox();
        clottingCheck = new javax.swing.JCheckBox();
        maternalOthersCheck = new javax.swing.JCheckBox();
        maternalOthersTxtbx = new javax.swing.JTextField();
        ageSpinner = new javax.swing.JSpinner();
        prenatalSpinner = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        immunoLabel = new javax.swing.JLabel();
        bcgCheck = new javax.swing.JCheckBox();
        dptCheck = new javax.swing.JCheckBox();
        opvCheck = new javax.swing.JCheckBox();
        measlesCheck = new javax.swing.JCheckBox();
        hibCheck = new javax.swing.JCheckBox();
        hepbCheck = new javax.swing.JCheckBox();
        hepaCheck = new javax.swing.JCheckBox();
        varicellaCheck = new javax.swing.JCheckBox();
        rabiesCheck = new javax.swing.JCheckBox();
        tetanusCheck = new javax.swing.JCheckBox();
        immunoOthersCheck = new javax.swing.JCheckBox();
        immunoOthersTxtbx = new javax.swing.JTextField();
        dptDosesLabel = new javax.swing.JLabel();
        opcDosesLabel = new javax.swing.JLabel();
        hepbDosesLabel = new javax.swing.JLabel();
        hepaDosesLabel = new javax.swing.JLabel();
        dptSpinner = new javax.swing.JSpinner();
        opvSpinner = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        nutritionalHistoLabel = new javax.swing.JLabel();
        breastCheck = new javax.swing.JCheckBox();
        formulaCheck = new javax.swing.JCheckBox();
        solidsCheck = new javax.swing.JCheckBox();
        preferenceLabel = new javax.swing.JLabel();
        breastSpinner = new javax.swing.JSpinner();
        breastMonthLabel = new javax.swing.JLabel();
        preferenceTxtbx = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        growthLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rollsCheck = new javax.swing.JCheckBox();
        sitsCheck = new javax.swing.JCheckBox();
        standsCheck = new javax.swing.JCheckBox();
        walksCheck = new javax.swing.JCheckBox();
        stepsCheck = new javax.swing.JCheckBox();
        liftCheck = new javax.swing.JCheckBox();
        gm1Label = new javax.swing.JLabel();
        gm2Label = new javax.swing.JLabel();
        gm3Label = new javax.swing.JLabel();
        gm4Label = new javax.swing.JLabel();
        gm5Label = new javax.swing.JLabel();
        gm6Label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ps1Label = new javax.swing.JLabel();
        ps2Label = new javax.swing.JLabel();
        ps3Label = new javax.swing.JLabel();
        ps4Label = new javax.swing.JLabel();
        ps5Label = new javax.swing.JLabel();
        ps6Label = new javax.swing.JLabel();
        faceCheck = new javax.swing.JCheckBox();
        smilesCheck = new javax.swing.JCheckBox();
        wavesCheck = new javax.swing.JCheckBox();
        imitatesCheck = new javax.swing.JCheckBox();
        namesCheck = new javax.swing.JCheckBox();
        dressesCheck = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        respondsCheck = new javax.swing.JCheckBox();
        coosCheck = new javax.swing.JCheckBox();
        laughsCheck = new javax.swing.JCheckBox();
        babblesCheck = new javax.swing.JCheckBox();
        damaCheck = new javax.swing.JCheckBox();
        picturesCheck = new javax.swing.JCheckBox();
        speechCheck = new javax.swing.JCheckBox();
        bodyPartsCheck = new javax.swing.JCheckBox();
        l1Label = new javax.swing.JLabel();
        l2Label = new javax.swing.JLabel();
        l3Label = new javax.swing.JLabel();
        l4Label = new javax.swing.JLabel();
        l5Label = new javax.swing.JLabel();
        l6Label = new javax.swing.JLabel();
        l7Label = new javax.swing.JLabel();
        l8Label = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        midlineCheck = new javax.swing.JCheckBox();
        rattleCheck = new javax.swing.JCheckBox();
        reachesObjectsCheck = new javax.swing.JCheckBox();
        scubblesCheck = new javax.swing.JCheckBox();
        drawsCheck = new javax.swing.JCheckBox();
        fm1Label = new javax.swing.JLabel();
        fm2Label = new javax.swing.JLabel();
        fm3Label = new javax.swing.JLabel();
        fm4Label = new javax.swing.JLabel();
        fm5Label = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        medicalHistoLabel = new javax.swing.JLabel();
        hypertensionCheck = new javax.swing.JCheckBox();
        diabetesCheck = new javax.swing.JCheckBox();
        anemiaCheck = new javax.swing.JCheckBox();
        sleCheck = new javax.swing.JCheckBox();
        cancerCheck = new javax.swing.JCheckBox();
        ciCheck = new javax.swing.JCheckBox();
        hdCheck = new javax.swing.JCheckBox();
        haCheck = new javax.swing.JCheckBox();
        thromboCheck = new javax.swing.JCheckBox();
        strokeCheck = new javax.swing.JCheckBox();
        cvCheck = new javax.swing.JCheckBox();
        ptbCheck = new javax.swing.JCheckBox();
        medicationsCheck = new javax.swing.JCheckBox();
        ptbTreatmentCheck = new javax.swing.JCheckBox();
        veinsCheck = new javax.swing.JCheckBox();
        idiopathicCheck = new javax.swing.JCheckBox();
        surgeryCheck = new javax.swing.JCheckBox();
        hospitalizationCheck = new javax.swing.JCheckBox();
        ptbRegimenTxtbx = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ptbDurationTxtbx = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicationTxtbx = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        surgeryTxtbx = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        hospitalizationTxtbx = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        familyHistoLabel = new javax.swing.JLabel();
        famHypertensionCheck = new javax.swing.JCheckBox();
        famDiabetesCheck = new javax.swing.JCheckBox();
        famHDCheck = new javax.swing.JCheckBox();
        famSLECheck = new javax.swing.JCheckBox();
        famCancerCheck = new javax.swing.JCheckBox();
        famPTBCheck = new javax.swing.JCheckBox();
        famStrokeCheck = new javax.swing.JCheckBox();
        youngStrokeCheck = new javax.swing.JCheckBox();
        famClottingCheck = new javax.swing.JCheckBox();
        famKidneyCheck = new javax.swing.JCheckBox();
        famThyroidCheck = new javax.swing.JCheckBox();
        famOBCheck = new javax.swing.JCheckBox();
        siblingDeathCheck = new javax.swing.JCheckBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        siblingDeathTxtbx = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        personalHistoLabel = new javax.swing.JLabel();
        smokerCheck = new javax.swing.JCheckBox();
        alcoholicCheck = new javax.swing.JCheckBox();
        drugCheck = new javax.swing.JCheckBox();
        ocpCheck = new javax.swing.JCheckBox();
        statusLabel = new javax.swing.JLabel();
        educationLabel = new javax.swing.JLabel();
        occupationLabel = new javax.swing.JLabel();
        siblingsLabel = new javax.swing.JLabel();
        childrenLabel = new javax.swing.JLabel();
        smokerSpinner = new javax.swing.JSpinner();
        smokerLabel = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox();
        educationTxtbx = new javax.swing.JTextField();
        occupationTxtbx = new javax.swing.JTextField();
        siblingsSpinner = new javax.swing.JSpinner();
        childrenSpinner = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        workupLabel = new javax.swing.JLabel();
        cbcCheck = new javax.swing.JCheckBox();
        bunCheck = new javax.swing.JCheckBox();
        esrCheck = new javax.swing.JCheckBox();
        urinalysisCheck = new javax.swing.JCheckBox();
        cxrCheck = new javax.swing.JCheckBox();
        ecgCheck = new javax.swing.JCheckBox();
        ctScanCheck = new javax.swing.JCheckBox();
        echoCardioCheck = new javax.swing.JCheckBox();
        ptCheck = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        kctCheck = new javax.swing.JCheckBox();
        acaCheck = new javax.swing.JCheckBox();
        antib2Check = new javax.swing.JCheckBox();
        utzCheck = new javax.swing.JCheckBox();
        arterialDopplerCheck = new javax.swing.JCheckBox();
        duplexScanCheck = new javax.swing.JCheckBox();
        anaCheck = new javax.swing.JCheckBox();
        proteinCCheck = new javax.swing.JCheckBox();
        proteinSCheck = new javax.swing.JCheckBox();
        bloodSmearCheck = new javax.swing.JCheckBox();
        coombsCheck = new javax.swing.JCheckBox();
        wokupOthersCheck = new javax.swing.JCheckBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        workupOthersTxtbx = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        cbcDiaCheck = new javax.swing.JCheckBox();
        bunDiaCheck = new javax.swing.JCheckBox();
        esrDiaCheck = new javax.swing.JCheckBox();
        urinalysisDiaCheck = new javax.swing.JCheckBox();
        cxrDiaCheck = new javax.swing.JCheckBox();
        ecgDiaCheck = new javax.swing.JCheckBox();
        ctScanDiaCheck = new javax.swing.JCheckBox();
        wokupOthersDiaCheck = new javax.swing.JCheckBox();
        jScrollPane9 = new javax.swing.JScrollPane();
        workupOthersDiaTxtbx = new javax.swing.JTextArea();
        utzDiaCheck = new javax.swing.JCheckBox();
        antib2DiaCheck = new javax.swing.JCheckBox();
        acaDiaCheck = new javax.swing.JCheckBox();
        kctDiaCheck = new javax.swing.JCheckBox();
        apttDiaCheck = new javax.swing.JCheckBox();
        ptDiaCheck = new javax.swing.JCheckBox();
        echoCardioDiaCheck = new javax.swing.JCheckBox();
        arterialDopplerDiaCheck = new javax.swing.JCheckBox();
        duplexScanDiaCheck = new javax.swing.JCheckBox();
        anaDiaCheck = new javax.swing.JCheckBox();
        proteinCDiaCheck = new javax.swing.JCheckBox();
        proteinSDiaCheck = new javax.swing.JCheckBox();
        coombsDiaCheck = new javax.swing.JCheckBox();
        bloodSmearDiaCheck = new javax.swing.JCheckBox();
        diagnosticsLabel = new javax.swing.JLabel();
        therapeuticsLabel = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        therapeuticsTxtbx = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caseNum2Label = new javax.swing.JLabel();
        patientID2Label = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        summaryList = new javax.swing.JList();
        recordDateLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        discardBtn = new javax.swing.JButton();
        addPEBtn = new javax.swing.JButton();
        caseNum2Data = new javax.swing.JLabel();
        patientID2Data = new javax.swing.JLabel();
        recordDate2Data = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        checkupLabel = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        viewPeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        APASLabel.setText("APAS Form:");

        cseNumLabel.setText("Case Number: ");

        dateLabel.setText("Date:");

        dateData.setText("[dd/MM/yyyy]");

        caseNumData.setText("[caseNum]");

        patientIDLabel.setText("Patient ID:");

        patientIDData.setText("[patientID]");

        complaintLabel.setText("Chief Complaint:");

        complaintTextArea.setColumns(20);
        complaintTextArea.setRows(5);
        jScrollPane1.setViewportView(complaintTextArea);

        illnessLabel.setText("History of Present Illness:");

        illnessTextArea.setColumns(20);
        illnessTextArea.setRows(5);
        jScrollPane2.setViewportView(illnessTextArea);

        systemsReviewLabel.setText("Review of Systems:");

        blurringCheck.setText("Blurring of Vision");

        photoCheck.setText("Photosensitivity");

        bruiseCheck.setText("Easily Bruised");

        malarCheck.setText("Malar Rash");

        headacheCheck.setText("Headache");

        ulcerCheck.setText("Oral Ulcers");

        chestCheck.setText("Chest Pain");

        mottlingCheck.setText("Skin Mottling");

        PDcheck.setText("Paroxysmal dyspnea");

        abdominalCheck.setText("Abdominal Pain");

        contractionsCheck.setText("Contractions");

        bleedingCheck.setText("Bleeding");

        jointCheck.setText("Joint Pain/Swelling");

        paresthesiaCheck.setText("Paresthesia");

        claudicationCheck.setText("Claudication");

        othersCheck.setText("Others:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(APASLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateData))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(complaintLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(illnessLabel)
                                .addGap(212, 212, 212)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(headacheCheck)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(blurringCheck)
                                            .addComponent(systemsReviewLabel)
                                            .addComponent(bruiseCheck)
                                            .addComponent(photoCheck))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(malarCheck)
                                            .addComponent(ulcerCheck)
                                            .addComponent(mottlingCheck)
                                            .addComponent(chestCheck))))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDcheck)
                                    .addComponent(abdominalCheck)
                                    .addComponent(contractionsCheck)
                                    .addComponent(bleedingCheck))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(claudicationCheck)
                                            .addComponent(paresthesiaCheck)
                                            .addComponent(jointCheck))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(othersCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(othersTxtbx))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cseNumLabel)
                                            .addComponent(patientIDLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patientIDData)
                                            .addComponent(caseNumData)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APASLabel)
                    .addComponent(dateLabel)
                    .addComponent(dateData))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cseNumLabel)
                            .addComponent(caseNumData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientIDLabel)
                            .addComponent(patientIDData))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(illnessLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(complaintLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(systemsReviewLabel)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headacheCheck)
                    .addComponent(ulcerCheck)
                    .addComponent(PDcheck)
                    .addComponent(jointCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blurringCheck)
                    .addComponent(malarCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abdominalCheck)
                    .addComponent(paresthesiaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chestCheck)
                    .addComponent(contractionsCheck)
                    .addComponent(claudicationCheck)
                    .addComponent(photoCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bruiseCheck)
                    .addComponent(mottlingCheck)
                    .addComponent(bleedingCheck)
                    .addComponent(othersCheck)
                    .addComponent(othersTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(1) General", jPanel1);

        birthHistoLabel.setText("For Pediatric APAS:");

        aogLabel.setText("AOG:");

        deliveryLabel.setText("Type of Delivery:");

        locationLabel.setText("Location:");

        complicationLabel.setText("Complications:");

        catherizationLabel.setText("Umbilical Catherization:");

        ageLabel.setText("Maternal Age:");

        prenatalLabel.setText("Prenatal Care:");

        maternalUseLabel.setText("Maternal use of:");

        maternalIllnessLabel.setText("Maternal Illness:");

        termCheck.setText("Term");

        pretermCheck.setText("Preterm");

        estimateAOGLabel.setText("Estimated AOG:");

        nsvdCheck.setText("NSVD");

        forcepsCheck.setText("Forceps");

        csCheck.setText("CS");

        hospitalCheck.setText("Hostpital");

        lyingCheck.setText("Lying in");

        homeCheck.setText("Home assisted by:");

        noCompCheck.setText("No");

        yesCompCheck.setText("Yes");

        noUCCheck.setText("No");

        yesUCCheck.setText("Yes");

        gLabel.setText("G");

        pLabel.setText("P");

        xVisitLabel.setText("x visits c/o");

        alcoholCheck.setText("Alcohol");

        drugsCheck.setText("Drugs");

        geneticCheck.setText("Genetic");

        infectiousCheck.setText("Infectious");

        autoimmuneCheck.setText("Autoimmune");

        clottingCheck.setText("Clotting Disorder");

        maternalOthersCheck.setText("Others:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthHistoLabel)
                    .addComponent(prenatalLabel)
                    .addComponent(maternalUseLabel)
                    .addComponent(maternalIllnessLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aogLabel)
                            .addComponent(deliveryLabel)
                            .addComponent(locationLabel)
                            .addComponent(complicationLabel))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nsvdCheck)
                                    .addComponent(termCheck)
                                    .addComponent(hospitalCheck))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(yesCompCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yesCompTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(pretermCheck)
                                        .addGap(23, 23, 23)
                                        .addComponent(estimateAOGLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estimateAOGTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(forcepsCheck)
                                            .addComponent(yesUCCheck)
                                            .addComponent(lyingCheck))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(csCheck)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(homeCheck)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(homeTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(gLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(pLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenatalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xVisitLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prenatalTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alcoholCheck)
                                    .addComponent(geneticCheck))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(infectiousCheck)
                                        .addGap(14, 14, 14)
                                        .addComponent(autoimmuneCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clottingCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(maternalOthersCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maternalOthersTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(drugsCheck)))))
                    .addComponent(ageLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(catherizationLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noUCCheck)
                            .addComponent(noCompCheck))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(birthHistoLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aogLabel)
                    .addComponent(termCheck)
                    .addComponent(pretermCheck)
                    .addComponent(estimateAOGLabel)
                    .addComponent(estimateAOGTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryLabel)
                    .addComponent(nsvdCheck)
                    .addComponent(forcepsCheck)
                    .addComponent(csCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(hospitalCheck)
                    .addComponent(lyingCheck)
                    .addComponent(homeCheck)
                    .addComponent(homeTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(noCompCheck)
                        .addComponent(complicationLabel))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yesCompCheck)
                        .addComponent(yesCompTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catherizationLabel)
                    .addComponent(noUCCheck)
                    .addComponent(yesUCCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(gTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLabel)
                    .addComponent(pTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenatalLabel)
                    .addComponent(xVisitLabel)
                    .addComponent(prenatalTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenatalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maternalUseLabel)
                    .addComponent(alcoholCheck)
                    .addComponent(drugsCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maternalIllnessLabel)
                    .addComponent(geneticCheck)
                    .addComponent(infectiousCheck)
                    .addComponent(autoimmuneCheck)
                    .addComponent(clottingCheck)
                    .addComponent(maternalOthersCheck)
                    .addComponent(maternalOthersTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(2) Birth History", jPanel2);

        immunoLabel.setText("Immunization History:");

        bcgCheck.setText("BCG");

        dptCheck.setText("DPT");

        opvCheck.setText("OPV");

        measlesCheck.setText("Measles");

        hibCheck.setText("HiB");

        hepbCheck.setText("Hep B");

        hepaCheck.setText("Hep A");

        varicellaCheck.setText("Varicella");

        rabiesCheck.setText("Anti Rabies");

        tetanusCheck.setText("Td/Tetanus Toxoid");

        immunoOthersCheck.setText("Others:");

        dptDosesLabel.setText("doses");

        opcDosesLabel.setText("doses");

        hepbDosesLabel.setText("doses");

        hepaDosesLabel.setText("doses");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(immunoLabel)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(measlesCheck)
                            .addComponent(bcgCheck)
                            .addComponent(hibCheck)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dptCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dptSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dptDosesLabel))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(opvCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opvSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcDosesLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(hepaCheck)
                                .addGap(6, 6, 6)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hepaDosesLabel))
                            .addComponent(tetanusCheck)
                            .addComponent(varicellaCheck)
                            .addComponent(rabiesCheck)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(hepbCheck)
                                .addGap(6, 6, 6)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hepbDosesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(immunoOthersCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(immunoOthersTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(immunoLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcgCheck)
                    .addComponent(hepbCheck)
                    .addComponent(hepbDosesLabel)
                    .addComponent(immunoOthersCheck)
                    .addComponent(immunoOthersTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dptCheck)
                    .addComponent(dptDosesLabel)
                    .addComponent(hepaCheck)
                    .addComponent(hepaDosesLabel)
                    .addComponent(dptSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opvCheck)
                    .addComponent(opcDosesLabel)
                    .addComponent(varicellaCheck)
                    .addComponent(opvSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rabiesCheck)
                    .addComponent(measlesCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tetanusCheck)
                    .addComponent(hibCheck))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(3) Immunization History", jPanel3);

        nutritionalHistoLabel.setText("Nutritional History:");

        breastCheck.setText("Breastfed");

        formulaCheck.setText("Formula");

        solidsCheck.setText("Solids");

        preferenceLabel.setText("Preference:");

        breastMonthLabel.setText("Months");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solidsCheck)
                    .addComponent(formulaCheck)
                    .addComponent(nutritionalHistoLabel)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(breastCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(breastSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(breastMonthLabel))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(preferenceLabel)
                        .addGap(18, 18, 18)
                        .addComponent(preferenceTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(607, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nutritionalHistoLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breastCheck)
                    .addComponent(breastSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breastMonthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formulaCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solidsCheck)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preferenceLabel)
                    .addComponent(preferenceTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(4) Nutritional History", jPanel4);

        growthLabel.setText("Growth and Developmental History:");

        jLabel2.setText("Gross Motor:");

        rollsCheck.setText("Rolls over");

        sitsCheck.setText("Sits w/o support");

        standsCheck.setText("Puls self to stand");

        walksCheck.setText("Walks well");

        stepsCheck.setText("Walks up steps");

        liftCheck.setText("Lifts head 45°");

        gm1Label.setText("0-3 mos");

        gm2Label.setText("2.5-5.5 mos");

        gm3Label.setText("5.5-7.5 mos");

        gm4Label.setText("8-10 mos");

        gm5Label.setText("11-15 mos");

        gm6Label.setText("14-22 mos");

        jLabel9.setText("Personal-Social:");

        ps1Label.setText("0-1 mo");

        ps2Label.setText("1-2 mos");

        ps3Label.setText("7-14 mos");

        ps4Label.setText("10-16 mos");

        ps5Label.setText("2.5-3.5 yrs");

        ps6Label.setText("3-4.5 yrs");

        faceCheck.setText("Regards face");

        smilesCheck.setText("Smiles responsively");

        wavesCheck.setText("Waves goodbye");

        imitatesCheck.setText("Imitates activities");

        namesCheck.setText("Names friend");

        dressesCheck.setText("Dresses w/o help");

        jLabel16.setText("Language:");

        respondsCheck.setText("Responds to sound");

        coosCheck.setText("Coos");

        laughsCheck.setText("Squeels/Laughs aloud");

        babblesCheck.setText("Combines syllables/Babbles");

        damaCheck.setText("Dada/Mama specific");

        picturesCheck.setText("Points ot pictures");

        speechCheck.setText("Speech all understandable");

        bodyPartsCheck.setText("Points to body parts");

        l1Label.setText("0-1 mo");

        l2Label.setText("1-3 mos");

        l3Label.setText("1.5-4.5 mos");

        l4Label.setText("6-10 mos");

        l5Label.setText("8-14 mos");

        l6Label.setText("17-25 mos");

        l7Label.setText("2.4-4 yrs");

        l8Label.setText("20-25 mos");

        jLabel25.setText("Fine Motor:");

        midlineCheck.setText("Visual tracking past midline");

        rattleCheck.setText("Grasps rattle");

        reachesObjectsCheck.setText("Reaches for objects");

        scubblesCheck.setText("Scubbles");

        drawsCheck.setText("Draws a person w/ 3 parts");

        fm1Label.setText("1.5-3 mos");

        fm2Label.setText("3-4 mos");

        fm3Label.setText("4-6 mos");

        fm4Label.setText("12-16 mos");

        fm5Label.setText("3-4.5 yrs");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(growthLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(gm1Label)
                                        .addComponent(gm2Label)
                                        .addComponent(gm3Label)
                                        .addComponent(gm4Label)
                                        .addComponent(gm5Label)
                                        .addComponent(gm6Label))
                                    .addComponent(fm1Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fm2Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fm3Label, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rollsCheck)
                                    .addComponent(liftCheck)
                                    .addComponent(sitsCheck)
                                    .addComponent(stepsCheck)
                                    .addComponent(walksCheck)
                                    .addComponent(standsCheck)
                                    .addComponent(midlineCheck)
                                    .addComponent(rattleCheck)
                                    .addComponent(reachesObjectsCheck)))
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ps1Label)
                                    .addComponent(ps2Label)
                                    .addComponent(ps3Label)
                                    .addComponent(ps4Label)
                                    .addComponent(ps5Label)
                                    .addComponent(ps6Label)
                                    .addComponent(fm4Label)
                                    .addComponent(fm5Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dressesCheck)
                                    .addComponent(namesCheck)
                                    .addComponent(imitatesCheck)
                                    .addComponent(scubblesCheck)
                                    .addComponent(smilesCheck)
                                    .addComponent(faceCheck)
                                    .addComponent(drawsCheck)
                                    .addComponent(wavesCheck)))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(l6Label))
                                    .addComponent(l5Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l4Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l3Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l7Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l8Label, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(picturesCheck)
                                    .addComponent(damaCheck)
                                    .addComponent(babblesCheck)
                                    .addComponent(laughsCheck)
                                    .addComponent(speechCheck)
                                    .addComponent(bodyPartsCheck)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(l2Label)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(l1Label)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respondsCheck)
                                    .addComponent(coosCheck)))
                            .addComponent(jLabel16))
                        .addGap(28, 28, 28))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(growthLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(liftCheck)
                            .addComponent(gm1Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rollsCheck)
                            .addComponent(gm2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sitsCheck)
                            .addComponent(gm3Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(standsCheck)
                            .addComponent(gm4Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(walksCheck)
                            .addComponent(gm5Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stepsCheck)
                            .addComponent(gm6Label))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(midlineCheck)
                            .addComponent(fm1Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rattleCheck)
                            .addComponent(fm2Label)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(faceCheck)
                                    .addComponent(ps1Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(smilesCheck)
                                    .addComponent(ps2Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(wavesCheck)
                                    .addComponent(ps3Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(imitatesCheck)
                                    .addComponent(ps4Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namesCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ps5Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dressesCheck)
                                    .addComponent(ps6Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(respondsCheck)
                                    .addComponent(l1Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coosCheck)
                                    .addComponent(l2Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(laughsCheck)
                                    .addComponent(l3Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(babblesCheck)
                                    .addComponent(l4Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(damaCheck)
                                    .addComponent(l5Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(picturesCheck)
                                    .addComponent(l6Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(speechCheck)
                                    .addComponent(l7Label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bodyPartsCheck)
                                    .addComponent(l8Label))))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scubblesCheck)
                            .addComponent(fm4Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawsCheck)
                            .addComponent(fm5Label))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reachesObjectsCheck)
                    .addComponent(fm3Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(5) Growth and Developmental History", jPanel5);

        medicalHistoLabel.setText("Past Medical History:");

        hypertensionCheck.setText("Hypertension");

        diabetesCheck.setText("Diabetes");

        anemiaCheck.setText("Anemia");

        sleCheck.setText("SLE/CTD");

        cancerCheck.setText("Cancer");

        ciCheck.setText("Chronic Infections");

        hdCheck.setText("Heart Disease");

        haCheck.setText("Heart Attack");

        thromboCheck.setText("Thrombocytopenia");

        strokeCheck.setText("Stroke");

        cvCheck.setText("Chronic Venous Insufficiency");

        ptbCheck.setText("PTB Exposure");

        medicationsCheck.setText("Medication Use");

        ptbTreatmentCheck.setText("PTB Treatment:");

        veinsCheck.setText("Varicose Veins");

        idiopathicCheck.setText("Idiopathic Seizure");

        surgeryCheck.setText("Surgery");

        hospitalizationCheck.setText("Hospitalization");

        jLabel4.setText("Duration:");

        jLabel5.setText("Tx Regimen:");

        medicationTxtbx.setColumns(20);
        medicationTxtbx.setRows(5);
        jScrollPane4.setViewportView(medicationTxtbx);

        surgeryTxtbx.setColumns(20);
        surgeryTxtbx.setRows(5);
        jScrollPane5.setViewportView(surgeryTxtbx);

        hospitalizationTxtbx.setColumns(20);
        hospitalizationTxtbx.setRows(5);
        jScrollPane6.setViewportView(hospitalizationTxtbx);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicalHistoLabel)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancerCheck)
                            .addComponent(sleCheck)
                            .addComponent(anemiaCheck)
                            .addComponent(diabetesCheck)
                            .addComponent(hypertensionCheck)
                            .addComponent(medicationsCheck))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thromboCheck)
                                    .addComponent(veinsCheck)
                                    .addComponent(ciCheck)
                                    .addComponent(hdCheck)
                                    .addComponent(haCheck)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(surgeryCheck)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cvCheck)
                            .addComponent(ptbCheck)
                            .addComponent(strokeCheck)
                            .addComponent(idiopathicCheck)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(ptbTreatmentCheck)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ptbRegimenTxtbx)
                                        .addComponent(ptbDurationTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hospitalizationCheck)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medicalHistoLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hypertensionCheck)
                    .addComponent(thromboCheck)
                    .addComponent(strokeCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diabetesCheck)
                    .addComponent(ciCheck)
                    .addComponent(idiopathicCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anemiaCheck)
                    .addComponent(hdCheck)
                    .addComponent(cvCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sleCheck)
                    .addComponent(haCheck)
                    .addComponent(ptbCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancerCheck)
                        .addComponent(veinsCheck))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ptbTreatmentCheck)
                            .addComponent(ptbRegimenTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ptbDurationTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surgeryCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hospitalizationCheck)
                    .addComponent(medicationsCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(6) Past Medical History", jPanel6);

        familyHistoLabel.setText("Family Medical History:");

        famHypertensionCheck.setText("Hypertension");

        famDiabetesCheck.setText("Diabetes");

        famHDCheck.setText("Heart Disease");

        famSLECheck.setText("SLE/CTD");

        famCancerCheck.setText("Cancer");

        famPTBCheck.setText("PTB");

        famStrokeCheck.setText("Stroke");

        youngStrokeCheck.setText("Stroke in the young (<45 yrs)");

        famClottingCheck.setText("Clotting Disorder");

        famKidneyCheck.setText("Kidney Disease");

        famThyroidCheck.setText("Thyroid Disease");

        famOBCheck.setText("Similar OB History");

        siblingDeathCheck.setText("Multiple sibling deaths (Circumstances)");

        siblingDeathTxtbx.setColumns(20);
        siblingDeathTxtbx.setRows(5);
        jScrollPane7.setViewportView(siblingDeathTxtbx);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(famHypertensionCheck)
                            .addComponent(famDiabetesCheck)
                            .addComponent(famHDCheck)
                            .addComponent(famSLECheck))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(famCancerCheck)
                            .addComponent(famPTBCheck)
                            .addComponent(famStrokeCheck)
                            .addComponent(youngStrokeCheck))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(famOBCheck)
                            .addComponent(famThyroidCheck)
                            .addComponent(famKidneyCheck)
                            .addComponent(famClottingCheck)))
                    .addComponent(familyHistoLabel)
                    .addComponent(siblingDeathCheck))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(familyHistoLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(famHypertensionCheck)
                    .addComponent(famCancerCheck)
                    .addComponent(famClottingCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(famDiabetesCheck)
                    .addComponent(famPTBCheck)
                    .addComponent(famKidneyCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(famHDCheck)
                    .addComponent(famStrokeCheck)
                    .addComponent(famThyroidCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(famSLECheck)
                    .addComponent(youngStrokeCheck)
                    .addComponent(famOBCheck))
                .addGap(34, 34, 34)
                .addComponent(siblingDeathCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(7) Family Medical History", jPanel7);

        personalHistoLabel.setText("Personal and Social History:");

        smokerCheck.setText("Smoker");

        alcoholicCheck.setText("Alcoholic beverage drinker");

        drugCheck.setText("Illicit drug use");

        ocpCheck.setText("OCP use");

        statusLabel.setText("Status:");

        educationLabel.setText("Educational attainment:");

        occupationLabel.setText("Occupation:");

        siblingsLabel.setText("No. of siblings:");

        childrenLabel.setText("No. of children:");

        smokerLabel.setText("packs per year");

        statusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Married", "Student", "Divorced", "Other" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ocpCheck)
                    .addComponent(drugCheck)
                    .addComponent(alcoholicCheck)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(smokerCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smokerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smokerLabel))
                    .addComponent(personalHistoLabel)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addGap(96, 96, 96)
                        .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(educationLabel)
                            .addComponent(occupationLabel)
                            .addComponent(siblingsLabel)
                            .addComponent(childrenLabel))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(educationTxtbx)
                            .addComponent(occupationTxtbx, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(siblingsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childrenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(551, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalHistoLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smokerCheck)
                    .addComponent(smokerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smokerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alcoholicCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(drugCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ocpCheck)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(educationLabel)
                    .addComponent(educationTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupationLabel)
                    .addComponent(occupationTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siblingsLabel)
                    .addComponent(siblingsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childrenLabel)
                    .addComponent(childrenSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(8) Personal and Social History", jPanel8);

        workupLabel.setText("Previous Workup:");

        cbcCheck.setText("CBC, differential count, platelet count");

        bunCheck.setText("BUN, crea, Na, K, AST, ALT, Alk Phos");

        esrCheck.setText("ESR");

        urinalysisCheck.setText("Urinalysis");

        cxrCheck.setText("CXR-AP/PA");

        ecgCheck.setText("12-lead ECG");

        ctScanCheck.setText("CT scan");

        echoCardioCheck.setText("2D echocardiography");

        ptCheck.setText("PT");

        jCheckBox10.setText("aPTT");

        kctCheck.setText("KCT, DRVVT");

        acaCheck.setText("ACA IgG, ACA IgM");

        antib2Check.setText("Anti B2 GP1");

        utzCheck.setText("Abdominal UTZ +/- doppler");

        arterialDopplerCheck.setText("Peripheral arterial doppler");

        duplexScanCheck.setText("Venous duplex scan");

        anaCheck.setText("ANA");

        proteinCCheck.setText("Protein C");

        proteinSCheck.setText("Protein S");

        bloodSmearCheck.setText("Peripheral blood smear");

        coombsCheck.setText("Coomb’s test – direct, indirect");

        wokupOthersCheck.setText("Others:");

        workupOthersTxtbx.setColumns(20);
        workupOthersTxtbx.setRows(5);
        jScrollPane8.setViewportView(workupOthersTxtbx);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wokupOthersCheck)
                    .addComponent(workupLabel)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbcCheck)
                            .addComponent(bunCheck)
                            .addComponent(esrCheck)
                            .addComponent(urinalysisCheck)
                            .addComponent(cxrCheck)
                            .addComponent(ecgCheck)
                            .addComponent(ctScanCheck))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(echoCardioCheck)
                            .addComponent(ptCheck)
                            .addComponent(jCheckBox10)
                            .addComponent(kctCheck)
                            .addComponent(acaCheck)
                            .addComponent(antib2Check)
                            .addComponent(utzCheck))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coombsCheck)
                            .addComponent(bloodSmearCheck)
                            .addComponent(proteinSCheck)
                            .addComponent(proteinCCheck)
                            .addComponent(anaCheck)
                            .addComponent(duplexScanCheck)
                            .addComponent(arterialDopplerCheck)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workupLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcCheck)
                    .addComponent(echoCardioCheck)
                    .addComponent(arterialDopplerCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bunCheck)
                    .addComponent(ptCheck)
                    .addComponent(duplexScanCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esrCheck)
                    .addComponent(jCheckBox10)
                    .addComponent(anaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urinalysisCheck)
                    .addComponent(kctCheck)
                    .addComponent(proteinCCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxrCheck)
                    .addComponent(acaCheck)
                    .addComponent(proteinSCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecgCheck)
                    .addComponent(antib2Check)
                    .addComponent(bloodSmearCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctScanCheck)
                    .addComponent(utzCheck)
                    .addComponent(coombsCheck))
                .addGap(18, 18, 18)
                .addComponent(wokupOthersCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(9) Previous Workup", jPanel9);

        cbcDiaCheck.setText("CBC, differential count, platelet count");

        bunDiaCheck.setText("BUN, crea, Na, K, AST, ALT, Alk Phos");

        esrDiaCheck.setText("ESR");

        urinalysisDiaCheck.setText("Urinalysis");

        cxrDiaCheck.setText("CXR-AP/PA");

        ecgDiaCheck.setText("12-lead ECG");

        ctScanDiaCheck.setText("CT scan");

        wokupOthersDiaCheck.setText("Others:");

        workupOthersDiaTxtbx.setColumns(20);
        workupOthersDiaTxtbx.setRows(5);
        jScrollPane9.setViewportView(workupOthersDiaTxtbx);

        utzDiaCheck.setText("Abdominal UTZ +/- doppler");

        antib2DiaCheck.setText("Anti B2 GP1");

        acaDiaCheck.setText("ACA IgG, ACA IgM");

        kctDiaCheck.setText("KCT, DRVVT");

        apttDiaCheck.setText("aPTT");

        ptDiaCheck.setText("PT");

        echoCardioDiaCheck.setText("2D echocardiography");

        arterialDopplerDiaCheck.setText("Peripheral arterial doppler");

        duplexScanDiaCheck.setText("Venous duplex scan");

        anaDiaCheck.setText("ANA");

        proteinCDiaCheck.setText("Protein C");

        proteinSDiaCheck.setText("Protein S");

        coombsDiaCheck.setText("Coomb’s test – direct, indirect");

        bloodSmearDiaCheck.setText("Peripheral blood smear");

        diagnosticsLabel.setText("Diagnostics:");

        therapeuticsLabel.setText("Therapeutics:");

        therapeuticsTxtbx.setColumns(20);
        therapeuticsTxtbx.setRows(5);
        jScrollPane10.setViewportView(therapeuticsTxtbx);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diagnosticsLabel)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbcDiaCheck)
                            .addComponent(bunDiaCheck)
                            .addComponent(esrDiaCheck)
                            .addComponent(urinalysisDiaCheck)
                            .addComponent(cxrDiaCheck)
                            .addComponent(ecgDiaCheck)
                            .addComponent(ctScanDiaCheck)
                            .addComponent(wokupOthersDiaCheck))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(echoCardioDiaCheck)
                                    .addComponent(ptDiaCheck)
                                    .addComponent(apttDiaCheck)
                                    .addComponent(kctDiaCheck)
                                    .addComponent(acaDiaCheck)
                                    .addComponent(antib2DiaCheck)
                                    .addComponent(utzDiaCheck))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coombsDiaCheck)
                                    .addComponent(duplexScanDiaCheck)
                                    .addComponent(arterialDopplerDiaCheck)
                                    .addComponent(bloodSmearDiaCheck)
                                    .addComponent(proteinSDiaCheck)
                                    .addComponent(proteinCDiaCheck)
                                    .addComponent(anaDiaCheck)))
                            .addComponent(therapeuticsLabel)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diagnosticsLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcDiaCheck)
                    .addComponent(echoCardioDiaCheck)
                    .addComponent(arterialDopplerDiaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bunDiaCheck)
                    .addComponent(ptDiaCheck)
                    .addComponent(duplexScanDiaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esrDiaCheck)
                    .addComponent(apttDiaCheck)
                    .addComponent(anaDiaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urinalysisDiaCheck)
                    .addComponent(kctDiaCheck)
                    .addComponent(proteinCDiaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxrDiaCheck)
                    .addComponent(acaDiaCheck)
                    .addComponent(proteinSDiaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecgDiaCheck)
                    .addComponent(antib2DiaCheck)
                    .addComponent(bloodSmearDiaCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctScanDiaCheck)
                    .addComponent(utzDiaCheck)
                    .addComponent(coombsDiaCheck))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wokupOthersDiaCheck)
                    .addComponent(therapeuticsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("(10) Management Plan", jPanel12);

        jLabel1.setText("Summary:");

        caseNum2Label.setText("Case Number:");

        patientID2Label.setText("Patient ID:");

        summaryList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(summaryList);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        recordDateLabel.setText("Date Recorded:");

        submitBtn.setText("Submit");

        discardBtn.setText("Discard");
        discardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardBtnActionPerformed(evt);
            }
        });

        addPEBtn.setText("Add Physical Examination");
        addPEBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPEBtnActionPerformed(evt);
            }
        });

        caseNum2Data.setText("[caseNum]");

        patientID2Data.setText("[patientID]");

        recordDate2Data.setText("[dd/MM/yyyy]");

        refreshBtn.setText("Refresh");

        checkupLabel.setText("Next Checkup: (dd/MM/yyyy)");

        viewPeBtn.setText("View Physical Examination");
        viewPeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(addPEBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(discardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(recordDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recordDate2Data))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caseNum2Label)
                                    .addComponent(patientID2Label))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientID2Data)
                                    .addComponent(caseNum2Data)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(checkupLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewPeBtn))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caseNum2Label)
                            .addComponent(caseNum2Data))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientID2Label)
                            .addComponent(patientID2Data))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recordDateLabel)
                            .addComponent(recordDate2Data))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkupLabel)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewPeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPEBtn)
                            .addComponent(submitBtn)
                            .addComponent(discardBtn)))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("(11) Submit/Discard", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPeBtnActionPerformed
        if(peForm == true)
            new ApasPeView();
        else JOptionPane.showMessageDialog(null, "Please add a Physical Examination first!", "Message", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_viewPeBtnActionPerformed

    private void addPEBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPEBtnActionPerformed
        new EditApasPeView();
    }//GEN-LAST:event_addPEBtnActionPerformed

    private void discardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardBtnActionPerformed
        dispose();
    }//GEN-LAST:event_discardBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APASLabel;
    private javax.swing.JCheckBox PDcheck;
    private javax.swing.JCheckBox abdominalCheck;
    private javax.swing.JCheckBox acaCheck;
    private javax.swing.JCheckBox acaDiaCheck;
    private javax.swing.JButton addPEBtn;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.JCheckBox alcoholCheck;
    private javax.swing.JCheckBox alcoholicCheck;
    private javax.swing.JCheckBox anaCheck;
    private javax.swing.JCheckBox anaDiaCheck;
    private javax.swing.JCheckBox anemiaCheck;
    private javax.swing.JCheckBox antib2Check;
    private javax.swing.JCheckBox antib2DiaCheck;
    private javax.swing.JLabel aogLabel;
    private javax.swing.JCheckBox apttDiaCheck;
    private javax.swing.JCheckBox arterialDopplerCheck;
    private javax.swing.JCheckBox arterialDopplerDiaCheck;
    private javax.swing.JCheckBox autoimmuneCheck;
    private javax.swing.JCheckBox babblesCheck;
    private javax.swing.JCheckBox bcgCheck;
    private javax.swing.JLabel birthHistoLabel;
    private javax.swing.JCheckBox bleedingCheck;
    private javax.swing.JCheckBox bloodSmearCheck;
    private javax.swing.JCheckBox bloodSmearDiaCheck;
    private javax.swing.JCheckBox blurringCheck;
    private javax.swing.JCheckBox bodyPartsCheck;
    private javax.swing.JCheckBox breastCheck;
    private javax.swing.JLabel breastMonthLabel;
    private javax.swing.JSpinner breastSpinner;
    private javax.swing.JCheckBox bruiseCheck;
    private javax.swing.JCheckBox bunCheck;
    private javax.swing.JCheckBox bunDiaCheck;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cancerCheck;
    private javax.swing.JLabel caseNum2Data;
    private javax.swing.JLabel caseNum2Label;
    private javax.swing.JLabel caseNumData;
    private javax.swing.JLabel catherizationLabel;
    private javax.swing.JCheckBox cbcCheck;
    private javax.swing.JCheckBox cbcDiaCheck;
    private javax.swing.JLabel checkupLabel;
    private javax.swing.JCheckBox chestCheck;
    private javax.swing.JLabel childrenLabel;
    private javax.swing.JSpinner childrenSpinner;
    private javax.swing.JCheckBox ciCheck;
    private javax.swing.JCheckBox claudicationCheck;
    private javax.swing.JCheckBox clottingCheck;
    private javax.swing.JLabel complaintLabel;
    private javax.swing.JTextArea complaintTextArea;
    private javax.swing.JLabel complicationLabel;
    private javax.swing.JCheckBox contractionsCheck;
    private javax.swing.JCheckBox coombsCheck;
    private javax.swing.JCheckBox coombsDiaCheck;
    private javax.swing.JCheckBox coosCheck;
    private javax.swing.JCheckBox csCheck;
    private javax.swing.JLabel cseNumLabel;
    private javax.swing.JCheckBox ctScanCheck;
    private javax.swing.JCheckBox ctScanDiaCheck;
    private javax.swing.JCheckBox cvCheck;
    private javax.swing.JCheckBox cxrCheck;
    private javax.swing.JCheckBox cxrDiaCheck;
    private javax.swing.JCheckBox damaCheck;
    private javax.swing.JLabel dateData;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel deliveryLabel;
    private javax.swing.JCheckBox diabetesCheck;
    private javax.swing.JLabel diagnosticsLabel;
    private javax.swing.JButton discardBtn;
    private javax.swing.JCheckBox dptCheck;
    private javax.swing.JLabel dptDosesLabel;
    private javax.swing.JSpinner dptSpinner;
    private javax.swing.JCheckBox drawsCheck;
    private javax.swing.JCheckBox dressesCheck;
    private javax.swing.JCheckBox drugCheck;
    private javax.swing.JCheckBox drugsCheck;
    private javax.swing.JCheckBox duplexScanCheck;
    private javax.swing.JCheckBox duplexScanDiaCheck;
    private javax.swing.JCheckBox ecgCheck;
    private javax.swing.JCheckBox ecgDiaCheck;
    private javax.swing.JCheckBox echoCardioCheck;
    private javax.swing.JCheckBox echoCardioDiaCheck;
    private javax.swing.JLabel educationLabel;
    private javax.swing.JTextField educationTxtbx;
    private javax.swing.JCheckBox esrCheck;
    private javax.swing.JCheckBox esrDiaCheck;
    private javax.swing.JLabel estimateAOGLabel;
    private javax.swing.JTextField estimateAOGTxtbx;
    private javax.swing.JCheckBox faceCheck;
    private javax.swing.JCheckBox famCancerCheck;
    private javax.swing.JCheckBox famClottingCheck;
    private javax.swing.JCheckBox famDiabetesCheck;
    private javax.swing.JCheckBox famHDCheck;
    private javax.swing.JCheckBox famHypertensionCheck;
    private javax.swing.JCheckBox famKidneyCheck;
    private javax.swing.JCheckBox famOBCheck;
    private javax.swing.JCheckBox famPTBCheck;
    private javax.swing.JCheckBox famSLECheck;
    private javax.swing.JCheckBox famStrokeCheck;
    private javax.swing.JCheckBox famThyroidCheck;
    private javax.swing.JLabel familyHistoLabel;
    private javax.swing.JLabel fm1Label;
    private javax.swing.JLabel fm2Label;
    private javax.swing.JLabel fm3Label;
    private javax.swing.JLabel fm4Label;
    private javax.swing.JLabel fm5Label;
    private javax.swing.JCheckBox forcepsCheck;
    private javax.swing.JCheckBox formulaCheck;
    private javax.swing.JLabel gLabel;
    private javax.swing.JTextField gTxtbx;
    private javax.swing.JCheckBox geneticCheck;
    private javax.swing.JLabel gm1Label;
    private javax.swing.JLabel gm2Label;
    private javax.swing.JLabel gm3Label;
    private javax.swing.JLabel gm4Label;
    private javax.swing.JLabel gm5Label;
    private javax.swing.JLabel gm6Label;
    private javax.swing.JLabel growthLabel;
    private javax.swing.JCheckBox haCheck;
    private javax.swing.JCheckBox hdCheck;
    private javax.swing.JCheckBox headacheCheck;
    private javax.swing.JCheckBox hepaCheck;
    private javax.swing.JLabel hepaDosesLabel;
    private javax.swing.JCheckBox hepbCheck;
    private javax.swing.JLabel hepbDosesLabel;
    private javax.swing.JCheckBox hibCheck;
    private javax.swing.JCheckBox homeCheck;
    private javax.swing.JTextField homeTxtbx;
    private javax.swing.JCheckBox hospitalCheck;
    private javax.swing.JCheckBox hospitalizationCheck;
    private javax.swing.JTextArea hospitalizationTxtbx;
    private javax.swing.JCheckBox hypertensionCheck;
    private javax.swing.JCheckBox idiopathicCheck;
    private javax.swing.JLabel illnessLabel;
    private javax.swing.JTextArea illnessTextArea;
    private javax.swing.JCheckBox imitatesCheck;
    private javax.swing.JLabel immunoLabel;
    private javax.swing.JCheckBox immunoOthersCheck;
    private javax.swing.JTextField immunoOthersTxtbx;
    private javax.swing.JCheckBox infectiousCheck;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox jointCheck;
    private javax.swing.JCheckBox kctCheck;
    private javax.swing.JCheckBox kctDiaCheck;
    private javax.swing.JLabel l1Label;
    private javax.swing.JLabel l2Label;
    private javax.swing.JLabel l3Label;
    private javax.swing.JLabel l4Label;
    private javax.swing.JLabel l5Label;
    private javax.swing.JLabel l6Label;
    private javax.swing.JLabel l7Label;
    private javax.swing.JLabel l8Label;
    private javax.swing.JCheckBox laughsCheck;
    private javax.swing.JCheckBox liftCheck;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JCheckBox lyingCheck;
    private javax.swing.JCheckBox malarCheck;
    private javax.swing.JLabel maternalIllnessLabel;
    private javax.swing.JCheckBox maternalOthersCheck;
    private javax.swing.JTextField maternalOthersTxtbx;
    private javax.swing.JLabel maternalUseLabel;
    private javax.swing.JCheckBox measlesCheck;
    private javax.swing.JLabel medicalHistoLabel;
    private javax.swing.JTextArea medicationTxtbx;
    private javax.swing.JCheckBox medicationsCheck;
    private javax.swing.JCheckBox midlineCheck;
    private javax.swing.JCheckBox mottlingCheck;
    private javax.swing.JCheckBox namesCheck;
    private javax.swing.JCheckBox noCompCheck;
    private javax.swing.JCheckBox noUCCheck;
    private javax.swing.JCheckBox nsvdCheck;
    private javax.swing.JLabel nutritionalHistoLabel;
    private javax.swing.JLabel occupationLabel;
    private javax.swing.JTextField occupationTxtbx;
    private javax.swing.JCheckBox ocpCheck;
    private javax.swing.JLabel opcDosesLabel;
    private javax.swing.JCheckBox opvCheck;
    private javax.swing.JSpinner opvSpinner;
    private javax.swing.JCheckBox othersCheck;
    private javax.swing.JTextField othersTxtbx;
    private javax.swing.JLabel pLabel;
    private javax.swing.JTextField pTxtbx;
    private javax.swing.JCheckBox paresthesiaCheck;
    private javax.swing.JLabel patientID2Data;
    private javax.swing.JLabel patientID2Label;
    private javax.swing.JLabel patientIDData;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JLabel personalHistoLabel;
    private javax.swing.JCheckBox photoCheck;
    private javax.swing.JCheckBox picturesCheck;
    private javax.swing.JLabel preferenceLabel;
    private javax.swing.JTextField preferenceTxtbx;
    private javax.swing.JLabel prenatalLabel;
    private javax.swing.JSpinner prenatalSpinner;
    private javax.swing.JTextField prenatalTxtbx;
    private javax.swing.JCheckBox pretermCheck;
    private javax.swing.JCheckBox proteinCCheck;
    private javax.swing.JCheckBox proteinCDiaCheck;
    private javax.swing.JCheckBox proteinSCheck;
    private javax.swing.JCheckBox proteinSDiaCheck;
    private javax.swing.JLabel ps1Label;
    private javax.swing.JLabel ps2Label;
    private javax.swing.JLabel ps3Label;
    private javax.swing.JLabel ps4Label;
    private javax.swing.JLabel ps5Label;
    private javax.swing.JLabel ps6Label;
    private javax.swing.JCheckBox ptCheck;
    private javax.swing.JCheckBox ptDiaCheck;
    private javax.swing.JCheckBox ptbCheck;
    private javax.swing.JTextField ptbDurationTxtbx;
    private javax.swing.JTextField ptbRegimenTxtbx;
    private javax.swing.JCheckBox ptbTreatmentCheck;
    private javax.swing.JCheckBox rabiesCheck;
    private javax.swing.JCheckBox rattleCheck;
    private javax.swing.JCheckBox reachesObjectsCheck;
    private javax.swing.JLabel recordDate2Data;
    private javax.swing.JLabel recordDateLabel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JCheckBox respondsCheck;
    private javax.swing.JCheckBox rollsCheck;
    private javax.swing.JCheckBox scubblesCheck;
    private javax.swing.JCheckBox siblingDeathCheck;
    private javax.swing.JTextArea siblingDeathTxtbx;
    private javax.swing.JLabel siblingsLabel;
    private javax.swing.JSpinner siblingsSpinner;
    private javax.swing.JCheckBox sitsCheck;
    private javax.swing.JCheckBox sleCheck;
    private javax.swing.JCheckBox smilesCheck;
    private javax.swing.JCheckBox smokerCheck;
    private javax.swing.JLabel smokerLabel;
    private javax.swing.JSpinner smokerSpinner;
    private javax.swing.JCheckBox solidsCheck;
    private javax.swing.JCheckBox speechCheck;
    private javax.swing.JCheckBox standsCheck;
    private javax.swing.JComboBox statusCombo;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JCheckBox stepsCheck;
    private javax.swing.JCheckBox strokeCheck;
    private javax.swing.JButton submitBtn;
    private javax.swing.JList summaryList;
    private javax.swing.JCheckBox surgeryCheck;
    private javax.swing.JTextArea surgeryTxtbx;
    private javax.swing.JLabel systemsReviewLabel;
    private javax.swing.JCheckBox termCheck;
    private javax.swing.JCheckBox tetanusCheck;
    private javax.swing.JLabel therapeuticsLabel;
    private javax.swing.JTextArea therapeuticsTxtbx;
    private javax.swing.JCheckBox thromboCheck;
    private javax.swing.JCheckBox ulcerCheck;
    private javax.swing.JCheckBox urinalysisCheck;
    private javax.swing.JCheckBox urinalysisDiaCheck;
    private javax.swing.JCheckBox utzCheck;
    private javax.swing.JCheckBox utzDiaCheck;
    private javax.swing.JCheckBox varicellaCheck;
    private javax.swing.JCheckBox veinsCheck;
    private javax.swing.JButton viewPeBtn;
    private javax.swing.JCheckBox walksCheck;
    private javax.swing.JCheckBox wavesCheck;
    private javax.swing.JCheckBox wokupOthersCheck;
    private javax.swing.JCheckBox wokupOthersDiaCheck;
    private javax.swing.JLabel workupLabel;
    private javax.swing.JTextArea workupOthersDiaTxtbx;
    private javax.swing.JTextArea workupOthersTxtbx;
    private javax.swing.JLabel xVisitLabel;
    private javax.swing.JCheckBox yesCompCheck;
    private javax.swing.JTextField yesCompTxtbx;
    private javax.swing.JCheckBox yesUCCheck;
    private javax.swing.JCheckBox youngStrokeCheck;
    // End of variables declaration//GEN-END:variables
}
