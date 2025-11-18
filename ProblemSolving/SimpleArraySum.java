// Initialize variable to hold the total sum. Using 'int' as required by the function return type.
        int totalSum = 0;

        // Iterate through each element (number) in the input array/list 'ar'.
        for (int element : ar) {
            // Add the current element's value to the running total.
            totalSum += element;
        }

        // Return the final sum after the loop finishes.
        return totalSum;
