// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? = orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int = customers.flatMap { it.orders.flatMap { it.products } }.count { it.equals(product) }
