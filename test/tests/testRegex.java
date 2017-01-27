/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class testRegex {

   
    public static void main(String[] args) throws Exception {
        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("-?\\.?(\\d+((\\.|,| )\\d+)?)").matcher("   2              1-1-8-2 Up             Active         NoUpgrade   -20.9 dBm -19.8 dBm      3.2931 Active            Init       ");
        while (m.find()) {
          allMatches.add(m.group());
        }
        System.out.println(allMatches);
        
        
    }

}
