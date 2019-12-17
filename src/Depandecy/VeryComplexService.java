package Depandecy;

public class VeryComplexService {
    private SortAlgorithm sortAlgorithm;
    public VeryComplexService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public void complexBusiness(int[] arr) {
        sortAlgorithm.sort(arr);
    }
}
