/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bulibrary;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

/**
 *
 * @author Mr.Phiphat
 */
public class JPMainmenu extends javax.swing.JPanel {

    /**
     * Creates new form JPMainmenu  public JPMainmenu() {
        initComponents();
    }
     */
    public JPMainmenu() {
        initComponents();
        setPreferredSize(new Dimension(1536, 864)); // กำหนดขนาดของ JPanel เพื่อให้ตรงกับ Test
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scroll.setHorizontalScrollBar(sp);
        scroll.getViewport().setBackground(Color.WHITE);
    }
    public  void setMenu(boolean isUser,boolean isGmae,boolean isRoom,boolean isbooking){
        User.setVisible(isUser);
        game.setVisible(isGmae);
        Room.setVisible(isRoom);
        Booking.setVisible(isbooking);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menubar = new javax.swing.JPanel();
        btnLogo = new javax.swing.JLabel();
        btnUser = new javax.swing.JLabel();
        btnBookroom = new javax.swing.JLabel();
        btnBookGame = new javax.swing.JLabel();
        btnBooking = new javax.swing.JLabel();
        btnExite = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        game = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        Room = new javax.swing.JPanel();
        User = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Booking = new javax.swing.JPanel();
        Changpnal = new javax.swing.JTabbedPane();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menubar.setBackground(new java.awt.Color(255, 255, 255));
        Menubar.setOpaque(false);
        Menubar.setPreferredSize(new java.awt.Dimension(354, 864));
        Menubar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BU library.png"))); // NOI18N
        btnLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menubar.add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"))); // NOI18N
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserMouseExited(evt);
            }
        });
        Menubar.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 250, 280, 50));

        btnBookroom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"))); // NOI18N
        btnBookroom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBookroom.setPreferredSize(new java.awt.Dimension(166, 31));
        btnBookroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookroomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookroomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookroomMouseExited(evt);
            }
        });
        Menubar.add(btnBookroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 350, 280, 60));

        btnBookGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"))); // NOI18N
        btnBookGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBookGame.setPreferredSize(new java.awt.Dimension(166, 31));
        btnBookGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookGameMouseExited(evt);
            }
        });
        Menubar.add(btnBookGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 450, 280, 50));

        btnBooking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"))); // NOI18N
        btnBooking.setToolTipText("");
        btnBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBooking.setPreferredSize(new java.awt.Dimension(166, 31));
        btnBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookingMouseExited(evt);
            }
        });
        Menubar.add(btnBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 550, 280, 50));

        btnExite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Exit.png"))); // NOI18N
        btnExite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExite.setPreferredSize(new java.awt.Dimension(166, 31));
        btnExite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExiteMouseExited(evt);
            }
        });
        Menubar.add(btnExite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 280, 50));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Rectangle 4598.png"))); // NOI18N
        Menubar.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        game.setBackground(new java.awt.Color(236, 248, 255));
        game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scroll.setForeground(new java.awt.Color(255, 255, 255));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setToolTipText("");
        scroll.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scroll.setAlignmentX(10.0F);
        scroll.setAlignmentY(10.0F);
        scroll.setAutoscrolls(true);
        scroll.setColumnHeaderView(null);
        scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scroll.setNextFocusableComponent(jPanel4);
        scroll.setOpaque(false);
        scroll.setViewportView(jLabel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Kuy");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1220, 90, 60));

        jLabel3.setText("Kuy");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 60));

        scroll.setViewportView(jPanel4);

        game.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1170, 750));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Bgscroll.png"))); // NOI18N
        game.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1230, 810));

        add(game, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -8, 1280, 890));

        Room.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout RoomLayout = new javax.swing.GroupLayout(Room);
        Room.setLayout(RoomLayout);
        RoomLayout.setHorizontalGroup(
            RoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        RoomLayout.setVerticalGroup(
            RoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );

        add(Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1280, -1));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Profile edite.png"))); // NOI18N
        User.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 81, 1129, 733));

        add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1280, 870));

        Booking.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout BookingLayout = new javax.swing.GroupLayout(Booking);
        Booking.setLayout(BookingLayout);
        BookingLayout.setHorizontalGroup(
            BookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        BookingLayout.setVerticalGroup(
            BookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        add(Booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1280, 870));

        Changpnal.setBackground(new java.awt.Color(255, 255, 255));
        add(Changpnal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -40, 1270, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/UserEn.png"));
        btnUser.setIcon(icon);
    }//GEN-LAST:event_btnUserMouseEntered

    private void btnUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"));
        btnUser.setIcon(icon);
    }//GEN-LAST:event_btnUserMouseExited

    private void btnBookroomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookroomMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking roomEn.png"));
        btnBookroom.setIcon(icon);
    }//GEN-LAST:event_btnBookroomMouseEntered

    private void btnBookroomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookroomMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"));
        btnBookroom.setIcon(icon);
    }//GEN-LAST:event_btnBookroomMouseExited

    private void btnBookGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookGameMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGameEn.png"));
        btnBookGame.setIcon(icon);
    }//GEN-LAST:event_btnBookGameMouseEntered

    private void btnBookGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookGameMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"));
        btnBookGame.setIcon(icon);
    }//GEN-LAST:event_btnBookGameMouseExited

    private void btnBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBookingEn.png"));
        btnBooking.setIcon(icon);
    }//GEN-LAST:event_btnBookingMouseEntered

    private void btnBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"));
        btnBooking.setIcon(icon);
    }//GEN-LAST:event_btnBookingMouseExited

    private void btnExiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExiteMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/ExitEn.png"));
        btnExite.setIcon(icon);
    }//GEN-LAST:event_btnExiteMouseEntered

    private void btnExiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExiteMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Exit.png"));
        btnExite.setIcon(icon);
    }//GEN-LAST:event_btnExiteMouseExited

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/UserEn.png"));
        btnUser.setIcon(icon);
        Changpnal.setComponentAt(0, User);
        Changpnal.revalidate();
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnBookroomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookroomMouseClicked
        Changpnal.setComponentAt(0, Room);
        Changpnal.revalidate();
    }//GEN-LAST:event_btnBookroomMouseClicked

    private void btnBookGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookGameMouseClicked
        Changpnal.setComponentAt(0, game);
        Changpnal.revalidate();
    }//GEN-LAST:event_btnBookGameMouseClicked

    private void btnBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseClicked
        Changpnal.setComponentAt(0, Booking);
        Changpnal.revalidate();
    }//GEN-LAST:event_btnBookingMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPanel Booking;
    private javax.swing.JTabbedPane Changpnal;
    private javax.swing.JPanel Menubar;
    private javax.swing.JPanel Room;
    private javax.swing.JPanel User;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnBookGame;
    private javax.swing.JLabel btnBooking;
    private javax.swing.JLabel btnBookroom;
    private javax.swing.JLabel btnExite;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnUser;
    private javax.swing.JPanel game;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
