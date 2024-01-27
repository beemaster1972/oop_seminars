package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.setName("Barsik");
//        cat1.setColor("Grey");
//        cat1.setAge(2);
//        System.out.printf("Кот по кличке %s окрас %s возраст %d лет%n", cat1.getName(),cat1.getColor(),cat1.getAge());
        Vector3D a = new Vector3D("a",10);
        Vector3D b = new Vector3D("b", 15,5,3);
        System.out.printf("Вектор %s%n",a);
        System.out.printf("Вектор %s%n",b);
        System.out.printf("|%s x %s| = %.2f%n",a.getName(),b.getName(),a.getScalarProduct(b));
        System.out.printf("%s x %s = %s%n",a.getName(),b.getName(),a.getVectorProduct(b));
        System.out.printf("cos(<%s%s)=%.2f%n",a.getName(),b.getName(),a.getCosAngle(b));
        System.out.printf("%s + %s = %s%n",a.getName(),b.getName(),a.getAdd(b));
        System.out.printf("%s - %s = %s%n",a.getName(),b.getName(),a.getSub(b));
    }
}