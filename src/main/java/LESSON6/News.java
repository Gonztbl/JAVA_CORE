package LESSON6;

import java.util.Arrays;

public class News implements INews {
    private int ID;
    private String title;
    private String PublishDate;
    private String Author;
    private String Content;
    private Float AverageRate;
    private int[] Rates = new int[3];

    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, Float averageRate) {
        this.ID = ID;
        this.title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public Float getAverageRate() {
        return AverageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public int[] getRates() {
        return Rates;
    }

    public void setRates(int[] rates) {
        Rates = rates;
    }
    @Override
    public String toString() {
        return "News{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", PublishDate='" + PublishDate + '\'' +
                ", Author='" + Author + '\'' +
                ", Content='" + Content + '\'' +
                ", AverageRate=" + AverageRate +
                '}';
    }

    @Override
    public void Display() {
        System.out.println("Thong tin");
        System.out.println(ID);
        System.out.println(title);
        System.out.println(PublishDate);
        System.out.println(Author);
        System.out.println(Content);
        System.out.println(AverageRate);
    }

    @Override
    public float Calculate() {
        int sum = 0;
        for (int rate : Rates) {
            sum += rate;
        }
        this.AverageRate=(float)sum/Rates.length;
        return this.AverageRate;
    }
}
