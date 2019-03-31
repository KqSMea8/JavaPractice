package java.list;

import java.util.Objects;

public class Result {
    String word;
    Integer count;

    public Result(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(word, result.word) &&
                Objects.equals(count, result.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, count);
    }

    @Override
    public String toString() {
        return "Result{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}