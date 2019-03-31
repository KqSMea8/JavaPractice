package java.queue;

class Student implements Comparable{
    private int score;
    private String name;
    
    public Student(int age,String name){
        this.score=age;
        this.name=name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "姓名："+name+"-"+score+"分";
    }

    @Override
    public int compareTo(Object o) {
        Student current=(Student)o;
        if(current.getScore()>this.score){
            return 1;
        }else if(current.getScore()==this.score){
            return 0;
        }
        return -1;
    }
}