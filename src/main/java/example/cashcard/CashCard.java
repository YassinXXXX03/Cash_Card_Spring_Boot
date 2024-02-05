package example.cashcard;

record CashCard(Long id, Double amount) {
    /*
    In Java, a record is a special type of class that was introduced in Java 14 as
    a preview feature and became standard in Java 16. It is used to model plain data
    aggregates with final fields, where the primary purpose is to communicate that data.

    * Conciseness: You don't need to manually write constructors,
     equals(), hashCode(), toString(), and getter methods.
     * Immutability: The fields are final and the record class is final by default.

    */

}

