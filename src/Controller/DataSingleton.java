/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Account;
import Models.Lop;
import Models.TrucNhat;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DataSingleton {

    private static DataSingleton instance;
    private ArrayList<Lop> danhSachLop;
    private DataSingleton() {
        danhSachLop = new ArrayList<>();
        danhSachTN = new ArrayList[10];
        for (int i = 0; i < danhSachTN.length; i++) {
            danhSachTN[i] = new ArrayList<>();
        }
    }
    public ArrayList<TrucNhat> getDanhSachTN(int index) {
        return danhSachTN[index];
    }

    public void setDanhSachTN(int index, ArrayList<TrucNhat> danhsachtn) {
        this.danhSachTN[index] = danhsachtn;
    }
    private ArrayList<TrucNhat>[] danhSachTN;
    public static DataSingleton getInstance() {
        if (instance == null) {
            instance = new DataSingleton();
        }
        return instance;
    }

    public ArrayList<Lop> getDanhSachLop() {
        return danhSachLop;
    }

    public void setDanhSachLop(ArrayList<Lop> danhSachLop) {
        this.danhSachLop = danhSachLop;
    }

    public ArrayList<TrucNhat>[] getAllDanhSachTrucNhatArray() {
        return danhSachTN;
    }
}
