package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    ArrayList<Point> locs;

    public Solution() {
        locs = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long rows = in.nextInt(), cols = in.nextInt();
        int tracks = in.nextInt();
        ArrayList<Integer> check = new ArrayList<>();
        HashMap<Integer, Solution> found = new HashMap<>();

        for (int i = 0; i < tracks; i++) {
            int curRow = in.nextInt(), start = in.nextInt(), end = in.nextInt();
            if (!found.containsKey(curRow)) {
                Solution sol = new Solution();
                sol.locs.add(new Point(start, end));
                check.add(curRow);
                found.put(curRow, sol);
            } else {
                Solution sol = found.get(curRow);
                sol.locs.add(new Point(start, end));
            }
        }

        //Computing the total # of tracks - those of train tracks
        long total = rows * cols;
        for (int r : check) {
            //  System.out.println(r);
            Solution sol = found.get(r);
            ArrayList<Point> myPoints = sol.locs;
            Collections.sort(myPoints, new myComparator());
            Point first = myPoints.get(0);
            total -= (first.y - first.x + 1);
            int lastEnd = first.y + 1;
            for (int i = 1; i < myPoints.size(); i++) {
                Point curPoint = myPoints.get(i);
                if (curPoint.y < lastEnd) continue;
                int begin = Math.max(curPoint.x, lastEnd);
                total -= (curPoint.y - begin + 1);
                lastEnd = curPoint.y + 1;
            }
        }

        System.out.println(total);
    }
}
