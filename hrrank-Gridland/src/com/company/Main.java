package com.company;

import java.util.*;
import java.awt.*;

class myComparator implements Comparator<Point>{
    public int compare(Point p1, Point p2){
        return p1.x - p2.x;
    }
}