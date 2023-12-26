/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.FileTXT;

import Models.SinhVien;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class FileListSinhVien {
    public FileListSinhVien() {
    }
    public void WriteObject(String fileName, ArrayList<SinhVien> sinhvien) throws FileNotFoundException, IOException {
        ObjectOutputStream oos;
        try (FileOutputStream fs = new FileOutputStream(fileName)) {
            oos = new ObjectOutputStream(fs);
            oos.writeObject(sinhvien);
        }
        oos.close();
    }
    public ArrayList ReadObject(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList kq = null;
        ObjectInputStream ois;
        try (FileInputStream fi = new FileInputStream(fileName)) {
            ois = new ObjectInputStream(fi);
            kq =(ArrayList) ois.readObject();
            //kq.add(ois.readObject());
        }
        ois.close();
        return kq;
    }
}
