import java.util.Scanner;

public class P21 {
    public static int func(int n) {
        int iCount = 0;
        int iFactor = 1;
        int iLowerNum = 0;
        int iCurrNum = 0;
        int iHigherNum = 0;
        while (n / iFactor != 0) {
            iLowerNum = n - (n / iFactor) * iFactor;
            iCurrNum = (n / iFactor) % 10;
            iHigherNum = n / (iFactor * 10);
            switch (iCurrNum) {
                case 0:
                    iCount += iHigherNum * iFactor;
                    break;
                case 1:
                    iCount += iHigherNum * iFactor;
                    break;
                case 2:
                    iCount += iHigherNum * iFactor + iLowerNum + 1;
                    break;
                default:
                    iCount += (iHigherNum + 1) * iFactor;
                    break;
            }
            iFactor *= 10;
        }
        return iCount;
    }
}
