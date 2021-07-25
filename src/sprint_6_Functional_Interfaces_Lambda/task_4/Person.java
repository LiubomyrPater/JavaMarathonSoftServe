package sprint_6_Functional_Interfaces_Lambda.task_4;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    DecisionMethod goShopping = (product, discount) -> product.equals("product1") && discount > 10;
}
