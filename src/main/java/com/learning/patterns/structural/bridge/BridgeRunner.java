package com.learning.patterns.structural.bridge;

import com.learning.patterns.structural.bridge.vo.Stack;
import com.learning.patterns.structural.bridge.vo.StackFIFO;
import com.learning.patterns.structural.bridge.vo.StackHanoi;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class BridgeRunner {
    public static void main(String[] args) {
        Stack[] stacks = {new Stack("array"), new Stack("list"),
                new StackFIFO(), new StackHanoi()};
        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                stacks[j].push(i);
            }
        }
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++) {
            stacks[3].push(rn.nextInt(20));
        }
        for (Stack stack : stacks) {
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + "  ");
            }
            System.out.println();
        }
        System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
    }
}
