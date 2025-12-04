package LESSON6;

public class MyNews {
    public static void main(String[] args) {
        //insert
        News news = new News(1, "Long", "28/07/2004", "JAVA", "Student", 1.5f);
        System.out.println(news);
        news.Display();
        int[] Rates={1,2,3};
        news.setRates(Rates);
        float test=news.Calculate();
        System.out.println("Test: "+test);
    }
}
