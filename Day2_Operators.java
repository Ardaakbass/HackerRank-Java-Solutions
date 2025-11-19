// 1. Calculate the tip amount
// We divide by 100.0 to ensure the result is a 'double' (decimal number), not an integer.
double tip_amount = meal_cost * (tip_percent / 100.0);

// 2. Calculate the tax amount
double tax_amount = meal_cost * (tax_percent / 100.0);

// 3. Calculate the total cost by adding meal cost, tip, and tax
double total_cost = meal_cost + tip_amount + tax_amount;

// 4. Round the total cost to the nearest integer using Math.round()
// Then, cast (convert) the result to an 'int' type because the output requires an integer.
int final_cost = (int) Math.round(total_cost);

// 5. Print the final result to the console
System.out.println(final_cost);
