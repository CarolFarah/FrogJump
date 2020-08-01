// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
public int solution(int X, int Y, int D) {
return (int) Math.ceil((double)(Y - X) / (double) D);
}
}
