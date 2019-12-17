package Depandecy;

public class main {
    public static void main(String[] args) {
        SortAlgorithm bubblueSortAlgointhm = new bubblueSortAlgointhm();
        SortAlgorithm quicksortAlgointhm = new QuickSortAlgorithm();
        VeryComplexService business1 = new VeryComplexService(bubblueSortAlgointhm);
        VeryComplexService business2 = new VeryComplexService(quicksortAlgointhm);
    }
}
