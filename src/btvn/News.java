package btvn;

import assignment5.INewsInterface;

import java.util.Arrays;
import java.util.OptionalDouble;

public class News implements INewsInterface {
    public int ID;
    public String Title,PublishDate,Author, Content;
    public float AverageRate;
    public int[] RateList = new int[3];

    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public String toString() {
        return "News{" +
                "ID=" + ID +
                ", Title='" + Title + '\'' +
                ", PublishDate='" + PublishDate + '\'' +
                ", Author='" + Author + '\'' +
                ", Content='" + Content + '\'' +
                ", AverageRate=" + AverageRate +
                '}';
    }

    @Override
    public void Display() {

        System.out.println(this.toString());

    }
    public OptionalDouble Calculate(){
       return Arrays.stream(RateList).average();

    }
}
