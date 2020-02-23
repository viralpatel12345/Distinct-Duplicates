class DisctinctDuplicate
{
    public static void main(String args[])
    {
          int arr[] = {1,2,2,3,5,5,7,7};
          int dd[] = new int[50]; 
          int count=0,k=0; 
          for(int i=0;i<arr.length-1;i++)
          {   count=0; 
              for(int j=i+1;j<arr.length;j++)
              { 
                  if(arr[i]==arr[j])
                  {
                      count++; 
                  }
              }
              if(count==1)
              {
                  dd[k]=arr[i];
                  k++;   
              }  
          }
          System.out.print("Array of Distinct Elements : ");
          for(int p=0;p<k;p++)
          {
              System.out.print(dd[p]+" "); 
          }  
           
    }
}

/*
   OUTPUT 
   ------

   Array of Distinct Elements : 2 5 7

*/