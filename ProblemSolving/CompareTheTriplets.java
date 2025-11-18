// Function to compare Alice's and Bob's ratings and determine comparison points.
public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Initialize score counters for both Alice and Bob.
    int aliceScore = 0;
    int bobScore = 0;

    // Loop through the three categories (indices 0, 1, and 2).
    for (int i = 0; i < 3; i++) {
        
        // If Alice's score is higher
        if (a.get(i) > b.get(i)) {
            aliceScore++;
        } 
        // If Bob's score is higher
        else if (a.get(i) < b.get(i)) {
            bobScore++;
        }
        // If scores are equal, no points are awarded (we don't need an 'else').
    }

    // Create a new list to hold the final scores [Alice's score, Bob's score].
    List<Integer> result = new ArrayList<>();
    result.add(aliceScore);
    result.add(bobScore);

    // Return the result list.
    return result;
}
