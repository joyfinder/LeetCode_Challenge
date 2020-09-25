    public String largestNumber(int[] nums) {
        
        int l = nums.length;
        String[] arr = new String[l];
        
        // Converting numbers from Integer array into String array
        for(int i = 0; i < l; i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }
        
        // Sorting numbers in a descending order
        // for the convenience of appending numbers in the string
        Arrays.sort(arr, new Comparator<String>()
                    {
                        public int compare(String a, String b)
                        {
                            return (b + a).compareTo(a+b);
                        }
                    });
        
        // After sorted out
        // Appending the numbers
        StringBuilder str = new StringBuilder();
        for(String s: arr)
        {
            str.append(s);
        }
        
        while(str.length() > 1 && str.charAt(0) == '0')
        {
            str.deleteCharAt(0);
        }
        
        return str.toString();
    }