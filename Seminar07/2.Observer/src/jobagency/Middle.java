package jobagency;

public class Middle implements Observer{
    String name;
    int salary;

    public Middle(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (salary > this.salary && salary > 50){
            System.out.println(String.format("Middle %s: I ready for this work! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        }
        else{
            System.out.println(String.format("Middle %s: I'll waiting for better offer! (company, salary) = %s, %d", name, nameCompany, salary));
        }


    }
}
