package com.learning.patterns.structural.facade;

import com.learning.patterns.structural.facade.vo.Line;
import com.learning.patterns.structural.facade.vo.Point;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class FacadeRunner {
    public static void main(String[] args) {
        // 3. Client uses the Facade
        Line line1 = new Line(new Point(2.0, 4.0), new Point(5.0, 7.0));
        line1.move(-2.0,-4.0);
        System.out.println("after move:  "+line1);
        line1.rotate(45.0);
        System.out.println("after rotate: "+line1);
        Line line2 = new Line(new Point(2.0, 1.0), new Point(2.866, 1.5));
        line2.rotate(30.0);
        System.out.println("30 degrees to 60 degrees: "+line2);
    }
}
