package view;

import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class EditApasPeView extends javax.swing.JFrame {

    public EditApasPeView() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        initComponents();
        setLocationRelativeTo(null);  
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        peLabel = new javax.swing.JLabel();
        apasLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        bpLabel = new javax.swing.JLabel();
        hrLabel = new javax.swing.JLabel();
        heightSpinner = new javax.swing.JSpinner();
        weightSpinner = new javax.swing.JSpinner();
        bpSPinner = new javax.swing.JSpinner();
        hrSpinner = new javax.swing.JSpinner();
        rrLabel = new javax.swing.JLabel();
        rrSpinner = new javax.swing.JSpinner();
        generalLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        generalTxtbx = new javax.swing.JTextArea();
        headLabel = new javax.swing.JLabel();
        eyesLabel = new javax.swing.JLabel();
        conjuctivaeLabel = new javax.swing.JLabel();
        scleraeLabel = new javax.swing.JLabel();
        alopeciaRadio = new javax.swing.JRadioButton();
        malarRadio = new javax.swing.JRadioButton();
        discoidRadio = new javax.swing.JRadioButton();
        pinkRadio = new javax.swing.JRadioButton();
        paleRadio = new javax.swing.JRadioButton();
        anictaericRadio = new javax.swing.JRadioButton();
        ictericRadio = new javax.swing.JRadioButton();
        earsLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        earsTxtbx = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        noseLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        noseTxtbx = new javax.swing.JTextArea();
        oralLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        oralTxtbx = new javax.swing.JTextArea();
        throatLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        throatTxtbx = new javax.swing.JTextArea();
        neckLabel = new javax.swing.JLabel();
        normalNeckRadio = new javax.swing.JRadioButton();
        thyroNeckLabel = new javax.swing.JRadioButton();
        lymphLabel = new javax.swing.JLabel();
        normalLymphRadio = new javax.swing.JRadioButton();
        enlargedLymphLabel = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        chestLabel = new javax.swing.JLabel();
        equalChestRadio = new javax.swing.JRadioButton();
        clearChestRadio = new javax.swing.JRadioButton();
        ralesChestRadio = new javax.swing.JRadioButton();
        wheezeChestRadio = new javax.swing.JRadioButton();
        heartLabel = new javax.swing.JLabel();
        regularHeartRadio = new javax.swing.JRadioButton();
        murmurHeartLabel = new javax.swing.JRadioButton();
        abdomenLabel = new javax.swing.JLabel();
        normalAbdomenRadio = new javax.swing.JRadioButton();
        hepaAbdomenRadio = new javax.swing.JRadioButton();
        splenoAbdomenRadio = new javax.swing.JRadioButton();
        massAbdmonenRadio = new javax.swing.JRadioButton();
        tenderAbdomenRadio = new javax.swing.JRadioButton();
        extremitiesLabel = new javax.swing.JLabel();
        pinkExtremaRadio = new javax.swing.JRadioButton();
        paleExtremaRadio = new javax.swing.JRadioButton();
        cyanoticExtremaRadio = new javax.swing.JRadioButton();
        gangreneExtremaRadio = new javax.swing.JRadioButton();
        warmExtremaRadio = new javax.swing.JRadioButton();
        coldExtremaLabel = new javax.swing.JRadioButton();
        edemaExtremaRadio = new javax.swing.JRadioButton();
        swellingExtremaRadio = new javax.swing.JRadioButton();
        pulsesLabel = new javax.swing.JLabel();
        fullPulseRadio = new javax.swing.JRadioButton();
        weakPulseRadio = new javax.swing.JRadioButton();
        equalPulseRadio = new javax.swing.JRadioButton();
        absentPulseRadio = new javax.swing.JRadioButton();
        skinLabel = new javax.swing.JLabel();
        rivedoSkinRadio = new javax.swing.JRadioButton();
        normalSkinRadio = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        neuroLabel = new javax.swing.JLabel();
        gcsLabel = new javax.swing.JLabel();
        eLabel = new javax.swing.JLabel();
        vLabel = new javax.swing.JLabel();
        mLabel = new javax.swing.JLabel();
        eGcsTxtbx = new javax.swing.JTextField();
        vGcsTxtbx = new javax.swing.JTextField();
        mGcsTxtbx = new javax.swing.JTextField();
        cranialLabel = new javax.swing.JLabel();
        intactCranialRadio = new javax.swing.JRadioButton();
        abnormalCranialRadio = new javax.swing.JRadioButton();
        abnormalCranialTxtbx = new javax.swing.JTextField();
        motorLabel = new javax.swing.JLabel();
        normalMotorRadio = new javax.swing.JRadioButton();
        motor1Radio = new javax.swing.JRadioButton();
        motor2radio = new javax.swing.JRadioButton();
        mototr3Radio = new javax.swing.JRadioButton();
        mototr4Radio = new javax.swing.JRadioButton();
        sensoryLabel = new javax.swing.JLabel();
        normalSnesoryRadio = new javax.swing.JRadioButton();
        deficitSensoryRadio = new javax.swing.JRadioButton();
        percentLabel = new javax.swing.JLabel();
        deficitSensorySpinner = new javax.swing.JSpinner();
        meniLabel = new javax.swing.JLabel();
        suppleMeniRadio = new javax.swing.JRadioButton();
        kernigsMeniRadio = new javax.swing.JRadioButton();
        brudMeniRadio = new javax.swing.JRadioButton();
        autonoLabel = new javax.swing.JLabel();
        normalAutonoRadio = new javax.swing.JRadioButton();
        abnormalAutonoRadio = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        impressionLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        impressionTxtbx = new javax.swing.JTextArea();
        therapeuticsLabel = new javax.swing.JLabel();
        asaTheraRadio = new javax.swing.JRadioButton();
        heparinTheraRadio = new javax.swing.JRadioButton();
        coumadinTheraRadio = new javax.swing.JRadioButton();
        otherTheraRadio = new javax.swing.JRadioButton();
        otherTheraTxtbx = new javax.swing.JTextField();
        diagnosticsLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        diagnosticsTxtbx = new javax.swing.JTextArea();
        referralLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        referralTxtbx = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        summaryLabel = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        summaryList = new javax.swing.JList();
        caseNumLabel = new javax.swing.JLabel();
        patientIDLabel = new javax.swing.JLabel();
        recordDateLabel = new javax.swing.JLabel();
        recordDateData = new javax.swing.JLabel();
        patientIDData = new javax.swing.JLabel();
        caseNumData = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        discardBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        peLabel.setText("Physical Examination:");

        apasLabel.setText("APAS");

        heightLabel.setText("Height:");

        weightLabel.setText("Weight:");

        bpLabel.setText("BP:");

        hrLabel.setText("HR:");

        rrLabel.setText("RR:");

        generalLabel.setText("General:");

        generalTxtbx.setColumns(20);
        generalTxtbx.setRows(5);
        jScrollPane1.setViewportView(generalTxtbx);

        headLabel.setText("Head/Face/Hair:");

        eyesLabel.setText("Eyes:");

        conjuctivaeLabel.setText("Conjunctivae:");

        scleraeLabel.setText("Sclerae:");

        alopeciaRadio.setText("Alopecia");

        malarRadio.setText("Malar Rash");

        discoidRadio.setText("Discoid Rash");

        pinkRadio.setText("Pink");

        paleRadio.setText("Pale");

        anictaericRadio.setText("Anicteric");

        ictericRadio.setText("Icteric");

        earsLabel.setText("Ears:");

        earsTxtbx.setColumns(20);
        earsTxtbx.setRows(5);
        jScrollPane5.setViewportView(earsTxtbx);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eyesLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(conjuctivaeLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(pinkRadio))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(scleraeLabel)
                                        .addGap(46, 46, 46)
                                        .addComponent(anictaericRadio)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paleRadio)
                                    .addComponent(ictericRadio)))
                            .addComponent(generalLabel)
                            .addComponent(headLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(alopeciaRadio)
                                .addGap(18, 18, 18)
                                .addComponent(malarRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discoidRadio))
                            .addComponent(earsLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(heightLabel)
                                                .addGap(13, 13, 13)
                                                .addComponent(heightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bpLabel))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(peLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(apasLabel)))
                                        .addGap(7, 7, 7))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(weightLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(hrLabel)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hrSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bpSPinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(rrLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rrSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peLabel)
                    .addComponent(apasLabel))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpLabel)
                    .addComponent(bpSPinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rrLabel)
                    .addComponent(rrSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrLabel)
                    .addComponent(hrSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alopeciaRadio)
                    .addComponent(malarRadio)
                    .addComponent(discoidRadio))
                .addGap(18, 18, 18)
                .addComponent(eyesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conjuctivaeLabel)
                    .addComponent(pinkRadio)
                    .addComponent(paleRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scleraeLabel)
                    .addComponent(anictaericRadio)
                    .addComponent(ictericRadio))
                .addGap(18, 18, 18)
                .addComponent(earsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Page 1", jPanel3);

        noseLabel.setText("Nose:");

        noseTxtbx.setColumns(20);
        noseTxtbx.setRows(5);
        jScrollPane3.setViewportView(noseTxtbx);

        oralLabel.setText("Oral Cavity:");

        oralTxtbx.setColumns(20);
        oralTxtbx.setRows(5);
        jScrollPane4.setViewportView(oralTxtbx);

        throatLabel.setText("Throat:");

        throatTxtbx.setColumns(20);
        throatTxtbx.setRows(5);
        jScrollPane2.setViewportView(throatTxtbx);

        neckLabel.setText("Neck and Thyroid:");

        normalNeckRadio.setText("Normal");

        thyroNeckLabel.setText("Thyromegaly");

        lymphLabel.setText("Lymph Nodes:");

        normalLymphRadio.setText("Normal");

        enlargedLymphLabel.setText("Enlarged");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noseLabel)
                            .addComponent(oralLabel)
                            .addComponent(throatLabel)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(neckLabel)
                                    .addComponent(lymphLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(normalNeckRadio)
                                    .addComponent(normalLymphRadio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enlargedLymphLabel)
                                    .addComponent(thyroNeckLabel))))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oralLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(throatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neckLabel)
                    .addComponent(normalNeckRadio)
                    .addComponent(thyroNeckLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lymphLabel)
                    .addComponent(normalLymphRadio)
                    .addComponent(enlargedLymphLabel))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Page 2", jPanel4);

        chestLabel.setText("Chest and lungs:");

        equalChestRadio.setText("Equal chest expansion");

        clearChestRadio.setText("Clear breath sounds");

        ralesChestRadio.setText("Rales");

        wheezeChestRadio.setText("Wheeze");

        heartLabel.setText("Heart:");

        regularHeartRadio.setText("Regular rhythm");

        murmurHeartLabel.setText("Murmur");

        abdomenLabel.setText("Abdomen:");

        normalAbdomenRadio.setText("Normal");

        hepaAbdomenRadio.setText("Hepatomegaly");

        splenoAbdomenRadio.setText("Splenomegaly");

        massAbdmonenRadio.setText("Mass");

        tenderAbdomenRadio.setText("Tender");

        extremitiesLabel.setText("Extremities:");

        pinkExtremaRadio.setText("Pink");

        paleExtremaRadio.setText("Pale");

        cyanoticExtremaRadio.setText("Cyanotic");

        gangreneExtremaRadio.setText("Gangrene");

        warmExtremaRadio.setText("Warm");

        coldExtremaLabel.setText("Cold");

        edemaExtremaRadio.setText("Edema");

        swellingExtremaRadio.setText("Joint swelling");

        pulsesLabel.setText("Pulses:");

        fullPulseRadio.setText("Full");

        weakPulseRadio.setText("Weak");

        equalPulseRadio.setText("Equal");

        absentPulseRadio.setText("Absent");

        skinLabel.setText("Skin:");

        rivedoSkinRadio.setText("Livedo reticularis ");

        normalSkinRadio.setText("Normal");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chestLabel)
                    .addComponent(abdomenLabel)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equalChestRadio)
                            .addComponent(clearChestRadio)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(heartLabel)
                                .addGap(18, 18, 18)
                                .addComponent(regularHeartRadio)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(murmurHeartLabel)
                            .addComponent(wheezeChestRadio)
                            .addComponent(ralesChestRadio)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(splenoAbdomenRadio)
                            .addComponent(extremitiesLabel)
                            .addComponent(pulsesLabel)
                            .addComponent(fullPulseRadio)
                            .addComponent(weakPulseRadio)
                            .addComponent(normalAbdomenRadio)
                            .addComponent(hepaAbdomenRadio)
                            .addComponent(pinkExtremaRadio)
                            .addComponent(paleExtremaRadio)
                            .addComponent(cyanoticExtremaRadio)
                            .addComponent(gangreneExtremaRadio)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(skinLabel)
                                .addGap(18, 18, 18)
                                .addComponent(normalSkinRadio)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equalPulseRadio)
                            .addComponent(absentPulseRadio)
                            .addComponent(swellingExtremaRadio)
                            .addComponent(edemaExtremaRadio)
                            .addComponent(coldExtremaLabel)
                            .addComponent(warmExtremaRadio)
                            .addComponent(tenderAbdomenRadio)
                            .addComponent(massAbdmonenRadio)
                            .addComponent(rivedoSkinRadio))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chestLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equalChestRadio)
                    .addComponent(ralesChestRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearChestRadio)
                    .addComponent(wheezeChestRadio))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartLabel)
                    .addComponent(regularHeartRadio)
                    .addComponent(murmurHeartLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(abdomenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(normalAbdomenRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hepaAbdomenRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(splenoAbdomenRadio)
                        .addGap(18, 18, 18)
                        .addComponent(extremitiesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pinkExtremaRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paleExtremaRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cyanoticExtremaRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gangreneExtremaRadio)
                        .addGap(18, 18, 18)
                        .addComponent(pulsesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullPulseRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weakPulseRadio)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(skinLabel)
                            .addComponent(normalSkinRadio)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(massAbdmonenRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tenderAbdomenRadio)
                        .addGap(62, 62, 62)
                        .addComponent(warmExtremaRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coldExtremaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edemaExtremaRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(swellingExtremaRadio)
                        .addGap(39, 39, 39)
                        .addComponent(equalPulseRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(absentPulseRadio)
                        .addGap(18, 18, 18)
                        .addComponent(rivedoSkinRadio)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Page 3", jPanel5);

        neuroLabel.setText("Nerologic:");

        gcsLabel.setText("GCS:");

        eLabel.setText("E");

        vLabel.setText("V");

        mLabel.setText("M");

        cranialLabel.setText("Cranial Nerves:");

        intactCranialRadio.setText("Intact");

        abnormalCranialRadio.setText("Abnormal");

        motorLabel.setText("Motor:");

        normalMotorRadio.setText("Normal (5/5)");

        motor1Radio.setText("1/5");

        motor2radio.setText("2/5");

        mototr3Radio.setText("3/5");

        mototr4Radio.setText("4/5");

        sensoryLabel.setText("Sensory:");

        normalSnesoryRadio.setText("Normal");

        deficitSensoryRadio.setText("Deficit");

        percentLabel.setText("%");

        meniLabel.setText("Meningeals:");

        suppleMeniRadio.setText("Supple neck");

        kernigsMeniRadio.setText("Kernig's");

        brudMeniRadio.setText("Brudzinski");

        autonoLabel.setText("Autonomics:");

        normalAutonoRadio.setText("Normal");

        abnormalAutonoRadio.setText("Abnormal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neuroLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cranialLabel)
                            .addComponent(gcsLabel)
                            .addComponent(motorLabel)
                            .addComponent(sensoryLabel)
                            .addComponent(meniLabel)
                            .addComponent(autonoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eGcsTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vGcsTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mGcsTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(abnormalCranialRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abnormalCranialTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(intactCranialRadio)
                            .addComponent(motor2radio)
                            .addComponent(kernigsMeniRadio)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(normalMotorRadio)
                                    .addComponent(motor1Radio)
                                    .addComponent(normalSnesoryRadio)
                                    .addComponent(suppleMeniRadio)
                                    .addComponent(normalAutonoRadio))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(abnormalAutonoRadio)
                                    .addComponent(brudMeniRadio)
                                    .addComponent(mototr4Radio)
                                    .addComponent(mototr3Radio)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(deficitSensoryRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deficitSensorySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(percentLabel)))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(neuroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gcsLabel)
                    .addComponent(eLabel)
                    .addComponent(vLabel)
                    .addComponent(mLabel)
                    .addComponent(eGcsTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vGcsTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mGcsTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cranialLabel)
                    .addComponent(intactCranialRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abnormalCranialRadio)
                    .addComponent(abnormalCranialTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorLabel)
                    .addComponent(normalMotorRadio)
                    .addComponent(mototr3Radio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motor1Radio)
                    .addComponent(mototr4Radio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(motor2radio)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sensoryLabel)
                    .addComponent(normalSnesoryRadio)
                    .addComponent(deficitSensoryRadio)
                    .addComponent(percentLabel)
                    .addComponent(deficitSensorySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meniLabel)
                    .addComponent(suppleMeniRadio)
                    .addComponent(brudMeniRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kernigsMeniRadio)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autonoLabel)
                    .addComponent(normalAutonoRadio)
                    .addComponent(abnormalAutonoRadio))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Page 4", jPanel1);

        impressionLabel.setText("Present working impressions:");

        impressionTxtbx.setColumns(20);
        impressionTxtbx.setRows(5);
        jScrollPane6.setViewportView(impressionTxtbx);

        therapeuticsLabel.setText("Therapeutics:");

        asaTheraRadio.setText("ASA");

        heparinTheraRadio.setText("Heparin");

        coumadinTheraRadio.setText("Coumadin");

        otherTheraRadio.setText("Others:");

        diagnosticsLabel.setText("Diagnostics:");

        diagnosticsTxtbx.setColumns(20);
        diagnosticsTxtbx.setRows(5);
        jScrollPane7.setViewportView(diagnosticsTxtbx);

        referralLabel.setText("Referrals:");

        referralTxtbx.setColumns(20);
        referralTxtbx.setRows(5);
        jScrollPane8.setViewportView(referralTxtbx);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(asaTheraRadio)
                                .addGap(43, 43, 43)
                                .addComponent(coumadinTheraRadio))
                            .addComponent(therapeuticsLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(heparinTheraRadio)
                                .addGap(25, 25, 25)
                                .addComponent(otherTheraRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(otherTheraTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(impressionLabel)
                            .addComponent(diagnosticsLabel)
                            .addComponent(referralLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(impressionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(diagnosticsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(therapeuticsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asaTheraRadio)
                    .addComponent(coumadinTheraRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heparinTheraRadio)
                    .addComponent(otherTheraRadio)
                    .addComponent(otherTheraTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(referralLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Page 5", jPanel2);

        summaryLabel.setText("Summary:");

        refreshBtn.setText("Refresh");

        summaryList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(summaryList);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        caseNumLabel.setText("Case Number:");

        patientIDLabel.setText("Patient ID:");

        recordDateLabel.setText("Date Recorded:");

        recordDateData.setText("[dd/MM/yyyy]");

        patientIDData.setText("[patientID]");

        caseNumData.setText("[caseNum]");

        submitBtn.setText("Submit");

        discardBtn.setText("Discard");
        discardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(summaryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(recordDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recordDateData))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caseNumLabel)
                                    .addComponent(patientIDLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientIDData)
                                    .addComponent(caseNumData))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(discardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summaryLabel)
                    .addComponent(refreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caseNumLabel)
                    .addComponent(caseNumData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDLabel)
                    .addComponent(patientIDData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordDateLabel)
                    .addComponent(recordDateData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(discardBtn))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Submit/Discard", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void discardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardBtnActionPerformed
        dispose();
    }//GEN-LAST:event_discardBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abdomenLabel;
    private javax.swing.JRadioButton abnormalAutonoRadio;
    private javax.swing.JRadioButton abnormalCranialRadio;
    private javax.swing.JTextField abnormalCranialTxtbx;
    private javax.swing.JRadioButton absentPulseRadio;
    private javax.swing.JRadioButton alopeciaRadio;
    private javax.swing.JRadioButton anictaericRadio;
    private javax.swing.JLabel apasLabel;
    private javax.swing.JRadioButton asaTheraRadio;
    private javax.swing.JLabel autonoLabel;
    private javax.swing.JLabel bpLabel;
    private javax.swing.JSpinner bpSPinner;
    private javax.swing.JRadioButton brudMeniRadio;
    private javax.swing.JLabel caseNumData;
    private javax.swing.JLabel caseNumLabel;
    private javax.swing.JLabel chestLabel;
    private javax.swing.JRadioButton clearChestRadio;
    private javax.swing.JRadioButton coldExtremaLabel;
    private javax.swing.JLabel conjuctivaeLabel;
    private javax.swing.JRadioButton coumadinTheraRadio;
    private javax.swing.JLabel cranialLabel;
    private javax.swing.JRadioButton cyanoticExtremaRadio;
    private javax.swing.JRadioButton deficitSensoryRadio;
    private javax.swing.JSpinner deficitSensorySpinner;
    private javax.swing.JLabel diagnosticsLabel;
    private javax.swing.JTextArea diagnosticsTxtbx;
    private javax.swing.JButton discardBtn;
    private javax.swing.JRadioButton discoidRadio;
    private javax.swing.JTextField eGcsTxtbx;
    private javax.swing.JLabel eLabel;
    private javax.swing.JLabel earsLabel;
    private javax.swing.JTextArea earsTxtbx;
    private javax.swing.JRadioButton edemaExtremaRadio;
    private javax.swing.JRadioButton enlargedLymphLabel;
    private javax.swing.JRadioButton equalChestRadio;
    private javax.swing.JRadioButton equalPulseRadio;
    private javax.swing.JLabel extremitiesLabel;
    private javax.swing.JLabel eyesLabel;
    private javax.swing.JRadioButton fullPulseRadio;
    private javax.swing.JRadioButton gangreneExtremaRadio;
    private javax.swing.JLabel gcsLabel;
    private javax.swing.JLabel generalLabel;
    private javax.swing.JTextArea generalTxtbx;
    private javax.swing.JLabel headLabel;
    private javax.swing.JLabel heartLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JSpinner heightSpinner;
    private javax.swing.JRadioButton hepaAbdomenRadio;
    private javax.swing.JRadioButton heparinTheraRadio;
    private javax.swing.JLabel hrLabel;
    private javax.swing.JSpinner hrSpinner;
    private javax.swing.JRadioButton ictericRadio;
    private javax.swing.JLabel impressionLabel;
    private javax.swing.JTextArea impressionTxtbx;
    private javax.swing.JRadioButton intactCranialRadio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton kernigsMeniRadio;
    private javax.swing.JLabel lymphLabel;
    private javax.swing.JTextField mGcsTxtbx;
    private javax.swing.JLabel mLabel;
    private javax.swing.JRadioButton malarRadio;
    private javax.swing.JRadioButton massAbdmonenRadio;
    private javax.swing.JLabel meniLabel;
    private javax.swing.JRadioButton motor1Radio;
    private javax.swing.JRadioButton motor2radio;
    private javax.swing.JLabel motorLabel;
    private javax.swing.JRadioButton mototr3Radio;
    private javax.swing.JRadioButton mototr4Radio;
    private javax.swing.JRadioButton murmurHeartLabel;
    private javax.swing.JLabel neckLabel;
    private javax.swing.JLabel neuroLabel;
    private javax.swing.JRadioButton normalAbdomenRadio;
    private javax.swing.JRadioButton normalAutonoRadio;
    private javax.swing.JRadioButton normalLymphRadio;
    private javax.swing.JRadioButton normalMotorRadio;
    private javax.swing.JRadioButton normalNeckRadio;
    private javax.swing.JRadioButton normalSkinRadio;
    private javax.swing.JRadioButton normalSnesoryRadio;
    private javax.swing.JLabel noseLabel;
    private javax.swing.JTextArea noseTxtbx;
    private javax.swing.JLabel oralLabel;
    private javax.swing.JTextArea oralTxtbx;
    private javax.swing.JRadioButton otherTheraRadio;
    private javax.swing.JTextField otherTheraTxtbx;
    private javax.swing.JRadioButton paleExtremaRadio;
    private javax.swing.JRadioButton paleRadio;
    private javax.swing.JLabel patientIDData;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JLabel peLabel;
    private javax.swing.JLabel percentLabel;
    private javax.swing.JRadioButton pinkExtremaRadio;
    private javax.swing.JRadioButton pinkRadio;
    private javax.swing.JLabel pulsesLabel;
    private javax.swing.JRadioButton ralesChestRadio;
    private javax.swing.JLabel recordDateData;
    private javax.swing.JLabel recordDateLabel;
    private javax.swing.JLabel referralLabel;
    private javax.swing.JTextArea referralTxtbx;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JRadioButton regularHeartRadio;
    private javax.swing.JRadioButton rivedoSkinRadio;
    private javax.swing.JLabel rrLabel;
    private javax.swing.JSpinner rrSpinner;
    private javax.swing.JLabel scleraeLabel;
    private javax.swing.JLabel sensoryLabel;
    private javax.swing.JLabel skinLabel;
    private javax.swing.JRadioButton splenoAbdomenRadio;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JList summaryList;
    private javax.swing.JRadioButton suppleMeniRadio;
    private javax.swing.JRadioButton swellingExtremaRadio;
    private javax.swing.JRadioButton tenderAbdomenRadio;
    private javax.swing.JLabel therapeuticsLabel;
    private javax.swing.JLabel throatLabel;
    private javax.swing.JTextArea throatTxtbx;
    private javax.swing.JRadioButton thyroNeckLabel;
    private javax.swing.JTextField vGcsTxtbx;
    private javax.swing.JLabel vLabel;
    private javax.swing.JRadioButton warmExtremaRadio;
    private javax.swing.JRadioButton weakPulseRadio;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JSpinner weightSpinner;
    private javax.swing.JRadioButton wheezeChestRadio;
    // End of variables declaration//GEN-END:variables
}
