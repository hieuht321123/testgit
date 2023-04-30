/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author HieuHT
 */
public class Nguoi {

    String ten;
    String diaChi;

    public Nguoi() {
        super();
    }

    public Nguoi(String ten, String diaChi) {
        super();
        this.ten = ten;
        this.diaChi = diaChi;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Nguoi n = (Nguoi) obj;
        return this.ten == n.ten;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
