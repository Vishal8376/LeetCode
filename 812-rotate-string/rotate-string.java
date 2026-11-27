class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() != s.length())
            return false;

        String ns = s + s;
        return ns.indexOf(goal) != -1;
    }
}