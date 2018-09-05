/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmarker;

import java.awt.Color;

/**
 *
 * @author Peter J. Schueffler
 */
public abstract class LegendElement extends javax.swing.JToggleButton {

    Color bg = getBackground(); // for selection: a different color
    tmarker t = null; //parent's parent
    
    /**
     * Creates new form LegendElement
     */
    public LegendElement() {
        initComponents();
        setAlignmentX((float) 0.5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setAlignmentX(0.5F);
        setFocusable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // on double click, select the color for the corresponding element
        if (evt.getClickCount()>1) {
            doubleClickAction();
        }
        // on single click, select the corresponding element
        else if (evt.getClickCount()==1) {
            if (isSelected()) {
                if (t!=null) {
                    t.getTMAView().reliefRecentPolyLine();
                }
                if (t!=null) {
                    setSelected(true);
                }
            }
            if (t!=null && t!=null) {
                t.getTMAView().enablePopupMenu(t.isROIselected());
            }  
        }
    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    abstract void doubleClickAction();

}