public static int birthdayCakeCandles(List<Integer> candles) {
        // 1. Initialize variables
        int count = 0;
        int max = 0;

        // 2. Iterate through each candle
        for(int mum : candles){
            // Scenario A: Found a new tallest candle
            if(mum > max){
                max = mum;
                count = 1; // Reset count for the new max
            } 
            // Scenario B: Found another candle of the same height
            else if(mum == max){
                count++;   // Increment count
            }
        }
        
        // 3. Return the total count of tallest candles
        return count;
    }
