package org.gro.texteditor;

public class Properties {

    /*
            Calculating coefficients for letters is done by
            first drawing the letter with fixed numbers and
            finding ratios of one fixed number to another
     */

    /*
            H/W = 5/3
            Padding:
                5 on each side for width
                20 on each side for height
                Line height limits: 20 - 120
                Line width limits: 5 - 65

                height = 20, width = 10
     */
    public static double height = 30.0,
                          width = 15.0;
    public static double lineLimit = 1040 - 2 * width;

}