class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int extra = Math.min(additionalTank, (mainTank - 1) / 4);
        return (mainTank + extra) * 10;
    }
}