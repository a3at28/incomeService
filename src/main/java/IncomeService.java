public class IncomeService {
    int calculate (int depositAmount) {
        int percent = 3;
        int income = (percent * depositAmount) / 100;
        return income;
    }
}
