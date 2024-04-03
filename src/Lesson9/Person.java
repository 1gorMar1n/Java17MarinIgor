package Lesson9;
    public class Person {
        protected static String name;
        protected static int age;
        protected static int height;

        Person(String myName, int myAge, int myHeight){
            name = myName;
            age = myAge;
            height = myHeight;
        }

        public void setName(String myName) {
            this.name = myName;
            for(int i=0;i < name.length();){
                if(i > 2){
                    System.out.println(myName);
                }else if(i<2){}
                System.out.println("Incorrect name");
            }
        }

        public void setAge(int myAge) {
            this.age = myAge;
            if(age > 0 && age < 100){
                System.out.println(myAge);
            }else if(age < 0 && age > 100){
                System.out.println("Age incorrect");
            }
        }

        public void setHeight(int myHeight) {
            this.height = myHeight;
            if(height > 120 && height < 220){
                System.out.println(myHeight);
            } else if(height < 120 && height > 220){
                System.out.println("Incorrect height");
            }
        }
        protected static void printPersonInfo(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(height);
        }
    }
