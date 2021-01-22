int sb(int arr[], int n, int x)
{
    // Your code goes here  
    int sum=0,min=n+1;
    int start=0,end=0;
    while(end<n){
        while(sum<=x && end<n){
            sum= sum+arr[end++];
            while(sum> x && start<n){
                if(end - start < min){
                    min=end-start;
                }
            sum= sum-arr[start++];
                
            }
        }
    }
    return min;
    
}
