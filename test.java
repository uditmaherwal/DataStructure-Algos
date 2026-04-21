class test {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        int ptr1 = 0;
        int ptr2 = 0;
        int totalElements = nums1.length + nums2.length;
        int count = 0;
        int[] mergedArray = new int[(totalElements / 2) + 1];
        int mergedArrayLength = mergedArray.length;
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (count != mergedArrayLength) {
                if (nums1[ptr1] < nums2[ptr2]) {
                    mergedArray[count] = nums1[ptr1];
                    ptr1++;
                    count++;
                } else {
                    mergedArray[count] = nums2[ptr2];
                    ptr2++;
                    count++;
                }
            }
            break;
        }

        System.err.println(mergedArray[mergedArrayLength - 1]);
        System.err.println(mergedArray[mergedArrayLength - 2]);
        double res = totalElements % 2 == 0 ? (mergedArray[mergedArrayLength] + mergedArray[mergedArrayLength - 1]) / 2
                : mergedArray[count];

        System.out.print(res);

    }
}