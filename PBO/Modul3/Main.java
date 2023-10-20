package Modul3;

import javax.swing.JOptionPane;
import Modul3.Mahasiswa.*;
import Modul3.MataKuliah.*;
import Modul3.Staff.Staff;
import Modul3.Staff.Dosen.*;
import Modul3.Staff.Presensi.PresensiStaff;

public class Main {
    public static void main(String[] args) {
        User user[] = new User[5];
        user[0] = new User("Katherin", "Bandung", "8 Juli 2004", "0123456789", "Mahasiswa");
        user[1] = new User("John", "Jakarta", "15 Mei 1990", "9876543210", "Dosen Tetap");
        user[2] = new User("Alice", "Surabaya", "21 Oktober 1985", "5555555555", "Karyawan");
        user[3] = new User("Bob", "Yogyakarta", "3 Maret 2000", "1111222233", "Dosen Honorer");
        user[4] = new User("Eva", "Semarang", "12 Desember 1995", "9999888877", "Mahasiswa");

        Sarjana sarjana[] = new Sarjana[2];
        sarjana[0] = new Sarjana(null, null, null, null, null, "1122041", null, null, 88, 78, 90);
        sarjana[1] = new Sarjana(null, null, null, null, null, "1122001", null, null, 65, 70, 60);

        Magister magister[] = new Magister[2];
        magister[0] = new Magister(null, null, null, null, null, "1322024", null, null, null, 87, 67, 89);
        magister[1] = new Magister(null, null, null, null, null, "1323044", null, null, null, 90, 57, 66);

        Doktor doktor[] = new Doktor[2];
        doktor[0] = new Doktor(null, null, null, null, null, "1223042", null, null, 86, 67, 77);
        doktor[1] = new Doktor(null, null, null, null, null, "1222021", null, null, 66, 65, 75);

        MataKuliah matkul[] = new MataKuliah[3];
        matkul[0] = new MataKuliah("IF-301", 3, "PBO");
        matkul[1] = new MataKuliah("IF-302", 4, "Basis Data");
        matkul[2] = new MataKuliah("IF-305", 3, "Matvec");

        MatkulAmbil matkulAmbil[] = new MatkulAmbil[3];
        matkulAmbil[0] = new MatkulAmbil(null, null, 68, 77, 56);

        Dosen dosen[] = new Dosen[3];
        dosen[0] = new Dosen(null, null, null, null, "987654321", null, null, null);
        dosen[1] = new Dosen(null, null, null, null, "112233445", null, null, null);
        dosen[2] = new Dosen(null, null, null, null, "777888999", null, null, null);

        PresensiStaff presensi[] = new PresensiStaff[3];
        presensi[0] = new PresensiStaff(null, null, 9.00);
        presensi[1] = new PresensiStaff(null, null, 11.00);
        presensi[2] = new PresensiStaff(null, null, 7.00);

        Staff staff = new Staff(null, null, null, null, null, null);
        
        String kodeMk = "";
        String nim = "";
        double rata = 0;
        String nik = "";

        int input = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Print User Data" +
                    "\n2. Print Nilai Akhir " +
                    "\n3. Print Rata-rata NA" +
                    "\n4. Print banyak mahasiswa yang tidak lulus" +
                    "\n5. Print matkul ambil" +
                    "\n6. Print total jam dosen mengajar" +
                    "\n7. Print gaji staff"));

        switch (input) {
            case 1:
                String nama = JOptionPane.showInputDialog("Masukkan Nama: ");

                for (int i = 0; i < user.length; i++) {
                    if (nama.equals(user[i].nama)) {
                        JOptionPane.showMessageDialog(null, user[i]);
                        break;
                    }
                }

                break;

            case 2:
                nim = JOptionPane.showInputDialog("Masukkan NIM: ");
                kodeMk = JOptionPane.showInputDialog("Masukkan Kode MK: ");

                for (int i = 0; i < sarjana.length; i++) {
                    if (nim.equals(sarjana[i].getNIM())) {
                        rata = (sarjana[i].getNilai1() + sarjana[i].getNilai2() + sarjana[i].getNilai3()) / 3;
                        JOptionPane.showMessageDialog(null, "Nilai Akhir: " + rata);
                        break;
                    }
                }

                for (int i = 0; i < magister.length; i++) {
                    if (nim.equals(magister[i].getNIM())) {
                        rata = (magister[i].getNilai1() + sarjana[i].getNilai2() + sarjana[i].getNilai3()) / 3;
                        JOptionPane.showMessageDialog(null, "Nilai Akhir: " + rata);
                        break;
                    }
                }

                for (int i = 0; i < doktor.length; i++) {
                    if (nim.equals(doktor[i].getNIM())) {
                        rata = (doktor[i].getSidang1() + doktor[i].getSidang2() + doktor[i].getSidang3()) / 3;
                        JOptionPane.showMessageDialog(null, "Nilai Akhir: " + rata);
                        break;
                    }
                }

                break;

            case 3:
                kodeMk = JOptionPane.showInputDialog("Masukkan Kode MK: ");

                for (int i = 0; i < matkul.length; i++) {
                    if (kodeMk.equals(matkul[i].getKode())) {
                        rata = (sarjana[i].getNilai1() + sarjana[i].getNilai2() + sarjana[i].getNilai3()) / 3 + rata;
                    }
                    JOptionPane.showMessageDialog(null, "Rata-rata Nilai Akhir: " + rata);
                    break;
                }

                break;

            case 4:
                kodeMk = JOptionPane.showInputDialog("Masukkan Kode MK: ");
                int na[] = new int[6];
                int numFailed = 0;

                for (int i = 0; i < matkul.length; i++) {
                    if (kodeMk.equals(matkul[i].getKode())) {
                        na[i] = (int) ((sarjana[i].getNilai1() + sarjana[i].getNilai2() + sarjana[i].getNilai3()) / 3);
                    }

                    for (int nilai : na) {
                        if (nilai < 56) {
                            numFailed++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, numFailed + " dari " + (sarjana.length + magister.length + doktor.length) + " mahasiswa tidak lulus matakuliah " + matkul[i].getNamaMK());
                    break;
                }

                break;

            case 5:
                nim = JOptionPane.showInputDialog("Masukkan NIM: ");

                for (int i = 0; i < matkulAmbil.length; i++) {
                    if (nim.equals(matkulAmbil[i].getMataKuliah())) {
                        JOptionPane.showMessageDialog(null, "Matkul Ambil: " + matkulAmbil[i].getMataKuliah() + "Presensi: " + matkulAmbil[i].getListPresensi());
                    }
                    break;
                }

                break;

            case 6:
                nik = JOptionPane.showInputDialog("Masukkan NIK: ");

                for (int i = 0; i < dosen.length; i++) {
                    if (nik.equals(dosen[i].getNIK())) {
                        JOptionPane.showMessageDialog(null, "Total jam dosen ngajar: " + presensi[i].getJam());
                    }
                    break;
                }

                break;

            case 7:
                int numHadir = 0;
    
                for (PresensiStaff presensi1 : presensi) {
                    if (presensi1.getClass().equals("Hadir")) {
                        numHadir++;
                    }
                }
                
                double salary = 0;
                if (staff.getStatus().equals("Karyawan")) {
                    salary = staff.getSalary() / 22 * numHadir;
                } else if (staff.getStatus().equals("Dosen Tetap")) {
                    int numUnits = getNumUnits(nik);
                    salary = staff.getSalary() + (numUnits * 25000);
                } else if (staff.getStatus().equals("Honorer")) {
                    int numUnits = getNumUnits(nik);
                    double honorPerSKS = getHonorPerSKS();
                    salary = numUnits * honorPerSKS;
                }
                JOptionPane.showMessageDialog(null, "Gaji: " + salary);
                break;
        }
    }

    private static double getHonorPerSKS() {
        return 0;
    }

    private static int getNumUnits(String nik) {
        return 0;
    }
}
