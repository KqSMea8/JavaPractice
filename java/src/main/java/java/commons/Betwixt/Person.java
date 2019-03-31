package java.commons.Betwixt;

public class Person{
        private String name;  
        private int age;  
        /** Need to allow scala.bean to be created via reflection */
        public Person() {
        }  
        public Person(String name, int age) {
            this.name = name;  
            this.age = age;  
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //省略set, get方法
        public String toString() {  
            return "PersonBean[name='" + name + "',age='" + age + "']";  
        }  
    }  