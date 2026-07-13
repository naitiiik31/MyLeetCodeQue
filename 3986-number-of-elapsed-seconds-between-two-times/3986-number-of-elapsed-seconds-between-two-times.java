class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int h1=Integer.parseInt(startTime.substring(0,2))*3600;
        int m1=Integer.parseInt(startTime.substring(3,5))*60;
        int s1=Integer.parseInt(startTime.substring(6,8));

        int h2=Integer.parseInt(endTime.substring(0,2))*3600;
        int m2=Integer.parseInt(endTime.substring(3,5))*60;
        int s2=Integer.parseInt(endTime.substring(6,8));

        return (h2-h1)+(m2-m1)+(s2-s1);
    }
}