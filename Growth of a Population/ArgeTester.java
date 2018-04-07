public class ArgeTester{
    public static void main(String[] args){
        System.out.println("[Test1] nb_year(1000, 2, 50, 1200)\nOutput: " + Arge.nbYear(1000, 2, 50, 1200) + "\nExpected: 3\n");
        System.out.println("[Test2] nb_year(1500, 5, 100, 5000)\nOutput: " + Arge.nbYear(1500, 5, 100, 5000) + "\nExpected: 15\n");
        System.out.println("[Test3] nb_year(1500000, 2.5, 10000, 2000000)\nOutput: " + Arge.nbYear(1500000, 2.5, 10000, 2000000) + "\nExpected: 10\n");
        System.out.println("[Test4] nb_year(5000, 12, 8000, 1000000)\nOutput: " + Arge.nbYear(5000, 12, 8000, 1000000) + "\nExpected: 24\n");
    }
}