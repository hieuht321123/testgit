/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author HieuHT
 */
public class Main {

    public static void main(String[] args) {
        Nguoi n1 = new Nguoi("tran van a", "ha noi");
        Nguoi n2 = new Nguoi("tran van a", "ha noi");
        Nguoi n12 = new Nguoi("tran van a2", "ha noi2");
        Set<Nguoi> nguois = new HashSet<>();
        nguois.add(n2);
        nguois.add(n1);
        nguois.add(n12);
        System.out.println(nguois.size());
        System.out.println(n1.equals(n2));
    }
}
