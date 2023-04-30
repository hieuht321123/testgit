/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.regex.Pattern;

/**
 *
 * @author HieuHT
 */
public class TEST {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("^[A-Za-z0-9 _]*[A-Za-z0-9][A-Za-z0-9 _]*$", "TEST_BB a1"));
    }
}
