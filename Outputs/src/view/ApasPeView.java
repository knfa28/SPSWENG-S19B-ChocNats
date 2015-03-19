package view;

import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class ApasPeView extends javax.swing.JFrame {
    public ApasPeView() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        initComponents();
        generalData.setEditable(false);
        earsData.setEditable(false);
        noseData.setEditable(false);
        oralData.setEditable(false);
        throatData.setEditable(false);
        setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peLabel = new javax.swing.JLabel();
        patientIDLabel = new javax.swing.JLabel();
        generalLabel = new javax.swing.JLabel();
        headLabel = new javax.swing.JLabel();
        eyesLabel = new javax.swing.JLabel();
        earsLabel = new javax.swing.JLabel();
        noseLabel = new javax.swing.JLabel();
        oralLabel = new javax.swing.JLabel();
        peTypeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        neckLabel = new javax.swing.JLabel();
        lymphLabel = new javax.swing.JLabel();
        chestLabel = new javax.swing.JLabel();
        heartLabel = new javax.swing.JLabel();
        abdomenLabel = new javax.swing.JLabel();
        extremitiesLabel = new javax.swing.JLabel();
        throatLabel = new javax.swing.JLabel();
        skinLabel = new javax.swing.JLabel();
        neurologicLabel = new javax.swing.JLabel();
        pulsesLabel = new javax.swing.JLabel();
        generalData = new javax.swing.JTextField();
        earsData = new javax.swing.JTextField();
        noseData = new javax.swing.JTextField();
        patientIDData = new javax.swing.JLabel();
        caseNumLabel = new javax.swing.JLabel();
        caseNumData = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        recordDateLabel = new javax.swing.JLabel();
        modifyDateLabel = new javax.swing.JLabel();
        recordDateData = new javax.swing.JLabel();
        modifyDateData = new javax.swing.JLabel();
        headData = new javax.swing.JLabel();
        eyesData = new javax.swing.JLabel();
        neckData = new javax.swing.JLabel();
        lymphData = new javax.swing.JLabel();
        chestData = new javax.swing.JLabel();
        neurologicData = new javax.swing.JLabel();
        skinData = new javax.swing.JLabel();
        pulsesData = new javax.swing.JLabel();
        extremitiesData = new javax.swing.JLabel();
        abdomenData = new javax.swing.JLabel();
        heartData = new javax.swing.JLabel();
        oralData = new javax.swing.JTextField();
        throatData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        peLabel.setText("Physical Examination:");

        patientIDLabel.setText("Patient ID:");

        generalLabel.setText("General:");

        headLabel.setText("Head/Face/Hair:");

        eyesLabel.setText("Eyes:");

        earsLabel.setText("Ears:");

        noseLabel.setText("Nose:");

        oralLabel.setText("Oral Cavity:");

        peTypeLabel.setText("APAS");

        neckLabel.setText("Neck and Thyroid:");

        lymphLabel.setText("Lymph Nodes:");

        chestLabel.setText("Chest and Lungs:");

        heartLabel.setText("Heart:");

        abdomenLabel.setText("Abdomen:");

        extremitiesLabel.setText("Extremities:");

        throatLabel.setText("Throat:");

        skinLabel.setText("Skin:");

        neurologicLabel.setText("Neurologic:");

        pulsesLabel.setText("Pulses:");

        patientIDData.setText("[patientID]");

        caseNumLabel.setText("Case Number:");

        caseNumData.setText("[caseNum]");

        backBtn.setText("Back");

        recordDateLabel.setText("Date Recorded:");

        modifyDateLabel.setText("Date Modified:");

        recordDateData.setText("[dd/MM/yyyy]");

        modifyDateData.setText("[dd/MM/yyyy]");

        headData.setText("[head]");

        eyesData.setText("[eyes]");

        neckData.setText("[neck]");

        lymphData.setText("[lymph]");

        chestData.setText("[chest]");

        neurologicData.setText("[neurologic]");

        skinData.setText("[skin]");

        pulsesData.setText("[pulses]");

        extremitiesData.setText("[extremities]");

        abdomenData.setText("[abdomen]");

        heartData.setText("[heart]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(peLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(peTypeLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noseData)
                            .addComponent(generalData)
                            .addComponent(earsData)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(throatLabel)
                                    .addComponent(generalLabel)
                                    .addComponent(oralLabel)
                                    .addComponent(noseLabel)
                                    .addComponent(earsLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(eyesLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(eyesData))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(headLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(headData)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(heartLabel)
                                            .addComponent(abdomenLabel)
                                            .addComponent(extremitiesLabel)
                                            .addComponent(pulsesLabel)
                                            .addComponent(skinLabel)
                                            .addComponent(chestLabel)
                                            .addComponent(neurologicLabel)
                                            .addComponent(lymphLabel)
                                            .addComponent(neckLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chestData)
                                            .addComponent(heartData)
                                            .addComponent(abdomenData)
                                            .addComponent(extremitiesData)
                                            .addComponent(pulsesData)
                                            .addComponent(skinData)
                                            .addComponent(lymphData)
                                            .addComponent(neckData)
                                            .addComponent(neurologicData))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(patientIDData))
                            .addComponent(patientIDLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(caseNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caseNumData)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recordDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recordDateData))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(modifyDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifyDateData)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(throatData, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oralData, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peLabel)
                    .addComponent(peTypeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDLabel)
                    .addComponent(patientIDData)
                    .addComponent(recordDateLabel)
                    .addComponent(recordDateData))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caseNumLabel)
                            .addComponent(caseNumData)
                            .addComponent(modifyDateLabel)
                            .addComponent(modifyDateData))
                        .addGap(18, 18, 18)
                        .addComponent(generalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generalData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(headLabel)
                            .addComponent(headData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eyesLabel)
                            .addComponent(eyesData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(earsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(earsData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noseData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oralLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oralData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(throatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(throatData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(neckLabel)
                            .addComponent(neckData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lymphLabel)
                            .addComponent(lymphData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chestLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heartLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abdomenLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extremitiesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pulsesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(skinLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(neurologicLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(backBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chestData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heartData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abdomenData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extremitiesData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pulsesData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(skinData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(neurologicData)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abdomenData;
    private javax.swing.JLabel abdomenLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel caseNumData;
    private javax.swing.JLabel caseNumLabel;
    private javax.swing.JLabel chestData;
    private javax.swing.JLabel chestLabel;
    private javax.swing.JTextField earsData;
    private javax.swing.JLabel earsLabel;
    private javax.swing.JLabel extremitiesData;
    private javax.swing.JLabel extremitiesLabel;
    private javax.swing.JLabel eyesData;
    private javax.swing.JLabel eyesLabel;
    private javax.swing.JTextField generalData;
    private javax.swing.JLabel generalLabel;
    private javax.swing.JLabel headData;
    private javax.swing.JLabel headLabel;
    private javax.swing.JLabel heartData;
    private javax.swing.JLabel heartLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lymphData;
    private javax.swing.JLabel lymphLabel;
    private javax.swing.JLabel modifyDateData;
    private javax.swing.JLabel modifyDateLabel;
    private javax.swing.JLabel neckData;
    private javax.swing.JLabel neckLabel;
    private javax.swing.JLabel neurologicData;
    private javax.swing.JLabel neurologicLabel;
    private javax.swing.JTextField noseData;
    private javax.swing.JLabel noseLabel;
    private javax.swing.JTextField oralData;
    private javax.swing.JLabel oralLabel;
    private javax.swing.JLabel patientIDData;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JLabel peLabel;
    private javax.swing.JLabel peTypeLabel;
    private javax.swing.JLabel pulsesData;
    private javax.swing.JLabel pulsesLabel;
    private javax.swing.JLabel recordDateData;
    private javax.swing.JLabel recordDateLabel;
    private javax.swing.JLabel skinData;
    private javax.swing.JLabel skinLabel;
    private javax.swing.JTextField throatData;
    private javax.swing.JLabel throatLabel;
    // End of variables declaration//GEN-END:variables
}
