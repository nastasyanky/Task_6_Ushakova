package P_Strateg_R;

public class Context_R {
    private Strategy_R strategy; // ссылка на алгоритм сортировки
    private int[] array;
    // данные (модель), к-е обрабатываются (включая сортировку)
    public  Context_R(Strategy_R strategy) {
        this.strategy = strategy;
    }
    public Strategy_R getStrategy_R() {
        return strategy; }

    public void sortArray_R(int[] array) {
        strategy.sort(array);
    }
}
