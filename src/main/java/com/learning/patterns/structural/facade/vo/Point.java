package com.learning.patterns.structural.facade.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class Point {
    private PointCarte pc;

    public Point(Double x, Double y) {
        pc = new PointCarte(x, y);
    }

    public void move(Double dx, Double dy) {
        pc.move(dx, dy);
    }

    public void rotate(Double angle, Point o) {
        double x = pc.getX() - o.pc.getX();
        double y = pc.getY() - o.pc.getY();
        PointPolar pp = new PointPolar(Math.sqrt(x * x + y * y),
                Math.atan2(y, x) * 180 / Math.PI);
        // 4. Wrapper maps
        pp.rotate(angle);
        System.out.println("  PointPolar is " + pp);
        String str = pp.toString();
        int i = str.indexOf('@');
        double r = Double.parseDouble(str.substring(1, i));
        double a = Double.parseDouble(str.substring(i + 1, str.length() - 1));
        pc = new PointCarte(r * Math.cos(a * Math.PI / 180) + o.pc.getX(),
                r * Math.sin(a * Math.PI / 180) + o.pc.getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "pc=" + pc +
                '}';
    }
}
