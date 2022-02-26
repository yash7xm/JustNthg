class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1=nums1.length;
        int len2 = nums2.length;
        int min = len1<len2?len1:len2;
        ArrayList<Integer> list= new ArrayList<Integer>(min);
        
        for(int i=0;i<min;i++){
            if(len1<len2){
                    int t=nums1[i];
                    int s=0;
                    int e=len2-1;
                    while(s<=e){
                        int m=s + (e-s)/2;
                        if(t==nums2[m]){
                            list.add(nums2[m]);
                        }
                        if(t<nums2[m]){
                            e=m-1;
                        }
                        else{
                            s=m+1;
                        }
                    }
            }
            else{
                    int t=nums2[i];
                    int s=0;
                    int e=len1-1;
                    while(s<=e){
                        int m=s + (e-s)/2;
                        if(t==nums1[m]){
                            list.add(nums1[m]);
                        }
                        if(t<nums1[m]){
                            e=m-1;
                        }
                        else{
                            s=m+1;
                        }
                    }
            }
            
        }
        int[] arr= new int[list.size()];
        
        for(int i=0;i<list.size();i++){
                arr[i]=list.get(i);
        }
        ArrayList<Integer> list1= new ArrayList<>(arr.length);
       Arrays.sort(arr);
         for (int i = 0; i < arr.length - 1; i++)
      {
	if (arr[i] != arr[i + 1])
	  {
	    list1.add (arr[i]);
	  }
      }
    list1.add (arr[arr.length - 1]);
        
         int[] arr1= new int[list1.size()];
        
        for(int i=0;i<list1.size();i++){
                arr1[i]=list1.get(i);
        }
        return arr1;
        
    }
}
