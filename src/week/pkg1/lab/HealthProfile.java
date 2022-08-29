package week.pkg1.lab;

public class HealthProfile {
        private char name;
        private int age;
        private int weight;
        private int height;

        //setters
        private void setName(char name) {
            this.name = name;
        }

        private void setAge(int age) {
            this.age = age;
        }

        private void setWeight(int weight) {
            this.weight = weight;
        }

        private void setHeight(int feet, int inches) {
            this.height = ((feet / 12) + inches);
        }

}
